package com.loanapproval;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class LoanDao {


	
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
	//public boolean noData = false;
	public boolean noData;


public  List<LoanUsers> LoanUsersF() throws SQLException
{
	List<LoanUsers> loanUsers = new ArrayList<>();
	try {

	String sql3 = "SELECT * from loanrequest";
	Class.forName("com.mysql.jdbc.Driver"); 
	Connection con = DriverManager.getConnection(url, uname, pass);
	Statement st = con.createStatement();
	ResultSet result = st.executeQuery(sql3);	
 
		while (result.next()){
			loanUsers.add(new LoanUsers(result.getInt(1), result.getString(2), result.getString(3), result.getInt(4), result.getString(5))); 
			noData = true;
		}
		

        for( int i = 0; i<loanUsers.size();i++) {
        	
        	System.out.print(loanUsers.get(i).getId());
        	System.out.print( loanUsers.get(i).getFirstname());	
        	System.out.print(loanUsers.get(i).getEmail());
        	System.out.print(loanUsers.get(i).getAmount() );
        	System.out.print(loanUsers.get(i).getMessage());
				
				//session.setAttribute("totalLoanAmount", totalLoanAmount);

				} 
        
		
	}
	catch (Exception e) {
		e.printStackTrace(); 
	}
	return loanUsers;
}





}



