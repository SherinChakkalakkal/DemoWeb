 <%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>

<html>

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
.foot {
	padding : 100px;
}
</style>


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

      <a href="Error.jsp" class="w3-button w3-block w3-black">Messages</a>

    </div>

  </div>

</div>



<h1 class="foot"> Something Went Wrong  </h1>



<div class="footer">
  <p>Footer</p>
</div>

</html>