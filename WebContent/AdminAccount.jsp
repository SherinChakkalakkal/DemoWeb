<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
 <%@ page import = "com.balance.BalUsers" %>
<%@ page import = "java.util.ArrayList" %>
<!DOCTYPE html>
<html>
<head>
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
  <!--===============================================================================================-->	
	<link rel="icon" type="image/png" href="images/icons/favicon.ico"/>
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="vendor/bootstrap/css/bootstrap.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="fonts/font-awesome-4.7.0/css/font-awesome.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="fonts/Linearicons-Free-v1.0.0/icon-font.min.css">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">

<link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Inconsolata">
  
  <title>Chakkalakkal Family Funds</title>

<meta charset="UTF-8">

<meta name="viewport" content="width=device-width, initial-scale=1">

<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">

<link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Inconsolata">

<style>

body, html {

  height: 100%;

  font-family: "Inconsolata", sans-serif;

}

​

.bgimg {

  background-position: center;

  background-size: cover;

  background-image: url("/w3images/coffeehouse.jpg");

  min-height: 75%;

}

.footer {
   position: fixed;
   left: 0;
   bottom: 0;
   width: 100%;
   background-color: black;
   color: white;
   text-align: center;
}

.titleM{
	color: #01f;
	text-align: right;
	margin: 0;
}
​

.menu {

  display: none;

}

</style>
  
</head>
<body>






<% 
		response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate ");
		if(session.getAttribute("username") == null) {
			response.sendRedirect("index.jsp");
		}
	%>

<!-- Links (sit on top) -->


<div class="w3-top">
		<div class="w3-bar w3-white w3-wide w3-padding w3-card">
    <a href="#home" class="w3-bar-item w3-button"><b>Welcome ${username} </b> Chakkalakkal Family Funds</a>
    <!-- Float links to the right. Hide them on small screens -->
    <div class="w3-right w3-hide-small">
    	 <a href="Loanapproval.java" >
			  Notification<span  class="badge badge-danger"> ${notification} </span>
			
		</a>
      <a href="Logout.java"   class="badge badge-success">Logout</a>
      <a href="#contact" class =  "badge badge-warning">Help</a>
    </div>
  </div>
	
	 <div class="w3-row w3-padding w3-black">

    <div class="w3-col s3">

      <a href="ListServlet.java" class="w3-button w3-block w3-black">Members</a>

    </div>

    <div class="w3-col s3">

      <a href="AdminBalanceServ.java" class="w3-button w3-block w3-black">Balance</a>

    </div>

    <div class="w3-col s3">

      <a href="Loanapproval.java" class="w3-button w3-block w3-black">LoanRequest</a>

    </div>

    <div class="w3-col s3">

      <a href="contactus.jsp" class="w3-button w3-block w3-black">Contact Members</a>

    </div>

  </div>

</div>


		<div class="container" style = "padding-top : 100px; font-size : 20px;">                                                                                       
		  	<div class="table-responsive" style = "padding-top : 50px;">          
		  			<table class="table  table-bordered" >
							<thead class = "dbHead" class="success">
							    <tr class="success">	      
							      <th scope="col">ID</th>
							      <th scope="col">First Name</th>
							      <th scope="col">Savings</th>
							      <th scope="col">Loans Given</th>
							      <th scope="col">Interest</th>
							      
							    </tr>
							 </thead>
						    		<tbody class="success">
						    	      <% ArrayList<BalUsers> listUsers = new ArrayList <BalUsers>(); 
						    	      double totalAmountReceived = 0;
						    	      double totalLoanAmount = 0; 
						    	      double interest = 0, available =0;
										listUsers = (ArrayList<BalUsers>)request.getAttribute("listUsers");
							        
						        
								        for( int i = 0; i<listUsers.size();i++) {
								        	
								        	out.print("<tr>" + "<td>" +listUsers.get(i).getId() + "</td>" );
												out.print( "<td>"  +listUsers.get(i).getFirstname() + "</td>" );	
												out.print("<td )>" + "$"  +listUsers.get(i).getSavings() + "</td>");
												out.print("<td )>"  + "$" +listUsers.get(i).getLoanamount() + "</td>");
												out.print("<td )>"  + "$" + (listUsers.get(i).getLoanamount()) * 0.03 + "</td>" + "</tr >");
												
												totalAmountReceived = totalAmountReceived+ listUsers.get(i).getSavings();
												totalLoanAmount = totalLoanAmount+ listUsers.get(i).getLoanamount();
												session.setAttribute("totalAmount", totalAmountReceived);
												session.setAttribute("totalLoanAmount", totalLoanAmount);

												} 
								        interest = totalLoanAmount * 0.03 ;
								        session.setAttribute("interest", interest);
								        available = (totalAmountReceived-totalLoanAmount) + interest;
								        session.setAttribute("available", available);

								        out.print("<tr>" + "<td>" + "Total" + "</td>" );
								         out.print( "<td>" + "--" + "</td>" );
								         out.print( "<td >" + "= $" +  totalAmountReceived + "</td>");
								         out.print( "<td >" + "= $" +totalLoanAmount + "</td>");
								         out.print( "<td >" + "= $" +interest + "</td>" + "</tr>");

								        
								        
								        %>
				   					</tbody>						  
					</table>
		 	 </div>
		</div>
		
					
			<div class="container">
			                                                                                      
				 <div class="table-responsive" >          
				  <table class="table table-striped">
					    <tr class="active">
					    <th>Total Amount Available</th>
					     <td>$${available}</td>
					  </tr>
					 
					</table>
			  	</div>
			</div>
					
		
		
		

<div class="footer">
  <p>Created by Sherin Chakkalakkal- 2020</p>
</div>		
</body>
</html>
    