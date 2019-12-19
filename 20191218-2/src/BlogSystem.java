import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BlogSystem {
    private static Connection connection;
    static {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(
                    "jdbc:mysql://127.0.0.1:3306/java20?useSSL=false",
                    "root",
                    ""

            );

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

}
