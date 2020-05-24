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
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/LogInServlet")
public class LogInServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String email = request.getParameter("usermail");
        String password = request.getParameter("userpassword");
        EmailValidator emailValidator = new EmailValidator();
        boolean validate_mail = emailValidator.isEmailValid(email);
        if (validate_mail) {
            CheckUser checkUser = new CheckUser();
            if (checkUser.checkEmail(email)) {
                if (checkUser.checkPassword(email, password)) {

                    // Here user goes to the next step (if login and password are valid)
                    User userForHttpSession = new CreateUser().getUser(email);
                    request.getSession().setAttribute("actual_user", userForHttpSession);
                    request.getSession().setAttribute("message_with_name_of_user", "You signed as ");
                    request.getSession().setAttribute("message_for_logout"," Logout");
                    request.getRequestDispatcher("/jsp/order_page.jsp").forward(request, response);

                } else {
                    request.setAttribute("invalid_password_message", "password is invalid for user " + email + ", please try again");
                    request.getRequestDispatcher("/jsp/login_page.jsp").forward(request, response);
                }
            } else {
                request.setAttribute("new_user_email",email);
                request.getRequestDispatcher("/jsp/register_user.jsp").forward(request, response);
            }
            ;
        } else {
            request.setAttribute("invalid_email_message", "e-mail " + email + " is invalid, please try again");
            request.getRequestDispatcher("/jsp/login_page.jsp").forward(request, response);
        }
    }

}
