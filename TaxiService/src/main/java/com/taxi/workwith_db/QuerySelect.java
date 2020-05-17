package com.taxi.workwith_db;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class QuerySelect {
    private ConnectDB connectDB;
    private ResultSet resultSet;

    public QuerySelect(ConnectDB connectDB) {
        this.connectDB = connectDB;
        this.resultSet = null;
    }

    public ResultSet execute(String sqlQuery) {
        Connection connection = connectDB.getConnection();
        try {
            resultSet = connection.createStatement().executeQuery(sqlQuery);
            connection.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return resultSet;
    }
}
