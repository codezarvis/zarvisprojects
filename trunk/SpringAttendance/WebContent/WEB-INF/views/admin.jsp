<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>| ADMIN | HOME</title>
<style type="text/css">
body {
	min-width: 960px;
	min-height: auto;
	background-color: #ffff66;
}

ul li {
	list-style: none;
}

#top {
	margin-left: 185px;
	padding-bottom: 2px;
}

#container {
	padding-top: 2px;
	margin-left: auto;
	margin-right: auto;
	width: 960px;
	height: 500px;
	background-color: black;
}

#menu {
	position: relative;
	margin-top: 50px;
	left: 5px;
	width: 940px;
	height: 50px;
	background-color: blue;
	background-image: url("images/top.png");
	text-decoration: none;
}

#menu ul li a {
	float: left;
	font-size: 20px;
	padding-top: 10px;
	padding-bottom: 20px;
	padding-left: 2px;
	padding-right: 15px;
	text-decoration: none;
	color: white;
}

#menu ul li a:HOVER {
	border-right-width: 20px;
	color: red;
	height: 20px;
	background-color: maroon;
}

#items {
	margin-left: 25px;
	margin-right: 15px;
	width: 580px;
	height: auto;
	font-size: 15px;
	font-family: sans-serif cursive;
	background-color: white;
}

#items a {
	float: right;
	color: black;
	text-decoration: none;
}

#items a:HOVER {
	font-style: bold;
	background-color: #99ff33;
	color: red;
}

#welcome {
	margin-top: 15px;
	font-size: 25px;
	padding-right: 25px;
	color: #99ffcc;
	float: right;
}
</style>
</head>
<body>
	<div id="top">
		<img src="resources/images/top.png" width="970px">
	</div>
	<div id="container">
		<div id="welcome">WELCOME 	</div>
		<div id="menu">
			<ul>
				<li><a href="<%=request.getContextPath()%>/createFaculty"> CREATE FACULTY</a></li>
				<li><a href="<%=request.getContextPath()%>/createStudent"> CREATE STUDENT </a></li>
				<li><a href="#"> ASSIGN FACULTY </a></li>
				<li><a href="<%=request.getContextPath()%>/changePassword"> CHANGE PASSWORD </a>
				<li><a href="login.jsp"> SIGNOUT </a>
			</ul>

		</div>
		<div id="items"></div>
	</div>
</body>
</html>