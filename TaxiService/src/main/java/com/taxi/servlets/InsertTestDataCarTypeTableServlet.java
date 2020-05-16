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

@WebServlet(name = "InsertTestDataCarTypeTableServlet")
public class InsertTestDataCarTypeTableServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ConnectDB connectDB = new ConnectDB();
        QueryUpdate queryUpdate = new QueryUpdate(connectDB);
        queryUpdate.execute(SqlQueries.INSERT_TEST_VALUES_INTO_CAR_TYPE_TABLE);
        connectDB.stop();
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<h3>Test data to table car_type inserted</h3>");
    }
}
