<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Create Faculty</title>
<script type="text/javascript" src="resources/js/jquery-1.9.1.min.js"></script>
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
			<h2>Register</h2>
			<hr size="1" width="98%" color="silver">

			<sf:form modelAttribute="facultyForm"  id="regForm">'
			
			</sf:form>
		</div>
	</div>
</body>
</html>

