package com.javaspr.dao;

import com.javaspr.model.Employee;

public interface EmployeeDao {

    public Employee findEmployeeById(int empId);
}