package com.biz.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class EmployeePayrollService {

    EmpPayRepo empPayRepo=new EmpPayRepo();
    public static void main(String[] args) throws SQLException {

        EmployeePayrollService empService = new EmployeePayrollService();
        empService.retrieveData();
    }


    private void retrieveData () throws SQLException {
            System.out.println(empPayRepo.retrieveData());
        }
    }
