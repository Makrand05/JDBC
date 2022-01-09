package com.biz.jdbc;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EmpPayRepo {

    private Connection getConnection() {
        Connection connection = null;
        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver loaded");
            String JDBCURL = "jdbc:mysql://127.0.0.1:3308/address_book_service";
            connection = DriverManager.getConnection(JDBCURL, "root", "root");

        } catch (
                SQLException | ClassNotFoundException e) {
            System.out.println("Database not connected..!!!!");
        }
        return connection;
    }

    public List<Employee> retrieveData() throws SQLException {
        List<Employee> employeeList = new ArrayList<>();
        try (Connection connection = getConnection()) {
            Statement statement = connection.createStatement();
            String sqlQuery = "select * from employee_payroll_java";
            ResultSet resultSet = statement.executeQuery(sqlQuery);
            while (resultSet.next()) {
                Employee info = new Employee();
                info.setId(resultSet.getInt(1));
                info.setName(resultSet.getString(2));
                info.setGender(resultSet.getString(3).charAt(0));
                info.setStartDate(resultSet.getDate(4).toLocalDate());

                info.setAddress(resultSet.getString(5));
                info.setPhone(resultSet.getInt(6));
                employeeList.add(info);
            }
        }
        return employeeList;

    }


}
