package com.taxi.workwith_db;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class CheckUser {
    public boolean resultEmail = false;
    public boolean resultPassword = false;
    private ArrayList<String> emails = new ArrayList<>();

    public boolean checkEmail(String email) {
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

        for (String element : emails) {
            if (element.equals(email)) {
                resultEmail = true;
                break;
            }
        }
        return resultEmail;
    }

    public boolean checkPassword(String email, String password) {
        ConnectDB connectDB = new ConnectDB();
        QuerySelect querySelect = new QuerySelect(connectDB);
        ResultSet rs = null;
        String SQLquery = "SELECT * FROM user WHERE email='" + email + "';";
        try {
            rs = querySelect.execute(SQLquery, connectDB.getConnection());
            while (rs.next()) {
                if (password.equals(rs.getString(4))) {
                    resultPassword = true;
                } else resultPassword = false;
            }
            rs.close();
            connectDB.stop();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return resultPassword;
    }
}
