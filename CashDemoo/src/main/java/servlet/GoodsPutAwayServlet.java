package servlet;

import util.DB;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.Writer;
import java.sql.Connection;
import java.sql.ParameterMetaData;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Created with IntelliJ IDEA
 * Description:
 * User: 孙洁
 * Date: 2021-03-27
 * Time: 0:55
 **/
@WebServlet("inbound")
public class GoodsPutAwayServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setContentType("text/html; charset=utf-8");

        String name = req.getParameter("name");
        String stock = req.getParameter("stock");
        String introduce = req.getParameter("introduce");
        String unit = req.getParameter("unit");
        String price = req.getParameter("price");

        double doublePrice = Double.valueOf(price);

        int realPrice = new Double(100*doublePrice).intValue();

        String discount = req.getParameter("discount");

        Connection connection = null;
        PreparedStatement stmt = null;

        Writer writer = resp.getWriter();

        try{
            String sql = "insert into goods(name,introduce,stock,unit,price,discount) values (?,?,?,?,?,?)";
            connection = DB.getConnection(true);
            stmt = connection.prepareStatement(sql);

            stmt.setString(1,name);
            stmt.setString(2,introduce);
            stmt.setInt(3,Integer.valueOf(stock));
            stmt.setString(4,unit);
            stmt.setInt(5,realPrice);
            stmt.setInt(6,Integer.valueOf(discount));

            int ret = stmt.executeUpdate();
            if(ret == 0) {
                writer.write("<h2>商品上架失败</h2>");
            }else{

                writer.write("<h2>商品上架成功</h2>");
                //resp.sendRedirect("index.html");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            DB.close(connection,stmt,null);
        }
    }
}
