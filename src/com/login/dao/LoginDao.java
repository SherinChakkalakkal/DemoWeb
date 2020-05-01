package com.login.dao;



import java.sql.*;
import java.util.ArrayList;
//import java.util.List;

//import com.loanapproval.LoanUsers; 
public class LoginDao {
	String url = "jdbc:mysql://localhost:3306/users";
	String uname = "root";
	String pass = "1234";
	public int loanId;
	public String firstname,email, message;
	public int amount;
	public int notifications =0;
	public int notif = 0;
 	public String userNotification = "nothing";
 	public String loanMessage;
	
	String sql = "SELECT * FROM users WHERE firstname = ? AND password= ?";
	
	

	public boolean check (String userName, String userPassword)
		{
			try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, uname, pass);
			PreparedStatement st = con.prepareStatement(sql);
			st.setString(1, userName);
			st.setString(2,userPassword);
			ResultSet rs = st.executeQuery();
			if (rs.next()) {
				return true;
			}
			
			} catch (Exception e) {
				e.printStackTrace(); 
			}
			return false;
		
			
		}
	

	
	public int loanRequest ()
	{			
					String sql2 = "SELECT * FROM loanrequest";
					
					try {
					Class.forName("com.mysql.jdbc.Driver");
					Connection con = DriverManager.getConnection(url, uname, pass);
					PreparedStatement st = con.prepareStatement(sql2);
					
					ResultSet rs1 = st.executeQuery();
					while (rs1.next()) {
						loanId = rs1.getInt(1);
						firstname = rs1.getString(2);
						email = rs1.getString(3);
						amount = rs1.getInt(4);
						message = rs1.getString(5);
						notifications = notifications +1;
					}
					System.out.println(notifications);
					} catch (Exception e) {
						e.printStackTrace(); 
					}
					
					
		return notifications;
	
		
	}
	
	
	
	public int  userLoanMessage (String userName)
	{			
					//String sql3 = "SELECT  *  FROM accounts";
					String sql3 = "SELECT * FROM accounts WHERE firstname = ? ";

					
					try {
					Class.forName("com.mysql.jdbc.Driver");
					Connection con = DriverManager.getConnection(url, uname, pass);
					PreparedStatement st = con.prepareStatement(sql3);
					
					st.setString(1, userName);

					ResultSet rs1 = st.executeQuery();
					while (rs1.next()) {

						
						userNotification = rs1.getString("approveDecline");
						if (userNotification.equals("Approved")) {
							notif = notif +1;
							loanMessage = userNotification;
						}
						
					} 
						
						System.out.println(userNotification);
						//String Approved = "Approved";
						
						/*if (userNotification.equals(Approved)){
							notif = notif +1;
							
						} */
						
						
					
					//System.out.println(notif + "notifi");
					} 
					catch (Exception e) {
						e.printStackTrace(); 
					}
					
					
		return notif;
	
		
	}


	
	


	
	public void deleteApprovalData(String userName) {
		
		//String sql = "UPDATE accounts SET approveDecline = 'null' WHERE password= ? ";
		
		String sql = "UPDATE accounts SET approveDecline = 'null' WHERE firstname = '" + userName +  "'";


		try {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, uname, pass);
		PreparedStatement st = con.prepareStatement(sql);
		//st.setString(0, userName);
		
		
		
		//Statement st = con.createStatement();
		//st.setString(1, userName);
		st.executeUpdate( sql);
		//System.out.println(id);
		
		
		//Statement st3 = con.createStatement();
		 //st.executeUpdate( sql2);
		
		}
		
		catch (Exception e) {
			e.printStackTrace(); 
		}
		
	}

	
	
	
	
}

