import java.sql.*;
import java.util.ArrayList;
import java.util.List;

//import com.mysql.jdbc.Driver;
public class Main {
    public static void main1(String[] args) throws ClassNotFoundException, SQLException {
        //1.注册Driver
        Class.forName("com.mysql.jdbc.Driver");
        //2.获取连接
        //cmd mysql -uroot -p<数据库的密码>
        String url = "jdbc:mysql://127.0.0.1:3306/java20?useSSL = false&characterEncoding=utf8";
        String user = "root";//链接mysql的用户名
        String password = "";//连接mysqlde密码
        Connection connection = DriverManager.getConnection(url,user,password);
        //3.获取语句statement
        //*Statement statement = connection.createStatement();*//*


        //插入一些数据，供select用
        {
            Statement statement = connection.createStatement();
            String sql = "INSERT INTO users(id,name) VALUES (1,'陈沛鑫'),(2,'高博'),(3,'李万山')";
            statement.executeUpdate(sql);
            statement.close();

        }
        //执行select语句
        {
            Statement statement = connection.createStatement();
            String sql = "SELECT id,name FROM users";
            ResultSet resultSet = statement.executeQuery(sql);
            List<String> nameList = new ArrayList<>();
            while(resultSet.next()) {
                /*int r = resultSet.getInt();
                long c = resultSet.getLong();
                String d = resultSet.getNString();*//*
                /*int id = resultSet.getInt(1) 下标从1开始*/
                int id = resultSet.getInt(1);
                String name = resultSet.getString("name");
                //结果集马上要销毁，所以通过List保存结果
                nameList.add(name);
                System.out.println(id + ", " + name);
            }
            resultSet.close();
            statement.close();

        }
        //4.执行一条SELECT DATABASE()

        /*INSERT
        String sql = "INSERT INTO users(id,name) VALUES(1,'陈沛鑫')";
        statement.executeUpdate(sql);//通过 statement 对象来执行 SQL 语句
        /*

        /*UPDATE
        String sql = "UPDATE users SET name = '高博' where id = 1";
        statement.executeUpdate(sql);
        */

        /*DELETE
        String sql = "DELETE FROM users WHERE id = 1";
        statement.executeUpdate(sql);*/

        //SELECT

        /*statement.close();
        connection.close();*/
        connection.close();
    }

}











/*
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");

        String url = "jdbc:mysql://127.0.0.1:3306/java20?useSSL=false&characterEncoding=utf8";
        String user = "root"; // 杩炴帴 mysql 鐨勭敤鎴峰悕
        String password = ""; // 杩炴帴 mysql 鐨勫瘑鐮�
        Connection connection = DriverManager.getConnection(
                url, user, password
        );

        // 鎻掑叆涓€浜涙暟鎹紝渚� SELECT 鐢�
        {
            Statement statement = connection.createStatement();
            String sql = "INSERT INTO users (id, name) VALUES (1,'陈沛鑫'),(2,'高博'),(3,'李万山')";
            statement.executeUpdate(sql); // 閫氳繃 statement 瀵硅薄鏉ユ墽琛� SQL 璇彞
            statement.close();
        }

        // 鎵ц SELECT 璇彞
        {
            Statement statement = connection.createStatement();
            String sql = "SELECT id, name FROM users";
            ResultSet resultSet = statement.executeQuery(sql);

            List<String> nameList = new ArrayList<>();
            while (resultSet.next()) {
                */
/*
                闇€瑕佷笉鍚岀殑绫诲瀷锛岃皟鐢ㄤ笉鍚岀殑鏂规硶
                int r = resultSet.getInt();
                long r = resultSet.getLong();
                String r = resultSet.getString();
                *//*


                */
/*
                int id = resultSet.getInt(1);   // 涓嬫爣鏄粠 1 寮€濮嬬殑锛屼笉鏄粠 0 寮€濮嬬殑
                int id = resultSet.getInt("id"); // 閫氳繃瀛楁鍚嶇О鑾峰彇
                 *//*

                int id = resultSet.getInt(1);
                String name = resultSet.getString("name");
                // 缁撴灉闆嗛┈涓婇渶瑕侀攢姣侊紝鎵€浠ラ€氳繃 List 淇濆瓨缁撴灉
                nameList.add(name);

                System.out.println(id + ", " + name);
            }

            resultSet.close();

            statement.close();
        }
        */
/*
        // INSERT
        String sql = "INSERT INTO users (id, name) VALUES (1, '闄堟矝閼�')";
        statement.executeUpdate(sql); // 閫氳繃 statement 瀵硅薄鏉ユ墽琛� SQL 璇彞
        *//*


        */
/*
        // UPDATE
        String sql = "UPDATE users SET name = '楂樺崥' WHERE id = 1";
        statement.executeUpdate(sql); // 閫氳繃 statement 瀵硅薄鏉ユ墽琛� SQL 璇彞
        *//*


        */
/*
        // Delete
        String sql = "DELETE FROM users WHERE id = 1";
        statement.executeUpdate(sql); // 閫氳繃 statement 瀵硅薄鏉ユ墽琛� SQL 璇彞
        *//*


        connection.close();
    }
}


*/
