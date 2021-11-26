package com.sujata.persistence;

import java.util.ArrayList;

import com.sujata.bean.Employee;

public interface EmployeeDao {

	ArrayList<Employee> getAllEmployees();
	Employee getEmployeeById(String empId);
	int addEmployee(Employee employee);
	int deleteEmployee(String empId);
	int updateSalaryById(String empId,int salary);
}
