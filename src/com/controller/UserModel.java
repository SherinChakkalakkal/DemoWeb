
package com.controller;


import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserModel {
	
	String url = "jdbc:mysql://localhost:3306/users";
	String uname = "root";
	String pass = "1234";
	
	
 
	
	int count = 0;
	public int id;
	public String firstname;
	public String lastname;
	public String email;
	public String password;
	public String address;
	public String phone;
	
	
	public  List<Users> listUsers() throws SQLException
	{
		List<Users> listUsers = new ArrayList<>();
		try {

		String sql = "SELECT * from users";
		Class.forName("com.mysql.jdbc.Driver"); 
		Connection con = DriverManager.getConnection(url, uname, pass);
		Statement st = con.createStatement();
		ResultSet result = st.executeQuery(sql);	
	 
			while (result.next()){
				listUsers.add(new Users(result.getInt(1), result.getString(2), result.getString(3), result.getString(4), result.getString(6), result.getString(7)));
			
			 
			}
			
		}
		catch (Exception e) {
			e.printStackTrace(); 
		}
		return listUsers;
	}



}


