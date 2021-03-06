package com.taxi.servlets;

import com.taxi.workwith_db.ConnectDB;
import com.taxi.workwith_db.CreateTables;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "CreateTablesServlet")
public class CreateTablesServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ConnectDB connectDB = new ConnectDB();
        CreateTables createTables = new CreateTables(connectDB);
        createTables.Create();
        connectDB.stop();
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<h3>Tables created</h3>");

    }
}
