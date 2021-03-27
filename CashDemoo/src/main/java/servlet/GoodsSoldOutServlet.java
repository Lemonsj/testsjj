package servlet;

import util.DB;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Created with IntelliJ IDEA
 * Description:
 * User: 孙洁
 * Date: 2021-03-27
 * Time: 10:56
 **/
@WebServlet("/delGoods")
public class GoodsSoldOutServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setContentType("text/html; charset=utf-8");

        String str = req.getParameter("id");

        Integer id = Integer.valueOf(str);
        Connection connection = null;
        PreparedStatement stmt = null;

        try{
            String sql = "delete from goods where id = ?";
            connection = DB.getConnection(true);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
