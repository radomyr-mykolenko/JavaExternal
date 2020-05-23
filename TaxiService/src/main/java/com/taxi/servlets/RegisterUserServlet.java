package com.taxi.servlets;

import com.taxi.model.helpers.EmailValidator;
import com.taxi.workwith_db.ConnectDB;
import com.taxi.workwith_db.QueryUpdate;
import com.taxi.workwith_db.SqlQueries;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet("/RegisterUserServlet")
public class RegisterUserServlet extends HttpServlet {


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF8");
        try {
            String SQL_query;
            EmailValidator emailValidator = new EmailValidator();
            boolean validate_mail = emailValidator.isEmailValid(request.getParameter("usermail"));
            if (validate_mail){
            SQL_query = "INSERT INTO user (name, email, password) VALUES ('" + request.getParameter("username") +
                    "','" + request.getParameter("usermail") + "','" + request.getParameter("userpassword") + "');";
            ConnectDB connectDB = new ConnectDB();
            QueryUpdate queryUpdate = new QueryUpdate(connectDB);
            queryUpdate.execute(SQL_query);
            connectDB.stop();
            getServletContext().getRequestDispatcher("/jsp/order_page.jsp").forward(request, response);
            } else {
                request.setAttribute("invalid_email_message","e-mail " + request.getParameter("usermail") + " is invalid, please try again");
                request.getRequestDispatcher("/jsp/register_user.jsp").forward(request,response);
            }

        } catch (SQLException e) {
            request.setAttribute("type_of_error", "with SQL");
            getServletContext().getRequestDispatcher("/jsp/error_page.jsp").forward(request, response);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/GetIndexPageServlet").forward(request, response);
    }
}
