package com.luv2code.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestJdbc {

    public static void main(String[] args) {

        String jdbcURL = "jdbc:mysql://localhost:3306/hb_student_tracker?useSSL=false";

        String user = "root";
        String password = "melissa1!";

        try {
            System.out.println("Connecting to database: " + jdbcURL);

            Connection myConnection =
                    DriverManager.getConnection(jdbcURL, user, password);

            System.out.println("Connection Successful!");
        }
        catch (Exception e) {
            e.printStackTrace();
        }

    }
}
