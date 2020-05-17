package com.taxi.servlets;

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
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/ShowAllUsersServlet")
public class ShowAllUsersServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<User> users = new ArrayList<User>();
        ConnectDB connectDB = new ConnectDB();
        QuerySelect querySelect = new QuerySelect(connectDB);
        ResultSet rs = null;
        try {


            rs = querySelect.execute(SqlQueries.SELECT_ALL_USERS, connectDB.getConnection());
            while (true) {
                if (!rs.next()) break;
                User user = new User(
                        rs.getLong(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4)
                );
                users.add(user);
            }
            rs.close();
            connectDB.stop();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        /*PrintWriter out = response.getWriter();
        for(User user: users){
            out.println(user.toString());
        }*/
        request.setAttribute("users", users);
        getServletContext().getRequestDispatcher("/jsp/showusers.jsp").forward(request, response);
    }
}
