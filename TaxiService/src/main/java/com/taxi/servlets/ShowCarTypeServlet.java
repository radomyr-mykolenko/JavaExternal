package com.taxi.servlets;

import com.taxi.model.CarType;
import com.taxi.model.User;
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

@WebServlet("/ShowCarTypeServlet")
public class ShowCarTypeServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<CarType> carTypes = new ArrayList<CarType>();
        ConnectDB connectDB = new ConnectDB();
        QuerySelect querySelect = new QuerySelect(connectDB);
        ResultSet rs = null;
        try {


            rs = querySelect.execute(SqlQueries.SELECT_ALL_CAR_TYPES, connectDB.getConnection());
            while (true) {
                if (!rs.next()) break;
                CarType carType = new CarType(
                        rs.getLong(1),

                        rs.getString(2)
                );
                carTypes.add(carType);
            }
            rs.close();
            connectDB.stop();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        request.setAttribute("cartypes", carTypes);
        getServletContext().getRequestDispatcher("/jsp/show_car_types.jsp").forward(request, response);
    }
}
