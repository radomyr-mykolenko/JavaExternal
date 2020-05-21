package com.taxi.servlets;

import com.taxi.workwith_db.CheckUser;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/LogInServlet")
public class LogInServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        CheckUser checkUser = new CheckUser();
        if (checkUser.check(request.getParameter("usermail"))){
            request.getRequestDispatcher("/jsp/order_page.jsp").forward(request,response);
        } else {
            request.getRequestDispatcher("/jsp/register_user.jsp").forward(request,response);
        };
    }

}
