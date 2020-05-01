package com.loanapproval;




import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.balance.BalUsers;
import com.balance.BalanceDao;





@WebServlet("/Loanapproval.java")
public class LoanApproval extends HttpServlet {
	
	public int notification = 0;
	public boolean noDataB = false;
    private static final long serialVersionUID = 1L;
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    	LoanDao loanDao = new LoanDao();
    	BalanceDao bDao = new BalanceDao();
		
    	
         try {

            List<LoanUsers> loanUsers = loanDao.LoanUsersF();
            
            List<BalUsers> balanceList = new ArrayList<>();

    		balanceList= bDao.listUsers();
    		request.setAttribute("balanceList", balanceList);
            
            request.setAttribute("loanUsers", loanUsers);
            
            noDataB= loanDao.noData;
         
            request.setAttribute("noDataB", noDataB);

            RequestDispatcher dispatcher = request.getRequestDispatcher("loanApproval.jsp");
            dispatcher.forward(request, response);
 
        } catch (SQLException e) {
            e.printStackTrace();
            throw new ServletException(e);
        }
    }
}