 <%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>



<html>

<title>Chakkalakkal Family Funds</title>

<meta charset="UTF-8">

<meta name="viewport" content="width=device-width, initial-scale=1">

<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">

<link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Inconsolata">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>



<style>

body, html {

  height: 100%;

  font-family: "Inconsolata", sans-serif;

}

​.login100-form-btn {
  font-family: Ubuntu-Bold;
  font-size: 18px;
  color: #fff;
  line-height: 1.2;
  text-transform: uppercase;

  display: -webkit-box;
  display: -webkit-flex;
  display: -moz-box;
  display: -ms-flexbox;
  display: flex;
  justify-content: center;
  align-items: center;
  padding: 0 20px;
  min-width: 130px;
  height: 30px;
  border-radius: 21px;

  background: #d41872;
  background: -webkit-linear-gradient(left, #a445b2, #d41872, #fa4299);
  background: -o-linear-gradient(left, #a445b2, #d41872, #fa4299);
  background: -moz-linear-gradient(left, #a445b2, #d41872, #fa4299);
  background: linear-gradient(left, #a445b2, #d41872, #fa4299);
  position: relative;
  z-index: 1;

  -webkit-transition: all 0.4s;
  -o-transition: all 0.4s;
  -moz-transition: all 0.4s;
  transition: all 0.4s;
}


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
		
		session.removeAttribute("message");

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




<div class="container" style = "padding: 100px 10px 10px 0px;">  <h2> Select Deposit or Withdraw</h2>
  
	<a href="deposit.jsp" class="btn btn-info" role="button">Deposit</a>
	<a href="withdraw.jsp" class="btn btn-info" role="button">Withdraw</a>
 

</div>

<div class="footer">
 <p>Created by Sherin Chakkalakkal- 2020</p> 

</div>

</html>