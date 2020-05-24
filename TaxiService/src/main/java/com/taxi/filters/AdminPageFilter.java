package com.taxi.filters;

import com.taxi.model.User;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

import static java.util.Objects.nonNull;

public class AdminPageFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        final HttpServletRequest request = (HttpServletRequest) servletRequest;
        final HttpServletResponse response = (HttpServletResponse) servletResponse;
        final HttpSession session = request.getSession();
        if (nonNull(session)&&!(null==session.getAttribute("actual_user"))) {
            User userFromHttpSession = (User) session.getAttribute("actual_user");
            String email = userFromHttpSession.getEmail();
            if (email.equals("ad@min.com")) {
                ((HttpServletRequest) servletRequest).getSession().setAttribute("admin_role", "go to admin's page");
            }
        } /*else
        {
            servletRequest.getRequestDispatcher("/GetIndexPageServlet").forward(servletRequest, servletResponse);
        }*/
        filterChain.doFilter(servletRequest,servletResponse);
    }

    @Override
    public void destroy() {

    }
}
