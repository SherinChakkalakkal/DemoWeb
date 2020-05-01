package com.depositWithdraw;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;




@WebServlet("/DepositWithdraw.java")
public class DepositWithdraw extends HttpServlet {
	
	int n = 0;
	private static final long serialVersionUID = 1L;
	int amount ;
	int checking;
	int loanamount;
	int id;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			String deposit = request.getParameter("deposit");
			int depo = Integer.parseInt(deposit);
			//int depo = int.ParseInteger(deposit);

			
			HttpSession session = request.getSession();

			//HttpSession session = request.getSession();
			session.setAttribute("message", "");
			String  name =  (String) session.getAttribute("username");
			if ( n < depo)
				{
				DepWithDao deposDao = new DepWithDao();
				 amount = depo + deposDao.depositWithdraw(name);
				 System.out.println(amount);
				Deposit depValue = new Deposit(); 
				depValue.depositFinal(name,amount);
				session.setAttribute("message", "Amount Deposited");
				response.sendRedirect("deposit.jsp");
				
				
				}	
								
			else {
				session.removeAttribute("message");
				response.sendRedirect("DepWith.jsp");
				}	
			
			
			
	}
	

}  
