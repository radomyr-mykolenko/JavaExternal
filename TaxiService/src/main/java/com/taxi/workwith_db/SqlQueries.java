package com.taxi.workwith_db;

public class SqlQueries {
    public static final String CREATE_USER_TABLE =
            "CREATE TABLE IF NOT EXISTS user (" +
                    "id SMALLINT NOT NULL AUTO_INCREMENT," +
                    "name VARCHAR(30) NOT NULL DEFAULT 'noname'," +
                    "  email VARCHAR(35) UNIQUE NOT NULL DEFAULT 'absent'," +
                    "password VARCHAR(20) NOT NULL DEFAULT 'empty password'," +
                    "PRIMARY KEY (id)" +
                    ");";
    public static final String CREATE_ORDERS_TABLE =
            "CREATE TABLE IF NOT EXISTS orders (" +
                    "id MEDIUMINT NOT NULL AUTO_INCREMENT," +
                    "user_id SMALLINT NOT NULL," +
                    "start VARCHAR(30) NOT NULL DEFAULT 'start place'," +
                    "destination VARCHAR(30) NOT NULL DEFAULT 'destination'," +
                    "distance SMALLINT NOT NULL DEFAULT 1," +
                    "cost SMALLINT NOT NULL DEFAULT 1," +
                    "car_id SMALLINT NOT NULL," +
                    "FOREIGN KEY (user_id)  REFERENCES user (id)," +
                    "FOREIGN KEY (car_id) REFERENCES cars(id)," +
                    "PRIMARY KEY(id)" +
                    ");";
    public static final String CREATE_CAR_TYPE_TABLE =
            "CREATE TABLE IF NOT EXISTS car_type (" +
                    "id SMALLINT UNIQUE NOT NULL," +
                    "description VARCHAR(20) UNIQUE," +
                    "PRIMARY KEY(id)" +
                    ");";
    public static final String CREATE_CARS_TABLE =
            "CREATE TABLE IF NOT EXISTS cars (" +
                    "id SMALLINT NOT NULL AUTO_INCREMENT," +
                    "car_type_id SMALLINT NOT NULL," +
                    "car_number VARCHAR(10) UNIQUE NOT NULL," +
                    "car_brand VARCHAR(30) NOT NULL DEFAULT 'no brand'," +
                    "ordered BOOL," +
                    "FOREIGN KEY (car_type_id) REFERENCES car_type(id)," +
                    "PRIMARY KEY(id)" +
                    ");";
    public static final String INSERT_TEST_VALUES_INTO_USER_TABLE =
            "INSERT INTO user (name, email, password) \n" +
            "VALUES" +
            "('Petro', 'petro@gmail.com', '12345a')," +
            "(DEFAULT, 'err@err.com', 'password1_1')," +
            "('DImitryy', DEFAULT, 'password1_3');";
    public static final String INSERT_TEST_VALUES_INTO_ORDERS_TABLE =
            "INSERT INTO orders (user_id, start, destination, distance, cost, car_id)" +
            "VALUES" +
            "(1,'Pirogivska str 5','Bohdana hmelnitskogo str',56,563,1)," +
            "(2,'Pirogivska str 5','Bohdana hmelnitskogo str',60,630,1)," +
            "(3,'Dreizer str 5','Bohdana Kutipova str 60',20,120,2)," +
            "(2,'Dreizer str 8','Bohdana Kutipova str 40',80,250,3);";
    public static final String INSERT_TEST_VALUES_INTO_CAR_TYPE_TABLE =
            "INSERT INTO car_type (id, description) VALUES" +
            "(1, 'lux')," +
            "(2, 'econom');";
    public static final String INSERT_TEST_VALUES_INTO_CARS_TABLE =
            "INSERT INTO cars (car_type_id, car_number, car_brand, ordered) VALUES" +
            "(1,'aa5566xt','mercedes',0)," +
            "(2,'aa9999oo','daewoo',0)," +
            "(2,'aa2222oo','daewoo',0);";
    public static final String SELECT_ALL_USERS = "SELECT * FROM user";
    public static final String SELECT_ALL_CAR_TYPES = "SELECT * FROM car_type";
}
