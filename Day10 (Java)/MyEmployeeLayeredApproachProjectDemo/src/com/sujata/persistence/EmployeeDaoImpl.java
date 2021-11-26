package com.sujata.persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

import com.sujata.bean.Employee;

public class EmployeeDaoImpl implements EmployeeDao {

	@Override
	public ArrayList<Employee> getAllEmployees() {
		Connection connection=null;
		PreparedStatement preparedStatement=null;
		ArrayList<Employee> employeeList=new ArrayList<Employee>();
		try {
//			1. Connect
//			1.1 Register Driver
			Class.forName("oracle.jdbc.driver.OracleDriver");
//			1.2 Connect to Database
			connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "sujata");
			
//			2. Query
			preparedStatement=connection.prepareStatement("SELECT * FROM EMPLOYEE");
			
			ResultSet resultSet= preparedStatement.executeQuery();

//			3.Process Result
			while(resultSet.next()) {
				String eId=resultSet.getString("ID");
				String eName=resultSet.getString("NAME");
				String desig=resultSet.getString("DESIGNATION");
				String deptt=resultSet.getString("DEPARTMENT");
				int salary=resultSet.getInt("SALARY");
				Employee employee=new Employee(eId, eName, deptt, desig, salary);
				employeeList.add(employee);
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
//				4. Close
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}


		return employeeList;
	}

	@Override
	public Employee getEmployeeById(String empId) {
		Connection connection=null;
		PreparedStatement preparedStatement=null;
		Employee employee=null;
		try {
//			1. Connect
//			1.1 Register Driver
			Class.forName("oracle.jdbc.driver.OracleDriver");
//			1.2 Connect to Database
			connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "sujata");
			
//			2. Query
			preparedStatement=connection.prepareStatement("SELECT * FROM EMPLOYEE WHERE ID=?");
			
			preparedStatement.setString(1, empId);
			
			ResultSet resultSet= preparedStatement.executeQuery();

//			3.Process Result
			
			if(resultSet.next()) {
				String eId=resultSet.getString("ID");
				String eName=resultSet.getString("NAME");
				String desig=resultSet.getString("DESIGNATION");
				String deptt=resultSet.getString("DEPARTMENT");
				int salary=resultSet.getInt("SALARY");
				
				employee=new Employee(eId, eName, deptt, desig, salary);
				
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
//				4. Close
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return employee;
	}

	@Override
	public int addEmployee(Employee employee) {
		Connection connection=null;
		PreparedStatement preparedStatement=null;
		Scanner scanner=new Scanner(System.in);
		try {
//			1. Connect
//			1.1 Register Driver
			Class.forName("oracle.jdbc.driver.OracleDriver");
//			1.2 Connect to Database
			connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "sujata");
			
//			2. Query
			preparedStatement=connection.prepareStatement("INSERT INTO EMPLOYEE VALUES(?,?,?,?,?)");
			
			preparedStatement.setString(1, employee.getEmpId());
			preparedStatement.setString(2, employee.getEmpName());
			preparedStatement.setString(3, employee.getDesignation());
			preparedStatement.setString(4, employee.getDepartment());
			preparedStatement.setInt(5, employee.getSalary());
			
			
			int rows= preparedStatement.executeUpdate();

//			3.Process Result
			return rows;
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
//				4. Close
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return 0;
	}

	@Override
	public int deleteEmployee(String empId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateSalaryById(String empId, int salary) {
		Connection connection=null;
		PreparedStatement preparedStatement=null;
		Scanner scanner=new Scanner(System.in);
		try {
//			1. Connect
//			1.1 Register Driver
			Class.forName("oracle.jdbc.driver.OracleDriver");
//			1.2 Connect to Database
			connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "sujata");
			
//			2. Query
			preparedStatement=connection.prepareStatement("UPDATE EMPLOYEE SET SALARY=? WHERE ID=?");
			
			preparedStatement.setInt(1, salary);
			preparedStatement.setString(2, empId);
			
			
			int rows= preparedStatement.executeUpdate();

//			3.Process Result
			return rows;
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
//				4. Close
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return 0;
	}

}
