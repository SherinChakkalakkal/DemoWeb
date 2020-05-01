package com.depositWithdraw;



import java.sql.*; 
public class DepWithDao {
	String url = "jdbc:mysql://localhost:3306/users";
	String uname = "root";
	String pass = "1234";
	
	public int id;
	public int checking;
	public int savings;
	public int loanamount;
	public int amount;
	
	
	public int depositWithdraw (String N)
		{
			try {
				Class.forName("com.mysql.jdbc.Driver");
				Connection con = DriverManager.getConnection(url, uname, pass);
				String sql = "select * from accounts WHERE firstname = '" + N +  "'"; 


				PreparedStatement st = con.prepareStatement(sql);
				ResultSet result = st.executeQuery( sql);
				
				result.next();
				
				 savings = result.getInt(3);
				
				 System.out.println(savings);
			
			} catch (Exception e) {
				e.printStackTrace(); 
			}
			return savings;
 	}
}

