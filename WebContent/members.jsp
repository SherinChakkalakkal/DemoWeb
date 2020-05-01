<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
  
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
    <a href="#home" class="w3-bar-item w3-button"><b>Welcome ${username}</b> Chakkalakkal Family Funds</a>
    <!-- Float links to the right. Hide them on small screens -->
    <div class="w3-right w3-hide-small">
    
      <a href="Logout.java" class="w3-bar-item w3-button">Logout</a>
      <a href="#contact" class="w3-bar-item w3-button">Help</a>
    </div>
  </div>
	
	 <div class="w3-row w3-padding w3-black">

    <div class="w3-col s3">

      <a href="members.jsp" class="w3-button w3-block w3-black">Members</a>

    </div>

    <div class="w3-col s3">

      <a href="#about" class="w3-button w3-block w3-black">Balance</a>

    </div>

    <div class="w3-col s3">

      <a href="#menu" class="w3-button w3-block w3-black">LoanRequest</a>

    </div>

    <div class="w3-col s3">

      <a href="#where" class="w3-button w3-block w3-black">Messages</a>

    </div>

  </div>

</div>


<div class="container" style = "padding-top : 100px;">
                                                                                       
  <div class="table-responsive">          
  <table class="table">
    <thead>
      <tr>
        <th>#</th>
        <th>Firstname</th>
        <th>Lastname</th>
        <th>Email</th>
        <th>Address</th>
        <th>Phone</th>
      </tr>
    </thead>
    <tbody>
      <tr>
        <td>${id} </td>
        <td> ${firstname}</td>
        <td>${lastname}</td>
        <td>${email}</td>
        <td>${phone}</td>
        <td>${address}</td>
      </tr>
      <tr>
        <td>${id} </td>
        <td> ${firstname}</td>
        <td>${lastname}</td>
        <td>${email}</td>
        <td>${phone}</td>
        <td>${address}</td>
      </tr>
    </tbody>
  </table>
  </div>
</div>

</body>
</html>
    