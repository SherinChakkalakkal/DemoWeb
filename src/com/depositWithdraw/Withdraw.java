package com.depositWithdraw;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;




@WebServlet("/Withdraw.java")
public class Withdraw extends HttpServlet {
	
	int n = 0;
	private static final long serialVersionUID = 1L;
	int amount ;
	

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			String withdraw = request.getParameter("withdraw");
			int withd = Integer.parseInt(withdraw);
			//int depo = int.ParseInteger(deposit);

			
			HttpSession session = request.getSession();

			//HttpSession session = request.getSession();
			session.removeAttribute("message");
			String  name =  (String) session.getAttribute("username");
			if ( n < withd)
				{
				WithdrawDao withDao = new WithdrawDao();
				int temp = withDao.WithdrawDaoF(name);
						if ( temp> withd)
						{
							 amount = temp- withd;
							 System.out.println(amount);
							 WithdrawSecDao withValue = new WithdrawSecDao(); 
							 withValue.WithdrawSecDaoFinal(name,amount);
							session.setAttribute("message", "Amount Withdrawn");
							response.sendRedirect("withdraw.jsp");
						}
						else {
							session.setAttribute("message", "You don't have enough balance");
							response.sendRedirect("DepWith.jsp");
								
							}
				
				
				}	
								
			else {
				session.removeAttribute("message");
				response.sendRedirect("DepWith.jsp");
				}	
			
			
			
	}
	

}  
