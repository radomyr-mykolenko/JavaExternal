package com.taxi.workwith_db;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTables {
    private ConnectDB connectDB;
    private String sqlCreateUserTable = "CREATE TABLE IF NOT EXISTS user (\n" +
            "\t\tid SMALLINT NOT NULL AUTO_INCREMENT,\n" +
            "\t\tname VARCHAR(30) NOT NULL DEFAULT 'noname',\n" +
            "  \t\temail VARCHAR(35) UNIQUE NOT NULL DEFAULT 'absent',\n" +
            "\t\tpassword VARCHAR(20) NOT NULL DEFAULT 'empty password',\n" +
            "\t\tPRIMARY KEY (id)\n" +
            "\t);";
    private String sqlCreateOrdersTable = "CREATE TABLE IF NOT EXISTS orders (\n" +
            "\tid MEDIUMINT NOT NULL AUTO_INCREMENT,\n" +
            "\tuser_id SMALLINT NOT NULL,\n" +
            "\tstart VARCHAR(30) NOT NULL DEFAULT 'start place',\n" +
            "\tdestination VARCHAR(30) NOT NULL DEFAULT 'destination',\n" +
            "\tdistance SMALLINT NOT NULL DEFAULT 1,\n" +
            "\tcost SMALLINT NOT NULL DEFAULT 1,\n" +
            "\tcar_description VARCHAR(20) NOT NULL,\n" +
            "\tFOREIGN KEY (user_id)  REFERENCES user (id),\n" +
            "\tFOREIGN KEY (car_description) REFERENCES car_type(description),\n" +
            "\tPRIMARY KEY(id)\n" +
            ");\n";
    private String sqlCreateCar_TypeTable = "CREATE TABLE IF NOT EXISTS car_type (\n" +
            "\tid SMALLINT UNIQUE NOT NULL,\n" +
            "\tdescription VARCHAR(20) UNIQUE,\n" +
            "\tPRIMARY KEY(id)\n" +
            ");";
    private String sqlCreateCarsTable = "CREATE TABLE IF NOT EXISTS cars (\n" +
            "\tid SMALLINT NOT NULL AUTO_INCREMENT,\n" +
            "\tcar_type_id SMALLINT NOT NULL,\n" +
            "\tcar_number VARCHAR(10) UNIQUE NOT NULL,\n" +
            "\tcar_brand VARCHAR(30) NOT NULL DEFAULT 'no brand',\n" +
            "\tordered BOOL,\n" +
            "\tFOREIGN KEY (car_type_id) REFERENCES car_type(id),\n" +
            "\tPRIMARY KEY(id)\n" +
            ");";

    public CreateTables(ConnectDB connectDB) {
        this.connectDB = connectDB;
    }

    public void Create() {

        Connection connection = connectDB.getConnection();
        try {
            connection.createStatement().executeUpdate(sqlCreateUserTable);
            connection.createStatement().executeUpdate(sqlCreateOrdersTable);
            connection.createStatement().executeUpdate(sqlCreateCar_TypeTable);
            connection.createStatement().executeUpdate(sqlCreateCarsTable);
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
