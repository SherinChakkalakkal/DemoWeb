package com.loanapproval;


public class LoanUsers {

	private int id;
	private String firstname;
	private String message;	 
	private String email;
	private int amount;
		
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getFirstname() {
		System.out.println(firstname);
		return firstname;
	}


	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}


	public String getMessage() {
		return message;
	}


	public void setMessage(String message) {
		this.message = message;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public int getAmount() {
		return amount;
	}


	public void setAmount(int amount) {
		this.amount = amount;
	}


	public LoanUsers (int id, String firstname, String email ,int amount, String message) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.email = email;
		this.amount = amount;
		this.message = message;
		
	}
	 

}
