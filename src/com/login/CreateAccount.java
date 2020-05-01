package com.login;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import javax.swing.JOptionPane;


import com.login.dao.CreateDao;

@WebServlet("/CreateAccount.java")
public class CreateAccount extends HttpServlet {
	
	
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			String firstname = request.getParameter("Firstname");
			String lastname = request.getParameter("Lastname");
			String email = request.getParameter("Email");
			String phone = request.getParameter("Phone");
			String address = request.getParameter("Address");
			String password = request.getParameter("Password");
			String fee = request.getParameter("fee");
			String message = "no data" ;
			int feeAmount = Integer.parseInt(fee);
			HttpSession session = request.getSession();


			//ClassNameHere x = new ClassNameHere();
			CreateDao cdao = new CreateDao();
			//cdao.check(firstname, lastname, email, phone, address, password);
			if (cdao.check(firstname, lastname, email, phone, address, password, feeAmount))
			{
				//request.setAttribute("message", "Account has been created,please login to continue");
				message = "Account has been created,please login to continue";

				session.setAttribute("created", "Account has been created,please click LOGIN to continue");
				//session.setAttribute("username", firstname);
				response.sendRedirect("createaccount.jsp");
			
			}
			
			else {
				session.setAttribute("created", "   ");

			}
			
			//x.infoBox( message );
						
				
	}

}



 class ClassNameHere
{

    public  void infoBox(String infoMessage)
    {
        JOptionPane.showMessageDialog(null, infoMessage, "InfoBox: " , JOptionPane.INFORMATION_MESSAGE);
    }
}

