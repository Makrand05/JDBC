package com.biz.jdbc;

import org.joda.time.LocalDate;

import java.sql.SQLException;

public class EmployeePayrollService {

    EmpPayRepo empPayRepo=new EmpPayRepo();
    public static void main(String[] args) throws SQLException {

        EmployeePayrollService empService = new EmployeePayrollService();
        //empService.retrieveData();
       //empService.updateSalary("Prashant",4000000);
        empService.retrieveDataframeDate(LocalDate.parse("2010-01-01"));

    }

    private void retrieveDataframeDate(LocalDate date) throws SQLException {
        System.out.println(empPayRepo.retrieveDataframeDate(date));
    }

    private void updateSalary(String name, long salary) throws SQLException {
        //empPayRepo.updateSalary(name,salary);
        empPayRepo.updateSalaryPrepareStmt(name,salary);
    }

    private void retrieveData () throws SQLException {
            System.out.println(empPayRepo.retrieveData());
        }
    }
