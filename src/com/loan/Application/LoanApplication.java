package com.loan.Application;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/LoanApplication.java")
public class LoanApplication extends HttpServlet {
	
	
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			//String firstname = request.getParameter("firstname");
			String email = request.getParameter("email");
			String amount = request.getParameter("amount");
			String message = request.getParameter("message");
			String approved = "Null" ;
			String declined = "Null";
			String uname;
			Integer databaseAmount = Integer.parseInt(amount);
			
			//int depo = Integer.parseInt(deposit);
			//LoginDao dao = new LoginDao();
			HttpSession session = request.getSession();
			uname = (String) session.getAttribute("username");
			ApplicationDao applicationDao = new ApplicationDao();
			//cdao.check(firstname, lastname, email, phone, address, password);
			if (applicationDao.ApplicationF(uname, email, databaseAmount, approved,declined, message))
			{
				//request.setAttribute("message", "Account has been created,please login to continue");
				session.setAttribute("message", "Application Has Been Submited");
				//session.setAttribute("username", firstname);
				response.sendRedirect("welcomeMembers.jsp");
			
			}
			
			
			
				
	}

}
