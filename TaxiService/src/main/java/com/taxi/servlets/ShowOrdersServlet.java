package com.taxi.servlets;

import com.taxi.model.Cars;
import com.taxi.model.Orders;
import com.taxi.workwith_db.ConnectDB;
import com.taxi.workwith_db.QuerySelect;
import com.taxi.workwith_db.SqlQueries;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/ShowOrdersServlet")
public class ShowOrdersServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Orders> orders = new ArrayList<Orders>();
        ConnectDB connectDB = new ConnectDB();
        QuerySelect querySelect = new QuerySelect(connectDB);
        ResultSet rs = null;
        try {
            rs = querySelect.execute(SqlQueries.SELECT_ALL_ORDERS, connectDB.getConnection());
            while (true) {
                if (!rs.next()) break;
                Orders order = new Orders(
                        rs.getShort(1),
                        rs.getShort(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getShort(5),
                        rs.getShort(6),
                        rs.getShort(7)
                );
                orders.add(order);
            }
            rs.close();
            connectDB.stop();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        request.setAttribute("orders", orders);
        getServletContext().getRequestDispatcher("/jsp/show_orders.jsp").forward(request, response);
    }
}
