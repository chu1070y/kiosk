package main.java.org.zerock.web;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(urlPatterns = "/hello")
public class HelloServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        System.out.println("HelloServlet service()...");

        req.setAttribute("msg","안녕세상아...");

        String threadName = Thread.currentThread().getName();
        System.out.println(threadName);

        req.setAttribute("tName",threadName);

        List<String> list = new ArrayList<String>();
        list.add("AAA");
        list.add("BBB");
        list.add("CCC");

        req.setAttribute("list",list);

        RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/hello.jsp"); //web-inf 폴더에 접근할 수 있게 된다.

        dispatcher.forward(req,resp);// forward는 req와 resp를 전달하는 역할



    }
}
