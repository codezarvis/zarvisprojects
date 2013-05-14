<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
<script type="text/javascript" src="resources/js/jquery-1.9.1.min.js"></script>
<script type="text/javascript">
	$(document).ready(function() {
		
		$('#username').blur(function() {

			var username = $('#username').val();

			if (username.length == 0) {

				$('#usernameerror').show();

			}

		});
		$('#username').focus(function() {

			$('#usernameerror').hide();
			$('#Errormsg').hide();

		});
		$('#password').blur(function() {

			var username = $('#password').val();

			if (username.length == 0) {

				$('#passworderror').show();

			}

		});
		$('#password').focus(function() {

			$('#passworderror').hide();
			$('#Errormsg').hide();

		});

		$('#login').click(function() {
			$('#login').hide();
			var username = $('#username').val();
			var password = $('#password').val();

			$('#login').hide();
			$('#cb').hide();

			var error = false;

			if (username.length == 0) {
				error = true;

				$('#usernameerror').show();

			}
			if (password.length == 0) {
				error = true;
				$('#passworderror').show();
			}
			if (error) {

				$('#login').show();
				$('#cb').show();

				return;
			}
			$('#loader').show();
			$.ajax({

				type : 'POST',
				url : '${pageContext.request.contextPath}/login',
				data : $('#LoginForm').serialize(),
				success : function(response) {
					
					//alert(response);
					
					if (response == 'admin') {

					    setTimeout('showadminpage()');
					}
					if (response == 'student') {

					    setTimeout('showstudentpage()');
					}
					if (response == 'faculty') {

					    setTimeout('showfacultypage()');
					}
					if (response == null || response.length == 0){
					    $('#login').show();
					    $('#cb').show();

					    $('#loader').hide();
					    $('#Errormsg').show();

					}

				}
			});
		});

	});
	function showadminpage() {
		window.location = '${pageContext.request.contextPath}/admin';
	}
	function showstudentpage() {
		window.location = '${pageContext.request.contextPath}/shome';
	}
	function showfacultypage() {
		window.location = '${pageContext.request.contextPath}/fhome';
	}
	window.history.forward();
</script>
<link rel="stylesheet" type="text/css" href="resources/css/Allstyle.css" />

</head>
<body>

	<div id="top">
		<img alt="" src="resources/images/top.png" width="640px">
	</div>
	<div id="head"></div>
	<div id="container">

		<div id="items">
			<br>
			<h2>
				LogIn
				<!-- <a href="register.jsp">Register</a> -->
			</h2>
			<hr size="1" width="98%" color="silver">

			<span id="Errormsg" style="display: none"><font color="red"
				size="">Invalid UserName/Password </font></span>

			<sf:form modelAttribute="appUserForm" id="LoginForm">

				<br> USERNAME<br>
				<sf:input path="userName" maxlength="20px" size="50px"
					name="username" id="username" />
				<span id="usernameerror" style="display: none; margin-left: 25px;"><font
					color="red">UserName Is Required </font></span>
				<br>
				<br>
                    PASSWORD<br>
				<sf:password path="password" maxlength="20" size="50px" name="password"
					id="password" />
				<span id="passworderror" style="display: none; margin-left: 25px;"><font
					color="red">Confirm Password Is Required </font></span>
				<br>
				<br>
				<input type="button" value="Login" id="login"
					style="font-size: 20px; color: white; background-color: blue;">

			</sf:form>
			<a href="<%=request.getContextPath()%>/forgetPassword"> Forgot Password </a> <img alt=""
				src="resources/images/ajax.gif" id="loader" style="display: none">
		</div>
		<div id="bottom">
			<img alt="" src="resources/images/top.png" width="640px">
		</div>

	</div>



</body>
</html>