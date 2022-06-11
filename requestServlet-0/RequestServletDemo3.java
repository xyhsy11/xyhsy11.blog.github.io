package com.thomas.request;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;
import java.util.Set;

@WebServlet("/requestServletDemo3")
public class RequestServletDemo3 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String userName = request.getParameter("username");
        String pwd = request.getParameter("pwd");
        System.out.println(userName + pwd);
        request.setAttribute("msg",userName);
        if("HSY".equals(userName) && "12345".equals(pwd)){

            request.getRequestDispatcher("/successServlet").forward(request,response);

        }else{
            request.getRequestDispatcher("/failureServlet").forward(request,response);

        }



    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);

    }
}
