

package com.login.dao;

import java.sql.*; 
public class CreateDao {
	String url = "jdbc:mysql://localhost:3306/users";
	String uname = "root";
	String pass = "1234";
	
	String sql = "INSERT INTO users(firstname, lastname, email, phone, address,password) VALUES ( ?,  ?, ?,  ?,  ?, ?)";
	String sql2 = "INSERT INTO accounts(Checking, Savings, LoanAmount,firstname, interest, approveDecline) VALUES ( ?, ?, ? , ?,0,0  )";
	
	public boolean check (String Firstname, String Lastname, String Email,  String Password, String Address,  String  Phone, int Fee)
		{
			try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, uname, pass);
			PreparedStatement st = con.prepareStatement(sql);
			st.setString(1, Firstname);
			st.setString(2,Lastname);
			st.setString(3,Email);
			st.setString(4,Password);
			st.setString(5,Address);
			st.setString(6,Phone);

			PreparedStatement st1 = con.prepareStatement(sql2);
			st1.setInt(1, '0');
			st1.setInt(2, Fee);
			st1.setInt(3, '0');
			st1.setString(4, Firstname);
		
			System.out.println(Fee);
			
			int rowsInserted1 = st.executeUpdate();
			int rowsInserted2 = st1.executeUpdate();
			if (rowsInserted1 > 0) {
			    System.out.println("A new user was inserted successfully!");
			}
			if (rowsInserted2 > 0) {
			    System.out.println("A new user2 was inserted successfully!");
			}
			 
			return true;
			
			} catch (Exception e) {
				e.printStackTrace(); 
			}
			return false;
 	}
}

