package com.approvalDecline;


import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.balance.BalUsers;
import com.balance.BalanceDao;
 
@WebServlet("/ApprovalRequest.java")
public class ApprovalRequest extends HttpServlet {
    private static final long serialVersionUID = 1L;
 
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    		ApprovalDao appDao = new ApprovalDao();
	         
	        	 appDao.approvalF();
	        	 int x = appDao.note;
	            //List<BalUsers> listUsers = bDao.listUsers();
	            //request.setAttribute("approved", approved);
	            
	        	 HttpSession session = request.getSession();
					session.setAttribute("notification", x);

	          /*  BalanceDao totalAmountDao = new BalanceDao();
	            List<totalAmountUsers> totalAmountUsers = bDao.totalAmountUsers();
	            request.setAttribute("totalAmountUsers", totalAmountUsers); */
	            
	            
	            RequestDispatcher dispatcher = request.getRequestDispatcher("Loanapproval.java");
	            dispatcher.forward(request, response);
	 
	         
    }
}