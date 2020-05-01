package com.balance;



public class BalUsers {

	private String firstname;
	private int savings;
	private int id;
	
	private int loanamount;
	private double interest;
	

	
	public BalUsers (int id, String firstname, int savings, int loanamount) {
		//public Users (int id, int  checking, int savings ,int loanamount, String firstname) {

		super();
		this.id = id;
		/*this.firstname = firstname;*/
		this.interest = interest; 
		this.setLoanamount(loanamount); 
		this.firstname = firstname;
		this.savings = savings;
		
	}
	 
	public int getId() {
		
		return id;
	}
	public void setId(int id) {
		this.savings = id;
	}
	
public double getInterest() {
		
		return interest;
	}
	public void setInterest(double interest) {
		this.interest = interest;
	}
	
	
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	
	
	
	public int getSavings() {
		return savings;
	}
	public void setSavings(int savings) {
		this.savings = savings;
	}

	public int getLoanamount() {
		return loanamount;
	}

	public void setLoanamount(int loanamount) {
		this.loanamount = loanamount;
	}
	 
}
