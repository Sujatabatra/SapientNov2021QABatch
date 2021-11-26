package com.sujata.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class MyJdbcDMLDemo {

	public static void main(String[] args) {

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
			
			preparedStatement.setString(1, eId);
			preparedStatement.setString(2, eNa);
			preparedStatement.setString(3, des);
			preparedStatement.setString(4, dept);
			preparedStatement.setInt(5, sal);
			
			
			int rows= preparedStatement.executeUpdate();

//			3.Process Result
			if(rows>0)
				System.out.println("Record added!");
			else
				System.out.println("Record Addition Failed");
			
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

	}

}
