package com.taxi.workwith_db;

public class SqlQueries {
public static final String CREATE_USER_TABLE = "CREATE TABLE IF NOT EXISTS user (\n" +
        "\t\tid SMALLINT NOT NULL AUTO_INCREMENT,\n" +
        "\t\tname VARCHAR(30) NOT NULL DEFAULT 'noname',\n" +
        "  \t\temail VARCHAR(35) UNIQUE NOT NULL DEFAULT 'absent',\n" +
        "\t\tpassword VARCHAR(20) NOT NULL DEFAULT 'empty password',\n" +
        "\t\tPRIMARY KEY (id)\n" +
        "\t);";
public static final String CREATE_ORDERS_TABLE = "CREATE TABLE IF NOT EXISTS orders (\n" +
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
public static final String CREATE_CAR_TYPE_TABLE = "CREATE TABLE IF NOT EXISTS car_type (\n" +
        "\tid SMALLINT UNIQUE NOT NULL,\n" +
        "\tdescription VARCHAR(20) UNIQUE,\n" +
        "\tPRIMARY KEY(id)\n" +
        ");";
public static final String CREATE_CARS_TABLE = "CREATE TABLE IF NOT EXISTS cars (\n" +
        "\tid SMALLINT NOT NULL AUTO_INCREMENT,\n" +
        "\tcar_type_id SMALLINT NOT NULL,\n" +
        "\tcar_number VARCHAR(10) UNIQUE NOT NULL,\n" +
        "\tcar_brand VARCHAR(30) NOT NULL DEFAULT 'no brand',\n" +
        "\tordered BOOL,\n" +
        "\tFOREIGN KEY (car_type_id) REFERENCES car_type(id),\n" +
        "\tPRIMARY KEY(id)\n" +
        ");";
}
