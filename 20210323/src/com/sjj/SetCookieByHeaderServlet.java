package com.sjj;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created with IntelliJ IDEA
 * Description:
 * User: 孙洁
 * Date: 2021-03-22
 * Time: 21:25
 **/
@WebServlet("/set-cookie-by-header")
public class SetCookieByHeaderServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setHeader("Set-Cookie","username=huacheng");
        resp.setContentType("text/plain; charset=utf-8");
        resp.getWriter().println("Cookoe已种下");
    }
}
