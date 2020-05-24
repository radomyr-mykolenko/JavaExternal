package com.taxi.servlets;

import com.taxi.model.User;
import com.taxi.model.helpers.EmailValidator;
import com.taxi.workwith_db.CheckUser;
import com.taxi.workwith_db.CreateUser;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/LogInServlet")
public class LogInServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        EmailValidator emailValidator = new EmailValidator();
        boolean validate_mail = emailValidator.isEmailValid(request.getParameter("usermail"));
        if (validate_mail) {
            CheckUser checkUser = new CheckUser();
            if (checkUser.checkEmail(request.getParameter("usermail"))) {
                if (checkUser.checkPassword(request.getParameter("usermail"), request.getParameter("userpassword"))) {
                    // Here user goes to the next step (if login and password are valid)
                    User user = new CreateUser().getUser(request.getParameter("usermail"));
                    System.out.println(user.toString());
                    request.getRequestDispatcher("/jsp/order_page.jsp").forward(request, response);

                } else {
                    request.setAttribute("invalid_password_message", "password is invalid for user" + request.getParameter("usermail") + ", please try again");
                    request.getRequestDispatcher("/jsp/login_page.jsp").forward(request, response);
                }
            } else {
                request.getRequestDispatcher("/jsp/register_user.jsp").forward(request, response);
            }
            ;
        } else {
            request.setAttribute("invalid_email_message", "e-mail " + request.getParameter("usermail") + " is invalid, please try again");
            request.getRequestDispatcher("/jsp/login_page.jsp").forward(request, response);
        }
    }

}
