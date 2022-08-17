package com.wiley.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wiley.bean.Employee;
import com.wiley.persistence.EmployeeDao;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	private EmployeeDao employeeDao;
	
	@Override
	public List<Employee> getEmployees() {
		
		return employeeDao.findAll();
	}

	@Override
	public List<Employee> searchEmpByDept(String dept) {
		return employeeDao.findEmployeeByDepartment(dept);
	}
}
