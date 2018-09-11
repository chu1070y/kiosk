package org.zerock.web;

import org.zerock.domain.MenuVO;
import org.zerock.domain.OrderVO;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(urlPatterns = "/kiosk")
public class KioskController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

//        req.getServletContext().setAttribute("password","12345678");//kiosk를 먼저 불러오면 모든 application에 패스워드가 공유된다.

        //로그인 안했으면 로그인 하도록 시키는 코드
        if(req.getSession().getAttribute("member") == null){
            resp.sendRedirect("/login");
            return;
        }

        RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/menuList.jsp"); //web-inf 폴더에 접근할 수 있게 된다.
        dispatcher.forward(req,resp);// forward는 req와 resp를 전달하는 역할


    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String[] ord = req.getParameterValues("ord");

        List<OrderVO> orderVOList = new ArrayList<OrderVO>();

        for(String str: ord){
            OrderVO vo = new OrderVO(str);
            if (vo.getQty()==0){continue;}
            orderVOList.add(vo);
        }

        req.getServletContext().setAttribute("orderList",orderVOList);

        RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/orderResult.jsp"); //web-inf 폴더에 접근할 수 있게 된다.
        dispatcher.forward(req,resp);// forward는 req와 resp를 전달하는 역할


    }
}
