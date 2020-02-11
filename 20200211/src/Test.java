import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //注册Driver
        Class.forName("com.mysql.jdbc.Driver");
        //2.获取连接
        String url = "jdbc:mysql://127.0.0.1:3306/java20?useSSL=false&characterEncoding=utf8";
        String user = "root";
        String password = "";
        Connection connection = DriverManager.getConnection(url,user,password);

        //获取statement语句
        //Statement statement = connection.createStatement();

//        //注册
//        Class.forName("com.mysql.jdbc.Driver");
//        //获取连接
//        String url = "jdbc:mysql://127.0.0.1:3306/java20?useSSL = false&characterEncoding = utf8";
//        String user = "root";
//        String password = "";
//        Connection connection = DriverManager.getConnection(url,user,password);
        //获取Statement语句
        /*{
            Statement statement = connection.createStatement();
            String sql = "INSERT INTO users(id,name) VALUES(1,'陈沛鑫'),(2,'高博'),(3,'李万山')";
            statement.executeUpdate(sql);
            statement.close();
        }*/

        {
            Statement statement = connection.createStatement();
            String sql = "SELECT id,name FROM users";
            ResultSet resultSet = statement.executeQuery(sql);
            List<String> namelist = new ArrayList<>();
            while(resultSet.next()) {
                int id = resultSet.getInt(1);
                String name = resultSet.getString("name");
                namelist.add(name);
                System.out.println(id + ","+ name);
            }
            resultSet.close();
            statement.close();
        }
        connection.close();;
    }
}

