<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

    <!DOCTYPE html>
<html lang="en">
<head>
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
	
	<div class="limiter">
		<div class="container-login100" style="background-image: url('images/2.jpg');">
			<div class="wrap-login100 p-t-30 p-b-50">
				<span class="login100-form-title p-b-41">
					Create Account
				</span>
				<form  action = "CreateAccount.java">					
						<div class="login100-form" > <input  style= " margin-left : 4%" type="text" name="Firstname" placeholder="   Enter first name"  > </div>><br>				
						<div class="login100-form" > <input  style= " margin-left : 4%"  type="text" name="Lastname" placeholder="   Enter last name"></div><br>	
						<div class="login100-form" > <input style= " margin-left : 4%" type="text" name="Email" placeholder="   Enter email address"> </div><br>
						<div class="login100-form" ><input   style= " margin-left : 4%" type="number" name="Password" placeholder="   Enter Password"></div><br>
						<div class="login100-form" ><input  style= " margin-left : 4%" type="text" name="Address" placeholder="   Enter Address"></div><br>
						<div class="login100-form" ><input  style= " margin-left : 4%" type="number" name="Phone" placeholder="   Enter Phone Number"></div><br>
						<div class="login100-form" ><input style= " margin-left : 4%"  type="number" name="fee" placeholder="   Deposit $500 "></div><br>
						<div style = "margin : auto;   display: inline-block;">		
						<input class="login100-form-btn"  onclick="myFunction()"  placeholder = "Submit" type="submit" value = "Submit"> 
						</div>
				</form>
				
				<a href = "index.jsp" style = "color : white"> ${created}  </a>
				
				
			</div>
		</div>
	</div>
	
	
	
	
	
	
	
	

	
<!--===============================================================================================-->
	<script src="vendor/jquery/jquery-3.2.1.min.js"></script>
<!--===============================================================================================-->
	<script src="vendor/animsition/js/animsition.min.js"></script>
<!--===============================================================================================-->
	<script src="vendor/bootstrap/js/popper.js"></script>
	<script src="vendor/bootstrap/js/bootstrap.min.js"></script>
<!--===============================================================================================-->
	<script src="vendor/select2/select2.min.js"></script>
<!--===============================================================================================-->
	<script src="vendor/daterangepicker/moment.min.js"></script>
	<script src="vendor/daterangepicker/daterangepicker.js"></script>
<!--===============================================================================================-->
	<script src="vendor/countdowntime/countdowntime.js"></script>
<!--===============================================================================================-->
	<script src="js/main.js"></script>

</body>
</html>




    