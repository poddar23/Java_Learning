package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class AddStudent {
	public static void main(String[] args) {
		
		
		
		try {
			// load driver
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver Loaded...");
			
			// define connection url
			String url = "jdbc:mysql://localhost:3306/19feb_java";
			String user = "root";
			String pass = "";
			
			//Establish the Connection
			Connection connection = DriverManager.getConnection(url,user,pass);
			System.out.println("Connection established..");
			
			
			//create a statement 
			
			Statement st = connection.createStatement();
			
			// execute query
			int i = st.executeUpdate("insert into student values(0,'Shiv','shiv@gmail.com')");
			
			if(i>0)
			{
				System.out.println("Data Inserted");
			}
			
			// processthe Result 
			
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
