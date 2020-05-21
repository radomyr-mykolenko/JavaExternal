package com.taxi.workwith_db;

import com.taxi.model.User;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CheckUser {
    public boolean result = false;
    private ArrayList<String> emails = new ArrayList<>();
    public boolean check(String email) {
        ConnectDB connectDB = new ConnectDB();
        QuerySelect querySelect = new QuerySelect(connectDB);
        ResultSet rs = null;
        try {
            rs = querySelect.execute(SqlQueries.SELECT_ALL_USERS, connectDB.getConnection());
            while (true) {
                if (!rs.next()) break;
                emails.add(rs.getString(3));
            }
            rs.close();
            connectDB.stop();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        for(String element: emails){
            if (element.equals(email)) {
                result = true;
                break;
            }
        }
        return result;
    }
}
