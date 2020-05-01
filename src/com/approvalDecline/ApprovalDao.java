package com.approvalDecline;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.loanapproval.LoanDao;
import com.loanapproval.LoanUsers;

//import com.controller.Users;

public class ApprovalDao {
	
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
	public int amount;
	public int note;
	
	
	public void approvalF() {
		
		//List<BalUsers> listUsers = new ArrayList<>();
				try {

					LoanDao x = new LoanDao();
					
					List<LoanUsers> loanApprovalUsers = new ArrayList<>();
					
					loanApprovalUsers = x.LoanUsersF();
					firstname = loanApprovalUsers.get(0).getFirstname();
					amount = loanApprovalUsers.get(0).getAmount();
					//id = loanApprovalUsers.get(0).getId();

					String sql = "UPDATE loanrequest SET approved = 'Approved' WHERE firstname = '" + firstname +  "'";
					
					String sql5 = "UPDATE accounts SET approveDecline = 'Approved' WHERE firstname = '" + firstname +  "'";
					
					String sql2 = "UPDATE accounts SET LoanAmount = '" + amount +  "', Checking = '" + amount +
							"' WHERE firstname = '" + firstname +  "' ";
					
					//String sql4 = "UPDATE accounts SET LoanAmount = '" + amount +  "', Checking = '" + amount +
						//	"' WHERE firstname = '" + firstname +  "' ";

					String sql3 = "DELETE FROM loanrequest  WHERE firstname = '" + firstname +  "'  ";

					Class.forName("com.mysql.jdbc.Driver"); 
					Connection con = DriverManager.getConnection(url, uname, pass);
					Statement st = con.createStatement();
					st.executeUpdate( sql);
					System.out.println(id);
					
					

					
					Statement st3 = con.createStatement();
					 note = st3.executeUpdate( sql5);
					
						
					
					
					Statement st1 = con.createStatement();
					st1.executeUpdate( sql2);
					System.out.println(amount);
					System.out.println(firstname);
					
					
					
					Statement st2 = con.createStatement();
					st2.executeUpdate( sql3);

					
				
				
					
					
					}
				catch (Exception e) {
					e.printStackTrace(); 
				}
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

