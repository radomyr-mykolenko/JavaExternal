package com.taxi.servlets;

import com.taxi.model.User;
import com.taxi.model.helpers.EmailValidator;
import com.taxi.workwith_db.ConnectDB;
import com.taxi.workwith_db.CreateUser;
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

        String email = request.getParameter("usermail");
        String name = request.getParameter("username");
        String password = request.getParameter("userpassword");

        try {
            String SQL_query;

            SQL_query = "INSERT INTO user (name, email, password) VALUES ('" + name +
                    "','" + email + "','" + password + "');";
            ConnectDB connectDB = new ConnectDB();
            QueryUpdate queryUpdate = new QueryUpdate(connectDB);
            queryUpdate.execute(SQL_query);
            connectDB.stop();
            User userForHttpSession = new CreateUser().getUser(email);
            request.getSession().setAttribute("actual_user", userForHttpSession);
            String language = request.getParameter("lang");
            if (language.equals("eng")) {
                request.getSession().setAttribute("message_with_name_of_user", "You signed as ");
                request.getSession().setAttribute("message_for_logout"," Logout");
            }
            if (language.equals("ukr") ){
                request.getSession().setAttribute("message_with_name_of_user", "Ви увійшли як ");
                request.getSession().setAttribute("message_for_logout"," Вийти");
            }
            //request.getSession().setAttribute("message_with_name_of_user", "You signed as ");
            //request.getSession().setAttribute("message_for_logout"," Logout");

            getServletContext().getRequestDispatcher("/jsp/order_page.jsp").forward(request, response);


        } catch (SQLException e) {
            request.setAttribute("type_of_error", "with SQL");
            getServletContext().getRequestDispatcher("/jsp/error_page.jsp").forward(request, response);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/GetIndexPageServlet").forward(request, response);
    }
}
