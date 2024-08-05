package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    // реализуйте настройку соеденения с БД
    private static final String DB_URL = "jdbc:mysql://localhost:3306/test1";
    private static final String DB_USERNAME = "root";
    private static  final String DB_PASSWORD = "";
    private static Connection connection = null;

    public static Connection getConnection(){

        try {
            connection = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
            System.out.println("есть контакт");
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.printf("Connection ERROR");
        }
        return connection;
    }
}
