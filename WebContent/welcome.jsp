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


<style>

body, html {

  height: 100%;

  font-family: "Inconsolata", sans-serif;

}

​
.hero-image {
  background-image: linear-gradient(rgba(0, 0, 0, 0.5), rgba(0, 0, 0, 0.5)), url("photographer.jpg");
  height: 50%;
  background-position: center;
  background-repeat: no-repeat;
  background-size: cover;
  position: relative;
}

.hero-text {
  text-align: center;
  position: absolute;
  top: 50%;
  left: 50%;
  transform: translate(-50%, -50%);
  color: white;
}

.hero-text button {
  border: none;
  outline: 0;
  display: inline-block;
  padding: 10px 25px;
  color: black;
  background-color: #ddd;
  text-align: center;
  cursor: pointer;
}

.hero-text button:hover {
  background-color: #555;
  color: white;
}
.bgimg {

  background-position: center;

  background-size: cover;

  background-image: url("/w3images/coffeehouse.jpg");

  min-height: 75%;

}

.centered {
  position: absolute;
  top: 50%;
  left: 50%;
  transform: translate(-50%, -50%);
  font-size : 50px;
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

* {
  box-sizing: border-box;
}

body {
  margin: 0;
  font-family: Arial;
}

.header {
  text-align: center;
  padding: 32px;
}

.row {
  display: -ms-flexbox; /* IE10 */
  display: flex;
  -ms-flex-wrap: wrap; /* IE10 */
  flex-wrap: wrap;
  padding: 14 4px;
}

/* Create four equal columns that sits next to each other */
.column {
  -ms-flex: 25%; /* IE10 */
  flex: 25%;
  max-width: 210%;
  padding:  4px;
}

.column img {
  margin-top: 50px;
  vertical-align: middle;
  width: 15%;
}

/* Responsive layout - makes a two column-layout instead of four columns */
@media screen and (max-width: 800px) {
  .column {
    -ms-flex: 50%;
    flex: 50%;
    max-width: 50%;
  }
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

      <a href="contactus.jsp" class="w3-button w3-block w3-black">	
 
       Messages
       
       </a>

    </div>

  </div>

</div>

<!-- Header -->

<img src="images/kera.jpg" alt="Girl Hat" style="width:100% ; height : 100% " class="w3-padding-16">


<div class="footer">
  <p>Created by Sherin Chakkalakkal- 2020</p>
</div>
</body>

</html>