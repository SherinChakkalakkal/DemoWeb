

package com.login.members;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

//import com.login.dao.MemberServlet;
import com.login.dao.MembersDao;


@WebServlet("/Members.java")
public class Members extends HttpServlet {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
		
		HttpSession session = request.getSession();

		//HttpSession session = request.getSession();
		String  name =  (String) session.getAttribute("username");
		 System.out.println(name);
			//String name = request.getAttribute("username");
			//String uname = request.getParameter("Username");
			MembersDao mDao = new MembersDao();
			mDao.memFunction(name);
			
			
		
			
				//HttpSession session = request.getSession();
			
				session.setAttribute("id", mDao.id);
				session.setAttribute("checking", mDao.checking);
				session.setAttribute("savings", mDao.savings);
				session.setAttribute("loan", mDao.loan);
				session.setAttribute("interest", mDao.interest);
				
				
				
				
	response.sendRedirect("MemAccounts.jsp");
			
	}

}
