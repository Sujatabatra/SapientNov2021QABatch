package com.sujata.service;

import java.util.ArrayList;

import com.sujata.bean.Employee;
import com.sujata.persistence.EmployeeDao;
import com.sujata.persistence.EmployeeDaoImpl;

public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeDao employeeDao=new EmployeeDaoImpl();
	
	@Override
	public ArrayList<Employee> searchAllEmployees() {
		return employeeDao.getAllEmployees();
	}

	@Override
	public Employee searchEmployeeById(String empId) {
		return employeeDao.getEmployeeById(empId);
	}

	@Override
	public boolean insertEmployee(Employee employee) {
		int rows=employeeDao.addEmployee(employee);
		if(rows>0)
			return true;
		return false;
	}

	@Override
	public boolean removeEmployee(String empId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateSalaryByEmployeeId(String empId, int salary) {
		int rows=employeeDao.updateSalaryById(empId, salary);
		if(rows>0)
			return true;
		return false;
	}

}
