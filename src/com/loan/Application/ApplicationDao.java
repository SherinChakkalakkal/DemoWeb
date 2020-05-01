package com.loan.Application;



import java.sql.*; 
public class ApplicationDao {
	String url = "jdbc:mysql://localhost:3306/users";
	String uname = "root";
	String pass = "1234";
	
	String sql = "INSERT INTO loanrequest( firstname, email, amount, message, approved, declined) VALUES (? , ? , ?, ?,  ?,  ?)";
	
	public boolean ApplicationF (String Firstname, String Email,  Integer Amount,String approved,String declined, String Message)
		{
			try {
				//int id = 1;
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, uname, pass);
			PreparedStatement st = con.prepareStatement(sql);
			//st.setInt(1, id);
			st.setString(1, Firstname);
			st.setString(2,Email);
			st.setInt(3,Amount);
			st.setString(4,Message);
			st.setString(5,approved);
			st.setString(6,declined);
			
			int rowsInserted = st.executeUpdate();
			if (rowsInserted > 0) {
			    System.out.println("A new user was inserted successfully!");
			}
			
			return true;
			
			} catch (Exception e) {
				e.printStackTrace(); 
			}
			return false;
 	}
}

