package com.sujata.service;

import java.util.ArrayList;

import com.sujata.bean.Employee;

public interface EmployeeService {

	ArrayList<Employee> searchAllEmployees();
	Employee searchEmployeeById(String empId);
	boolean insertEmployee(Employee employee);
	boolean removeEmployee(String empId);
	boolean updateSalaryByEmployeeId(String empId,int salary);
}
