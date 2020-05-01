package com.balance;



import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
 
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
@WebServlet("/AdminBalanceServ.java")
public class AdminBalanceServ extends HttpServlet {
    private static final long serialVersionUID = 1L;
 
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    	BalanceDao bDao = new BalanceDao();
         try {
 
            List<BalUsers> listUsers = bDao.listUsers();
            request.setAttribute("listUsers", listUsers);
            	
            
            	
          /*  BalanceDao totalAmountDao = new BalanceDao();
            List<totalAmountUsers> totalAmountUsers = bDao.totalAmountUsers();
            request.setAttribute("totalAmountUsers", totalAmountUsers); */
            
            
            RequestDispatcher dispatcher = request.getRequestDispatcher("AdminAccount.jsp");
            dispatcher.forward(request, response);
 
        } catch (SQLException e) {
            e.printStackTrace();
            throw new ServletException(e);
        }
    }
}