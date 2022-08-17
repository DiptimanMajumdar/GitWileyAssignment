package com.wiley.service;

import java.util.List;

import com.wiley.bean.Employee;

public interface EmployeeService {

	List<Employee> getEmployees();

	List<Employee> searchEmpByDept(String dept);
}
