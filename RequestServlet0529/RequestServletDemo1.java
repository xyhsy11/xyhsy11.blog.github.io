package com.thomas.request;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;

@WebServlet("/requestServletDemo1")
public class RequestServletDemo1 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        BufferedReader br = request.getReader();
        String line = null;

        while((line = br.readLine())!= null){
            System.out.println(line);
        }



    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      /*  String method = request.getMethod();
        String contextPath = request.getContextPath();
        String servletPath = request.getServletPath();
        String queryString = request.getQueryString();
        String requestURI = request.getRequestURI();
        String remoteAddr = request.getRemoteAddr();

        System.out.println("method " + method);
        System.out.println("contextPath " + contextPath);
        System.out.println("servletPath " + servletPath);
        System.out.println("queryString " + queryString);
        System.out.println("requestURI " + requestURI);
        System.out.println("remoteAddr " + remoteAddr);*/




        /** 方法：
         1. 获取请求方式 ：GET
         * String getMethod()
         2. (*)获取虚拟目录：/day14
         * String getContextPath()
         3. 获取Servlet路径: /demo1
         * String getServletPath()
         4. 获取get方式请求参数：name=zhangsan
         * String getQueryString()
         5. (*)获取请求URI：/day14/demo1
         * String getRequestURI():  /day14/demo1
         * StringBuffer getRequestURL()  :http://localhost/day14/demo1

         * URL:统一资源定位符 ： http://localhost/day14/demo1 中华人民共和国
         * URI：统一资源标识符 : /day14/demo1     共和国

         6. 获取协议及版本：HTTP/1.1
         * String getProtocol()

         7. 获取客户机的IP地址：
         * String getRemoteAddr()*/
    }
}
