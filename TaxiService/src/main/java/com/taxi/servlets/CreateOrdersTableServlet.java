package com.taxi.servlets;

import com.taxi.workwith_db.ConnectDB;
import com.taxi.workwith_db.Create;
import com.taxi.workwith_db.SqlQueries;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "CreateOrdersTableServlet")
public class CreateOrdersTableServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ConnectDB connectDB = new ConnectDB();
        Create create = new Create(connectDB);
        create.execute(SqlQueries.CREATE_ORDERS_TABLE);
        connectDB.stop();
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<h3>Table Orders created</h3>");
    }
}
