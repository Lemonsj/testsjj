package servlet;

import entity.Account;
import util.DB;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.Writer;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created with IntelliJ IDEA
 * Description:
 * User: 孙洁
 * Date: 2021-03-27
 * Time: 0:29
 **/
@WebServlet("login")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setContentType("text/html; charset=utf-8");

        String username = req.getParameter("username");
        String password = req.getParameter("password");

        Connection connection = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Writer writer = resp.getWriter();


        try{
            connection = DB.getConnection(true);
            String sql = "select id from account where username=? and password=?";

            stmt = connection.prepareStatement(sql);
            stmt.setString(1,username);
            stmt.setString(2,password);

            rs = stmt.executeQuery();

            Account user = new Account();
            if(rs.next()) {
                Integer id = rs.getInt("id");
                user.setId(id);
                user.setUsername(username);
                user.setPassword(password);
            }

            if(user.getId() == null) {
                writer.write("<h2>没有该用户：" + username + "</h2>");
            }else if(!password.equals(user.getPassword())) {
                writer.write("<h2>密码错误：" + username + "</h2>");
            }else {
                HttpSession session = req.getSession();
                session.setAttribute("user",user);
                writer.write("<h2>登陆成功：" + username + "</h2>");
                resp.sendRedirect("index.html");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            DB.close(connection,stmt,rs);
        }
    }
}
