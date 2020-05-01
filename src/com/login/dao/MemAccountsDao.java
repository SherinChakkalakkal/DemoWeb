
package com.login.dao;


import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MemAccountsDao {
	
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
	
	
	public  List<Double> accountInfo() throws SQLException
	{
		List<Double> listAccount = new ArrayList<Double>();
		try {

		String sql = "SELECT * from accounts where firstname = 'Nithina '";
		Class.forName("com.mysql.jdbc.Driver"); 
		Connection con = DriverManager.getConnection(url, uname, pass);
		PreparedStatement st = con.prepareStatement(sql);
		//st.setString(1, userName);
		
		ResultSet result = st.executeQuery();
	 
			while (result.next()){
				listAccount.add((double) result.getInt(1));
				listAccount.add( result.getDouble(2));
				listAccount.add(result.getDouble(3));
				listAccount.add(result.getDouble(4)); 
			}
			
		}
		catch (Exception e) {
			e.printStackTrace(); 
		}
		return listAccount;
	}



}


