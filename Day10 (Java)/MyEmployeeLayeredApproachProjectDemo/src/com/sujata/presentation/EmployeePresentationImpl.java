package com.sujata.presentation;

import java.util.ArrayList;
import java.util.Scanner;

import com.sujata.bean.Employee;
import com.sujata.service.EmployeeService;
import com.sujata.service.EmployeeServiceImpl;

public class EmployeePresentationImpl implements EmployeePresentation {

	private EmployeeService employeeService=new EmployeeServiceImpl();
	@Override
	public void showMenu() {
		System.out.println("Employee Management System");
		System.out.println("==================================");
		System.out.println("1. List All Employees");
		System.out.println("2. Search Employee ");
		System.out.println("3. Add Employee ");
		System.out.println("4. Delete Employee");
		System.out.println("5. Update Salary on an Employee");
		System.out.println("6. Exit");
		System.out.println("==================================");

	}

	@Override
	public void performMenu(int choice) {
		Scanner scanner=new Scanner(System.in);
		switch(choice) {
		case 1:
			ArrayList<Employee> employeeList=employeeService.searchAllEmployees();
			for(Employee emp:employeeList) {
				System.out.println(emp);
			}
			break;
		case 2:
			System.out.println("Enter Employee id to be searched for : ");
			String empId=scanner.next();
			Employee searchedEmployee=employeeService.searchEmployeeById(empId);
			if(searchedEmployee!=null)
				System.out.println(searchedEmployee);
			else
				System.out.println("Employee with ID "+empId+" does not exist!");
			break;
		case 3:
			System.out.println("Enter Employee ID : ");
			String eId=scanner.next();
			System.out.println("Enter Employee Name : ");
			String eNa=scanner.next();
			System.out.println("Enter Designation : ");
			String des=scanner.next();
			System.out.println("Enter Department : ");
			String dept=scanner.next();
			System.out.println("Enter Salary : ");
			int sal=scanner.nextInt();
			Employee employee=new Employee(eId, eNa, dept, des, sal);
			if(employeeService.insertEmployee(employee))
				System.out.println("RECORD ADDED!");
			else
				System.out.println("RECORD NOT ADDED!");
			break;
		case 4:
			break;
		case 5:
			System.out.println("Enter Employee id : ");
			String id=scanner.next();
			System.out.println("Enter New Salary : ");
			int newSalary=scanner.nextInt();
			if(employeeService.updateSalaryByEmployeeId(id, newSalary))
				System.out.println("Salary Updation Successful!");
			else
				System.out.println("Salary Updation Failed!");
			break;
		case 6:
			System.out.println("Thanks for Using our System");
			System.exit(0);
		default:
			System.out.println("Invalid Choice");
		}

	}

}
