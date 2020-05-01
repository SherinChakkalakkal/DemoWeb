package com.depositWithdraw;





import java.sql.*; 
public class WithdrawSecDao {
	String url = "jdbc:mysql://localhost:3306/users";
	String uname = "root";
	String pass = "1234";
	
	public int amount;
	int result;



	public int WithdrawSecDaoFinal (String N, int F )
		{
			try {
				
				Class.forName("com.mysql.jdbc.Driver");
				Connection con = DriverManager.getConnection(url, uname, pass);
				String sql = "UPDATE accounts SET Savings = '" + F +  "' WHERE firstname = '" + N +  "'";

				PreparedStatement st = con.prepareStatement(sql);
				 result = st.executeUpdate( sql);
				 
				
			
			} catch (Exception e) {
				e.printStackTrace(); 
			}
			return result;
 	}
}

