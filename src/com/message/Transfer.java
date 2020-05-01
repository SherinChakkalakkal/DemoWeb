
package com.message;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.login.dao.LoginDao;


@WebServlet("/Transfer.java")
public class Transfer extends HttpServlet {
	
	public int notification = 0;
	public String uname;

	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		uname = (String) session.getAttribute("username");
		//Login name = new Login();
		LoginDao dao = new LoginDao();
		dao.deleteApprovalData(uname);
		System.out.println(uname + "username");
		
		

		//String message = dao.loanMessage;
		
		//System.out.println(message + "loanmessage");

		//session.setAttribute("loanmessage", message);
	
				session.removeAttribute("notification");
				String message = "You don't  have any messages ";
				session.setAttribute("loanmessage", message);

				response.sendRedirect("welcomeMembers.jsp");
			
			
			
	}
	
	
}
	
	

