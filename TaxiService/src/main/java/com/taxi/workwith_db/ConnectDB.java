package com.taxi.workwith_db;

import java.lang.reflect.InvocationTargetException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectDB {
    private Connection connection = null;
    private Statement statement = null;
    private String drivername = "com.mysql.jdbc.Driver";
    private String user = "root";
    private String password = "root566";
    private String urlDB = "jdbc:mysql://localhost/taxi_db";

    public Connection getConnection() {
        try {
            Class.forName(drivername).getDeclaredConstructor().newInstance();
            connection = DriverManager.getConnection(urlDB,user, password);
        } catch (Exception e) {
            e.printStackTrace();
        }
       /*
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }*/
        return connection;
    }

    public void stop() {
        try {
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
