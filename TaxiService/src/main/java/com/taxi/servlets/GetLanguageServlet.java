package com.taxi.servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/GetLanguageServlet")
public class GetLanguageServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String language = request.getParameter("lang");
        if (language.equals("eng")) {
            request.getSession().setAttribute("language", "en_EN");
        }
        if (language.equals("ukr") ){
            request.getSession().setAttribute("language", "ua_UA");
        }
        request.getRequestDispatcher("/jsp/login_page.jsp").forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
