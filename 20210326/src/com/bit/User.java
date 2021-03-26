package com.bit;

import javax.servlet.ServletException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.*;

/**
 * Created with IntelliJ IDEA
 * Description:
 * User: 孙洁
 * Date: 2021-03-26
 * Time: 12:21
 **/
public class User {
    int id;
    String username;

    public User(int id,String username) {
        this.id = id;
        this.username = username;
    }

    public static User insert(String username,String password) throws ServletException {
        password = encrypted(password);
        try(Connection connection = DB.getConnection()) {
            String sql = "INSERT INTO users(username,password) VALUES(?,?)";
            try(PreparedStatement stmt = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
                stmt.setString(1,username);
                stmt.setString(2,password);

                stmt.executeUpdate();

                try(ResultSet rs = stmt.getGeneratedKeys()) {
                    if(rs.next()) {
                        int id = rs.getInt(1);
                        return new User(id,username);
                    }
                }
            }
        } catch (SQLException e) {
            throw new ServletException(e);
        }

        return null;
    }

    private static String encrypted(String password) {
        try{
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            byte[] input = password.getBytes();
            byte[] output = messageDigest.digest(input);

            StringBuilder sb = new StringBuilder();

            for(byte b : output) {
                sb.append(String.format("%02x",b));
            }

            return sb.toString();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return password;
        }
    }

    public static User getByUsernameAndPassword(String username, String password) throws ServletException {
        password = encrypted(password);
        try(Connection connection = DB.getConnection()) {
            String sql = "SELECT id FROM users WHERE username = ? AND password = ?";

            try(PreparedStatement stmt = connection.prepareStatement(sql)) {
                stmt.setString(1,username);
                stmt.setString(2,password);

                try(ResultSet rs = stmt.executeQuery()) {
                    if(rs.next()) {
                        int id = rs.getInt(1);
                        return new User(id,username);
                    }
                }
            }
        } catch (SQLException e) {
            throw new ServletException(e);
        }
        return null;
    }
}
