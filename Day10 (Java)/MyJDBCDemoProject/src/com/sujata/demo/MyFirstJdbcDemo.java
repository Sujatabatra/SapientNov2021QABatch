package com.sujata.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MyFirstJdbcDemo {

	public static void main(String[] args) {

		Connection connection=null;
		PreparedStatement preparedStatement=null;
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
				System.out.println(eId+"  "+eName+"  "+desig+"  "+deptt+"  "+salary);
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

	}

}
