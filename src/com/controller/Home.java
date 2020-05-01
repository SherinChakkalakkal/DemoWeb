/*package com.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Home")
public class Home extends HttpServlet {
	private static final long serialVersionUID = 1L;
		//   @Resource(name =  )
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			String page = request.getParameter("page");
			page = page.toLowerCase();
			
			switch (page) {
			case("home") :
				request.getRequestDispatcher("welcome.jsp").forward(request, response);
				break;
			case("error") :
				List<Users> listUsers = new ArrayList<>();
				listUsers = new UserModel().listUsers();
				request.setAttribute("listUsers",listUsers);
				request.getRequestDispatcher("Error.jsp").forward(request, response);
				break;
				default:
					request.getRequestDispatcher("Error.jsp").forward(request, response);
					break;
					
				
			}
			
		}

	
	}

*/
