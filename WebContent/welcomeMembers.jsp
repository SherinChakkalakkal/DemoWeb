 <%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>

<html>

<title>Chakkalakkal Family Funds</title>

<meta charset="UTF-8">

<meta name="viewport" content="width=device-width, initial-scale=1">
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


<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>


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
.foot {
	padding : 100px;
}
</style>


<body>

	<% 
	session.removeAttribute("message");
	%>

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
<img src="images/kerala.jpg" alt="Girl Hat" style="width:100% ; height : 100% " class="w3-padding-16">


<div class="footer">
 <p>Created by Sherin Chakkalakkal- 2020</p> 
</div>

</html>