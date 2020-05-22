package servlet;

import entity.Account;
import entity.Goods;
import entity.Order;
import util.DBUtil;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA
 * Description:
 * User: 孙洁
 * Date: 2020-05-20
 * Time: 19:26
 **/
@WebServlet("/pay")
public class ReadyBuyServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");

        resp.setContentType("text/html; charset=utf-8");

        String goodsIDandNum = req.getParameter("goodsIDandNum");
        //1-8,2-5

        //因为货物较多，那么货物需要用list保存
        List<Goods> goodsList = new ArrayList<>();
        String[] string1 = goodsIDandNum.split(",");

        for(String s1 : string1) {
            //1-8
            String[] string2 = s1.split("-");
            //查找货物是否存在

            Goods goods = getGoods(Integer.valueOf(string2[0]));
            if(goods != null) {
                goods.setBuyGoogsNum(Integer.valueOf(string2[1]));
                goodsList.add(goods);
            }

            //创建订单
            Order order = new Order();
            order.setId(String.valueOf(System.currentTimeMillis()));
            HttpSession session = req.getSession();
            Account account = (Account) session.getAttribute("user");
            order.setAccount_id(account.getId());
            order.setAccount_name(account.getUsername());


            //
            DateTimeFormatter formatter = DateTimeFormatter.

        }
    }
    //功能：找到商品
    public Goods getGoods(int goodsId) {
        Connection connection = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        Goods goods = null;

        try{
            String sql = "select * from goods where id =?";
            connection = DBUtil.getConnection(true);
            ps = connection.prepareStatement(sql);
            ps.setInt(1,goodsId);

            rs = ps.executeQuery();

            if(rs.next()){
                goods = new Goods();
                goods.setId(rs.getInt("id"));
                goods.setName(rs.getString("name"));
                goods.setIntroduce(rs.getString("introduce"));
                goods.setStock(rs.getInt("stock"));
                goods.setUnit(rs.getString("unit"));
                goods.setPrice(rs.getInt("price"));
                goods.setDiscount(rs.getInt("discount"));
            }

        }catch(SQLException e) {
            e.printStackTrace();
        }finally{
            DBUtil.close(connection,ps,null);
        }
        return goods;
    }
}
