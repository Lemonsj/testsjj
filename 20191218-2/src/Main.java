import java.sql.Connection;
import java.sql.DriverManager;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = DriverManager.getConnection(
                "jdbc:mysql://127.0.0.1:3306/java20?useSSL=false";
                "root",
                 ""
        );
    }
}
//open modle settings