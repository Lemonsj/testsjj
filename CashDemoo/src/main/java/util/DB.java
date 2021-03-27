package util;




import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


/**
 * Created with IntelliJ IDEA
 * Description:
 * User: 孙洁
 * Date: 2021-03-26
 * Time: 22:57
 **/
public class DB {
    private static DataSource dataSource;

    static{
        MysqlDataSource mysqlDataSource = new MysqlDataSource();
        mysqlDataSource.setServerName("127.0.0.1");
        mysqlDataSource.setPort(3306);
        mysqlDataSource.setUser("root");
        mysqlDataSource.setPassword("123456");
        mysqlDataSource.setServerName("cash");
        mysqlDataSource.setUseSSL(false);
        mysqlDataSource.setCharacterEncoding("utf-8");

        dataSource = mysqlDataSource;
    }

    public static Connection getConnection(boolean autocommit) throws SQLException {
        Connection connection =  dataSource.getConnection();
        connection.setAutoCommit(autocommit);
        return connection;
    }

    public static void close(Connection con, PreparedStatement ps, ResultSet rs){
        try{
            if(rs != null) {
                rs.close();
            }
            if(ps != null) {
                ps.close();
            }
            if(con != null) {
                con.close();
            }
        }catch(SQLException e) {
            e.printStackTrace();
        }
    }

}
