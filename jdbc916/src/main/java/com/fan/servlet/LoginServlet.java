package com.fan.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by fansen on 2017/9/20.
 */
public class LoginServlet extends HttpServlet {

//    @Override
//    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
////        super.service(req, resp);
////      编写业务处理逻辑
//        String userName = req.getParameter("uname");
//        String passWord = req.getParameter("upwd");
//
//        System.out.println("用户名：" + userName);
//        System.out.println("密码" + passWord);
//    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("---doGet方法-----");
//        String userName = req.getParameter("uname");
//        String passWord = req.getParameter("upwd");
//
//        System.out.println("用户名：" + userName);
//        System.out.println("密码" + passWord);

         doPost(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("---doPost方法-----");

        String userName = req.getParameter("uname");
        String passWord = req.getParameter("upwd");

        System.out.println("用户名：" + userName);
        System.out.println("密--码:" + passWord);
        System.out.println("---doPost方法-----");

    }
}
