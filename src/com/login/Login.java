package com.login;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.approvalDecline.ApprovalDao;
import com.approvalDecline.ApprovalRequest;
import com.login.dao.LoginDao;





@WebServlet("/Login.java")
public class Login extends HttpServlet {
	
	public int notification = 0;
	public String uname;

	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			 uname = request.getParameter("Username");
			String pass = request.getParameter("Password");
			
			LoginDao dao = new LoginDao();
			ApprovalDao nofi = new ApprovalDao();
			
			if (dao.check(uname, pass))
			{
				HttpSession session = request.getSession();
				
				if (uname.equals("sherin") && pass.equals("1234")) {
					session.setAttribute("message", "    ");
						session.setAttribute("username", uname);
					response.sendRedirect("welcome.jsp");
					
					
					notification = dao.loanRequest ();
					session.setAttribute("notification", notification);
				}
				
				else {
					session.setAttribute("message", "    ");
					session.setAttribute("username", uname);
					notification = dao.userLoanMessage (uname);
					
					
					System.out.println(notification + "Notificationssss	");
					session.setAttribute("userNotification", notification);
					session.setAttribute("userNotification", notification);

					
					response.sendRedirect("welcomeMembers.jsp");
				}
			}
			
			else 
			{
				
				response.sendRedirect("index.jsp");
			}
			
			
	}
	

}  
