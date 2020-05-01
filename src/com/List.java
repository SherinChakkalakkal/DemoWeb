package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;


public class List {


	public static void main(String[] args) {
			
		int count = 0;
		int id;
		String firstname;
		String lastname;
		String email;
		String password;
		String address;
		String phone;
		
		
			
			String url = "jdbc:mysql://localhost:3306/users";
			String uname = "root";
			String pass = "1234";
			
			String sql = "SELECT * from users";
			ArrayList<Users> listUsers = new ArrayList<Users>();
			try {
			Class.forName("com.mysql.jdbc.Driver"); 
			Connection con =  DriverManager.getConnection(url, uname, pass);
			PreparedStatement st = ((java.sql.Connection) con).prepareStatement(sql);
			ResultSet result = st.executeQuery();	
		 
					while (result.next()){
					listUsers.add(new Users(result.getInt(1), result.getString(2), result.getString(3), result.getString(4), result.getString(6), result.getString(7)));
					 
					//request.setAttribute("data", listUsers);
					}
					
					for( int i = 0; i< listUsers.size();i++) {
						System.out.print(listUsers.get(i).getId() );
						System.out.print(listUsers.get(i).getFirstname() );		
						System.out.print(listUsers.get(i).getLastname());		
						System.out.print(listUsers.get(i).getEmail() );
						System.out.print(listUsers.get(i).getAddress());
						System.out.println(listUsers.get(i).getPhone() );
						}
					
			
				
			}
			catch (Exception e) {
				e.printStackTrace(); 
			}
			
		}
	
	}





 class Users {
	private int id;
	private String firstname;
	private String lastname;	 
	private String email;
	private String address;
	private String phone  ;
	
	public Users (int id, String firstname, String lastname ,String email, String address,String phone) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.address = address;
		this.phone = phone;
		
	}
	 
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	 
}

	

	
	




