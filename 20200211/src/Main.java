import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

import javax.sql.DataSource;
import java.sql.*;
import java.util.Scanner;
public class Main {

    private static final String url = "jdbc:mysql://127.0.0.1:3306/java20_0211?useSSL=false&characterEncoding=utf8";
    private static final String mysqlusename = "root";
    private static final String mysqlpassword = "";
    private static void menu() {
        System.out.println("🐱🐱🐱🐱🐱🐱🐱🐱🐱🐱🐱🐱🐱🐱🐱🐱🐱🐱🐱🐱");
        System.out.println("🐱🐱1.用户注册           2.用户登录🐱🐱");
        System.out.println("🐱🐱🐱🐱🐱🐱🐱3.发表文章🐱🐱🐱🐱🐱🐱🐱🐱");
        System.out.println("🐱🐱4.文章列表页       5.文章详情页🐱🐱");
        System.out.println("🐱🐱🐱🐱🐱🐱🐱🐱🐱🐱🐱🐱🐱🐱🐱🐱🐱🐱🐱🐱");
    }
    private static void Register() throws SQLException {
        Scanner scan = new Scanner(System.in);
        String username = scan.nextLine();
        String password = scan.nextLine();


        /*//连接connection
        Connection con = DriverManager.getConnection(url,mysqlusename,mysqlpassword);
        Statement statement = con.createStatement();
        String sql = String.format("INSERT INTO (username,password)VALUES('%s','%s')",username,password);
        System.out.println(sql);*/

        // 必须把 close 放到 finally 去执行
        /*statement.close();
        con.close();*/

        // 稍有变形：引入了 try-with-resource 的用法
        try (Connection con = DriverManager.getConnection(url, mysqlusename, mysqlpassword)) {
            try (Statement statement = con.createStatement()) {
                String sql = String.format(
                        "INSERT INTO users (username, password) VALUES ('%s', '%s')",
                        username, password
                );
                System.out.println(sql);
                statement.executeUpdate(sql);
            }
        }

        System.out.println("用户注册成功");
    }
    private static void Login() throws SQLException {
        Scanner scan = new Scanner(System.in);
        String username = scan.nextLine();
        String password = scan.nextLine();

        MysqlDataSource mysqlDataSource = new MysqlDataSource();
        mysqlDataSource.setServerName("127.0.0.1");
        mysqlDataSource.setPort(3306);
        mysqlDataSource.setUser("root");
        mysqlDataSource.setPassword("");
        mysqlDataSource.setDatabaseName("java20_0211");
        mysqlDataSource.setCharacterEncoding("utf8");
        DataSource dataSource = mysqlDataSource;
        try(Connection con = dataSource.getConnection()) {

            /*try(Statement statement = con.createStatement()) {


                String sql = String.format(
                        "SELECT id, username FROM users WHERE username = '%s' AND password = '%s'",
                        username, password
                );
                System.out.println(sql);
                try(ResultSet resultSet = statement.executeQuery(sql)) {
                    if(!resultSet.next()) {
                        System.out.println("登陆失败！");
                    }else {
                        int id = resultSet.getInt("id");
                        String usernameInTable = resultSet.getString("username");
                        System.out.println("登录成功: " + id + ", " + usernameInTable);
                    }
                }
            }*/
            String sql = "select id,username from users where username = ? and password = ？";
            try(PreparedStatement statement = con.prepareStatement(sql)) {
                statement.setString(1,username);
                statement.setString(2,password);
                // MySQL Driver 时打印 SQL 的小技巧
                // JDBC 规定中，PrepareStatement 是无法打印填充完占位符后的 SQL
                // PrepareStatement 的实现类 com.mysql.jdbc.PreparedStatement
                // 有个方法 asSql 干这个事情的
                // 利用向下转型完成
                com.mysql.jdbc.PreparedStatement mysqlStatement = (com.mysql.jdbc.PreparedStatement)statement;
                System.out.println(mysqlStatement.asSql());
                try (ResultSet resultSet = statement.executeQuery()) {
                    if (!resultSet.next()) {
                        System.out.println("登录失败");
                    } else {
                        int id = resultSet.getInt("id");
                        String usernameInTable = resultSet.getString("username");
                        System.out.println("登录成功: " + id + ", " + usernameInTable);
                    }
                }
            }
        }


    }
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        Scanner scan = new Scanner(System.in);
        while(true) {
            menu();
            int choice = scan.nextInt();
            scan.nextLine();//把换行读走
            switch(choice) {
                case 1:
                    Register();
                    break;
                case 2:
                    Login();
                    break;
            }
        }
    }
}
