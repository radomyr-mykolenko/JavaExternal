package com.taxi.servlets;

import com.taxi.workwith_db.ConnectDB;
import com.taxi.workwith_db.QueryUpdate;
import com.taxi.workwith_db.SqlQueries;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

@WebServlet(name = "InsertTestDataUserTableServlet")
public class InsertTestDataUserTableServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            ConnectDB connectDB = new ConnectDB();

            QueryUpdate queryUpdate = new QueryUpdate(connectDB);
            queryUpdate.execute(SqlQueries.INSERT_TEST_VALUES_INTO_USER_TABLE);
            connectDB.stop();
            response.setContentType("text/html");
            PrintWriter out = response.getWriter();
            out.println("<h3>Test data to table user inserted</h3>");
        } catch (SQLException e) {
            getServletContext().getRequestDispatcher("/jsp/error_page.jsp").forward(request, response);
        }
    }
}
