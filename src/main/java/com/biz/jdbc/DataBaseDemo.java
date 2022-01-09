package com.biz.jdbc;

import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBaseDemo {
    public static void main(String[] args)  {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver loaded");
        }

        catch (ClassNotFoundException e) {
            System.out.println("driver is not loaded");
        }
        String JDBCURL="jdbc:mysql://127.0.0.1:3308/payroll_service";
        System.out.println("Database connected....");

        try {
            DriverManager.getConnection(JDBCURL,"root","root");
        } catch (SQLException e) {
            System.out.println("Database not connected..!!!!");
        }

    }
}
