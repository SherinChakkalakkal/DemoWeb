<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ page import = "com.controller.Users" %>
<%@ page import = "java.util.ArrayList" %>
<!DOCTYPE html>
<html>
<head>
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
  	<link rel="stylesheet" type="text/css" href="vendor/Apply/apply.css">
  
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

.titleM{
	color: #01f;
	text-align: right;
	margin: 0;
}
​

.menu {

  display: none;

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

</style>
  
</head>
<body>






​	<% 
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
    <div class="w3-right	">
    	 <a href="Loanapproval.java" >
			 
			
		</a>
      <a href="Logout.java"   class="badge badge-success">Logout</a>
      <a href="#contact" class =  "badge badge-warning">Help</a>
    </div>
  </div>
	
	 <div class="w3-row w3-padding w3-black">

    <div class="w3-col s3">

      <a href="Members.java" class="w3-button w3-block w3-black">Accounts</a>

    </div>

    <div class="w3-col s3">

      <a href="DepWith.jsp" class="w3-button w3-block w3-black">Deposit/Withdraw</a>

    </div>

    <div class="w3-col s3">

      <a href="loanApplication.jsp" class="w3-button w3-block w3-black">Apply Loan</a>

    </div>

    <div class="w3-col s3">

      <a href="Message.java" class="w3-button w3-block w3-black">Messages <span style = " color: red;">${userNotification} </span> </a>
      

    </div>

  </div>

</div>
<section id="contact" style = " margin-top : 5%;">
			<div class="section-content">
				<h1 class="section-header"> <span class="content-header wow fadeIn " data-wow-delay="0.2s" data-wow-duration="2s"> Application Form</span></h1>
			</div>
			<div class="contact-section">
			<div class="container">
			
			
		<!-- 	<form  action = "LoanApplication.java">					
						<div class="login100-form" > <input  type="text" name="Firstname" placeholder="Enter first name"> </div>><br>				
						<div class="login100-form" > <input  type="text" name="Lastname" placeholder="Enter last name"></div><br>	
						<div class="login100-form" > <input  type="text" name="Email" placeholder="Enter email address"> </div><br>
						
						
						
						<input class="login100-form-btn" type="submit">
				</form>   -->
			
			
			
			
			
		 <form  action = "LoanApplication.java">		
						<div class="col-md-6 form-line">
			  			<!-- <div class="form-group">
			  				<label for="exampleInputUsername">Your Firstname</label>
					    	<input type="text" class="form-control" id="" placeholder=" Enter Name" name ="firstname">
				  		</div> -->
				  		<div class="form-group">
					    	<label for="exampleInputEmail">Email Address</label>
					    	<input type="email" class="form-control" id="exampleInputEmail" placeholder=" Enter Email id" name ="email">
					  	</div>	
					  	<div class="form-group">
					    	<label for="telephone">Amount</label>
					    	<input type="number" class="form-control" id="telephone" placeholder=" Enter the loan amount you need." name = "amount">
			  			</div>
			  		</div>
			  		<div class="col-md-6">
			  			<div class="form-group">
			  				<label for ="description"> Message</label>
			  			 	<textarea   class="form-control" id="description" placeholder="Enter Your Message" name ="message"></textarea>
			  			</div>
			  			<div>

			  				<button onclick="myVar = setTimeout(myFunction, 1000)" type="submit" class="btn btn-default submit" name = 'submit'><i class="fa fa-paper-plane" aria-hidden="true" ></i>  Submit</button>
			  			</div>
					</div>
				</form> 
			</div>
			</div>
		</section>


<div class="footer">
  <p>Footer</p>
</div>

<div class="footer">
 <p>Created by Sherin Chakkalakkal- 2020</p> 

</div>

</body>


</html>
    