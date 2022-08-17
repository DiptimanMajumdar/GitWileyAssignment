package com.wiley.persistence;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wiley.bean.Employee;

@Repository
public interface EmployeeDao extends JpaRepository<Employee, Integer>{

	List<Employee> findEmployeeByDepartment(String department);
}
