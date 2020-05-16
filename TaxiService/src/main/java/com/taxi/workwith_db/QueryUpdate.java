package com.taxi.workwith_db;

import java.sql.Connection;
import java.sql.SQLException;

public class QueryUpdate {
    private ConnectDB connectDB;

    public QueryUpdate(ConnectDB connectDB) {
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
