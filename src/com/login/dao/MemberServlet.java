
package com.login.dao;

import java.sql.*; 
public class MemberServlet {
	String url = "jdbc:mysql://localhost:3306/users";
	String uname = "root";
	String pass = "1234";
	

	
	int count = 0;
	public int id;
	public double checking;
	public double savings;
	public double loan;
	
	
	
	public void memFunction ()
	{
		try {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, uname, pass);
		//String sql = "SELECT * from accounts " + " WHERE firstname >='Joseph'";
		
		Statement st = con.createStatement();
		ResultSet result = st.executeQuery( "SELECT * from accounts " + " WHERE firstname >='Philip'");
		
		
			
		result.next();
				 id = result.getInt(1);
			     checking = result.getDouble(2);
			     savings = result.getDouble(3);
			     loan = result.getDouble(4);
			    
			
			
		System.out.println(id);	
			
		}
		catch (Exception e) {
			e.printStackTrace(); 
		}
	}
}



/* public boolean check (String Firstname, String Lastname, String Email,  String Password, String Address,  String  Phone)
{
	try {
	Class.forName("com.mysql.jdbc.Driver");
	Connection con = DriverManager.getConnection(url, uname, pass);
	PreparedStatement st = con.prepareStatement(sql);
	st.getString(1, Firstname);
	st.setString(2,Lastname);
	st.setString(3,Email);
	st.setString(4,Password);
	st.setString(5,Address);
	st.setString(6,Phone);
	
	
	int rowsInserted = st.executeUpdate();
	if (rowsInserted > 0) {
	    System.out.println("A new user was inserted successfully!");
	}
	
	} catch (Exception e) {
		e.printStackTrace(); 
	}
	return false;
}  */


