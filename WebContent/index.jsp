<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en">
<head>
	<title>Chakkalakkal Family funds</title>
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
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="vendor/animate/animate.css">
<!--===============================================================================================-->	
	<link rel="stylesheet" type="text/css" href="vendor/css-hamburgers/hamburgers.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="vendor/animsition/css/animsition.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="vendor/select2/select2.min.css">
<!--===============================================================================================-->	
	<link rel="stylesheet" type="text/css" href="vendor/daterangepicker/daterangepicker.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="css/util.css">
	<link rel="stylesheet" type="text/css" href="css/main.css">
<!--===============================================================================================-->
</head>
<body>
	<% 
		response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate ");
	session.removeAttribute("message");
	session.removeAttribute("created");
	session.removeAttribute("notification");
	
	%>
	<div class="limiter">
		<div class="container-login100" style="background-image: url('images/MUNNAR.jpg');">
			<span class="login100-form-titleM ">
				Welcome To <br/>
				Chakkalakkal Family Funds
				</span>
				
				
							<div class="wrap-login100 p-t-30 p-b-50">
							<h5 style = "color : white" >${message} </h5> <br/> <br/>
 				<span class="login100-form-title p-b-41">
					Account Login
					
				</span>
				
				
				
				<form  action = "Login.java" >					
						<div class="login100-form" class="focus-input100" > 
							<input style= " margin-left : 4%" type="text" name="Username" placeholder="Enter User name">
							<span class="focus-input100" data-placeholder="&#xe82a;"></span>
						</div> <br/>
				
						<div class="login100-form"> 
							 <input style= " margin-left : 4%"  type="password" name="Password" placeholder="Enter Password">
						</div><br>	
						
						<input class="login100-form-btn" onclick="myFunction()" type="submit" value = "Login">
						
	
					

				</form>
				
					
						<a href="Forgot.html" class="txt1">
							Forgot Username / Password?
						</a>
						<a href="createaccount.jsp" class="txt1">
						Create Account
						</a>
					
						
					
			</div>
		</div>
	</div>


</body>
</html>