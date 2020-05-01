package com.balance;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

//import com.controller.Users;

public class BalanceDao {
	
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
	public double interest;
	
	
	public  List<BalUsers> listUsers() throws SQLException
	{
		List<BalUsers> listUsers = new ArrayList<>();
		try {

		String sql = "SELECT idAccounts,Savings, firstname, LoanAmount  from accounts";
		Class.forName("com.mysql.jdbc.Driver"); 
		Connection con = DriverManager.getConnection(url, uname, pass);
		Statement st = con.createStatement();
		ResultSet result = st.executeQuery(sql);	
	 
			while (result.next()){
				listUsers.add(new BalUsers(result.getInt("idAccounts"), result.getString("firstname"), result.getInt("Savings"),
						result.getInt("LoanAmount")));
					 
			}
			
			for (int i =0 ; i <listUsers.size(); i++) {
			interest = listUsers.get(i).getLoanamount() * 0.03 ;
			firstname = listUsers.get(i).getFirstname();
			System.out.println(interest);
			System.out.println(firstname);
			//String sql3 = "UPDATE accounts SET interest = '" + interest +  	"' ";
			
			String sql2 = "UPDATE accounts SET interest = '" + interest +  "' WHERE firstname = '" + firstname +  "'";

			
			//"DELETE FROM loanrequest  WHERE firstname = '" + firstname +  "'  ";
			
			Statement st1 = con.createStatement();
			st.executeUpdate( sql2);
	
			}
			
			interest =listUsers.get(0).getLoanamount();
			
		}
		catch (Exception e) {
			e.printStackTrace(); 
		}
		return listUsers;
	}
	
/*	
	
	public  List<totalAmountUsers> totalAmountUsers() throws SQLException
	{
		List<BalUsers> listUsers = new ArrayList<>();
		try {

		String sql = "SELECT idAccounts,Savings, firstname  from accounts";
		//String sql1 = "SELECT Savings  from accounts";
		Class.forName("com.mysql.jdbc.Driver"); 
		Connection con = DriverManager.getConnection(url, uname, pass);
		Statement st = con.createStatement();
		ResultSet result = st.executeQuery(sql);	
	 
			while (result.next()){
				listUsers.add(new BalUsers(result.getInt("idAccounts"), result.getString("firstname"), result.getInt("Savings")));
				//listUsers.add(new BalUsers(result.getInt(1), result.getString(2), result.getString(3), result.getString(4), result.getString(6), result.getString(7)));

			 
			}
			
			/*ResultSet result1 = st.executeQuery(sql1);	
			 
			while (result2.next()){
				listUsers.add(new BalUsers(result.getInt("idAccounts"),result.getInt("Savings")));
				//listUsers.add(new BalUsers(result.getInt(1), result.getString(2), result.getString(3), result.getString(4), result.getString(6), result.getString(7)));

			 
			} 
			
		} 
		catch (Exception e) {
			e.printStackTrace(); 
		}
		return listUsers;
	}   */



}


