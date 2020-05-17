package com.taxi.servlets;

import com.taxi.model.CarType;
import com.taxi.model.Cars;
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

@WebServlet("/ShowCarsServlet")
public class ShowCarsServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Cars> cars = new ArrayList<Cars>();
        ConnectDB connectDB = new ConnectDB();
        QuerySelect querySelect = new QuerySelect(connectDB);
        ResultSet rs = null;
        try {
            rs = querySelect.execute(SqlQueries.SELECT_ALL_CARS, connectDB.getConnection());
            while (true) {
                if (!rs.next()) break;
                Cars car = new Cars(
                        rs.getShort(1),
                        rs.getShort(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getBoolean(5)
                );
                cars.add(car);
            }
            rs.close();
            connectDB.stop();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        request.setAttribute("cars", cars);
        getServletContext().getRequestDispatcher("/jsp/show_cars.jsp").forward(request, response);
    }
}
