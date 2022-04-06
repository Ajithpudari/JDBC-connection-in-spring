package com.javaspr.dao;

import com.javaspr.model.Employee;
import com.mysql.jdbc.Connection;


import javax.activation.DataSource;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EmployeeDaoImpl implements EmployeeDao{

        private DataSource dataSource;

        public void setDataSource(DataSource dataSource) {
            this.dataSource = dataSource;
        }

        @Override
        public Employee findEmployeeById(int empId) {

            Employee emp = null;
            String query = "select * from employee where emp_id=?";
            Connection conn = null;
            PreparedStatement prepStmt = null;
            ResultSet rsltSet = null;
            try {
                conn = dataSource.getConnection();
                prepStmt = conn.prepareStatement(query);
                prepStmt.setInt(1, empId);
                rsltSet = prepStmt.executeQuery();
                emp = new Employee();
                while(rsltSet.next()){
                    emp.setEmpId(empId);
                    emp.setName(rsltSet.getString("name"));
                    emp.setSalary(rsltSet.getInt("salary"));
                    emp.setDept(rsltSet.getString("dept"));
                }

            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } finally {
                try {
                    if(rsltSet != null) rsltSet.close();
                    if(prepStmt != null) prepStmt.close();
                } catch(Exception ex){}
            }
            return emp;
        }

    }
