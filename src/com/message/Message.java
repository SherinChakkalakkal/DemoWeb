
package com.message;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.login.dao.LoginDao;


@WebServlet("/Message.java")
public class Message extends HttpServlet {
	
	public int notification = 0;
	public String uname;
	public String memMessage;
	public String approve = "Approved";
	public String decline = "Declined";
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		uname = (String) session.getAttribute("username");
		LoginDao dao = new LoginDao();
		
		dao.userLoanMessage(uname);
		 memMessage = dao.loanMessage ;
		 System.out.println(memMessage + "memMessage");
		
					if ( "Approved".equals(memMessage))  {
					
				
					String message = "Your loan request has been " + memMessage;
					
					System.out.println(message + "loanmessage");
				
					session.setAttribute("loanmessage", message);
					response.sendRedirect("message.jsp");
					
					}
					
					else if ( "Declined".equals(memMessage))   {
						String message = "Your loan request has been " + memMessage;
						
					
						session.setAttribute("loanmessage", message);
						response.sendRedirect("message.jsp");
						
					} else if (memMessage == null){
						
						String message = "You don't have any messages";
						session.setAttribute("loanmessage", message);
						response.sendRedirect("message.jsp");
					} else {
						
						String message = "You don't have any messages";
						session.setAttribute("loanmessage", message);
						response.sendRedirect("message.jsp");
					}
					
					
					
					//LoginDao dao = new LoginDao();
					dao.deleteApprovalData(uname);

				
			
			
			
	}
	

}  
