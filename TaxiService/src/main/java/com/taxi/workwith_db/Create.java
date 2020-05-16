package com.taxi.workwith_db;

import java.sql.Connection;
import java.sql.SQLException;

public class Create {
    private ConnectDB connectDB;

    public Create(ConnectDB connectDB) {
        this.connectDB = connectDB;
    }
    public void execute(String sqlQuery){
        Connection connection = connectDB.getConnection();
        try {
            connection.createStatement().executeUpdate(sqlQuery);
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
