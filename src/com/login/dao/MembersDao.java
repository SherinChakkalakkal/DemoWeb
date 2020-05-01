package com.login.dao;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.servlet.http.HttpServlet;

/**
 * Servlet implementation class Logout
 */
//@WebServlet("/MembersDao.java")
public class MembersDao extends HttpServlet {
	
	
	private static final long serialVersionUID = 1L;
	
	
	
	String url = "jdbc:mysql://localhost:3306/users";
	String uname = "root";
	String pass = "1234";
	

	
	int count = 0;
	public int id;
	public double checking;
	public double savings;
	public double loan;
	public double interest;
	public double result2;
	//String sql = "SELECT * FROM accounts WHERE firstname = ? ";
	
	//String sql = "SELECT * from accounts " + " WHERE firstname >='?'";
	
	//String sql = "SELECT * FROM accounts WHERE firstname = ? ";

/*	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();

		//HttpSession session = request.getSession();
		 name =  (String) session.getAttribute("username");
		 System.out.println(name);
		 
	} */


	public void memFunction (String N)
	{
		try {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, uname, pass);
		String sql = "select * from accounts WHERE firstname = '" + N +  "'"; 

		PreparedStatement st = con.prepareStatement(sql);
		//st.setString(1, N);
		ResultSet result = st.executeQuery( sql);



		
			
		result.next();
				 id = result.getInt(1);
				 System.out.println(id);
			     checking = result.getDouble(2);
			     savings = result.getDouble(3);
			     loan = result.getDouble(4);
			     interest = loan * 0.03;
			     
					String sql2 = "UPDATE accounts SET interest = '" + interest +  "' WHERE firstname = '" + N +  "'";
    
			     PreparedStatement st2 = con.prepareStatement(sql2);
				 double result2 = st2.executeUpdate( sql2);
			     
				 System.out.println(result);
			
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

