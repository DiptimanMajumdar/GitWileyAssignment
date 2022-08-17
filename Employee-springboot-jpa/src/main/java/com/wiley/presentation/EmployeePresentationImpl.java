package com.wiley.presentation;

import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.wiley.bean.Employee;
import com.wiley.service.EmployeeService;


@Component
public class EmployeePresentationImpl implements EmployeePresentation {

	@Autowired
	private EmployeeService employeeService;//=new EmployeeServiceImpl();
	
	@Override
	public void showMenu() {
		System.out.println("1. Show All Employees");
		System.out.println("2. Search Employee By Department");
//		System.out.println("3. Generate Payslip");
//		System.out.println("4. Add New Employee ");
		System.out.println("5. Exit");

	}

	@Override
	public void performMenu(int choice) {
		Scanner scanner=new Scanner(System.in);
		try {
		switch (choice) {
		case 1:
			List<Employee> employees=employeeService.getEmployees();
			for(Employee employee:employees) {
				System.out.println(employee);
			}
			break;

		case 2:
			System.out.println("Enter Employee Dept : ");
			String dept=scanner.nextLine();
			List<Employee> empl=employeeService.searchEmpByDept(dept);
			for(Employee employee:empl) {
				System.out.println(employee);
			}
			break;
//		case 3:
//			System.out.println("Enter Employee ID : ");
//			int eid=scanner.nextInt();
//			EmployeePayslip employeePayslip=employeeService.generatePayslip(eid);
//			if(employeePayslip!=null)
//				System.out.println(employeePayslip);
//			else
//				System.out.println("Employee with id "+eid+" does not exist");
//			break;
//		case 4:
//			Employee employee=new Employee();
//			System.out.println("Enter Employee ID : ");
//			employee.setEmpId(scanner.nextInt());
//			System.out.println("Enter Employee Name : ");
//			employee.setEmpName(scanner.next());
//			System.out.println("Enter Employee Designation : ");
//			employee.setEmpDesignation(scanner.next()); 
//			System.out.println("Enter Employee Department : ");
//			employee.setEmpDepartment(scanner.next()); 
//			System.out.println("Enter Employee Email : ");
//			employee.setEmpEmail(scanner.next());
//			System.out.println("Enter Employee Salary : ");
//			employee.setEmpSalary(scanner.nextDouble());
//			if(employeeService.addEmployee(employee))
//				System.out.println("Employee Record Added Successfully!");
//			else
//				System.out.println("Employee Record Insertion Failed");
//			break;
		case 5:
			System.out.println("Thanks for using Employee Management System");
			System.exit(0);
		default:
			System.out.println("Invalid Coice");
			break;
		}
		}
		catch(Exception exception) {
			
		}
	}

}
