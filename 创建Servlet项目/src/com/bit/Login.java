package com.bit;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created with IntelliJ IDEA
 * Description:
 * User: 孙洁
 * Date: 2020-09-27
 * Time: 19:23
 **/
public class Login extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");

        //设置HTTP响应的Content-Type Header
        resp.setContentType("text/plain; charset=utf-8");
        PrintWriter writer = resp.getWriter();

        //验证用户名和密码是否正确
        if(username != null
                && username.equals("Carol")
                && password != null
                && password.equals("gogogo")){
            writer.println("登陆成功");
            System.out.println("登陆成功");
        }else {
            writer.println("登陆失败");
            System.out.println("登陆失败");
        }
    }
}
