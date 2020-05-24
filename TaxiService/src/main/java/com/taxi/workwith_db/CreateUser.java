package com.taxi.workwith_db;

import com.taxi.model.User;
import com.taxi.workwith_db.ConnectDB;
import com.taxi.workwith_db.QuerySelect;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CreateUser {
    public User getUser(String email){
        User user = null;
        ConnectDB connectDB = new ConnectDB();
        QuerySelect querySelect = new QuerySelect(connectDB);
        ResultSet rs;
        String SQLquery = SqlQueries.SELECT_USER_BY_MAIL(email);
        try {
            rs = querySelect.execute(SQLquery, connectDB.getConnection());
            while (rs.next()) {
                if (email.equals(rs.getString(3))) {
                    user = new User(rs.getLong(1), rs.getString(2),rs.getString(3),rs.getString(4));
                } else {
                    user = new User();
                }
            }
            rs.close();
            connectDB.stop();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return user;
    }
}
