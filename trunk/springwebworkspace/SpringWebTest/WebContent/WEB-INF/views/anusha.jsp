
<%@taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1 align="center">Welcome Login</h1>


	<sf:form modelAttribute="loginForm">
	
		<table align="center">
			
			<tr>
				<td>User Name</td>
				<td><sf:input path="userName"/></td>
			
			</tr>
			
			<tr>
				<td>Password</td>
				<td><sf:password path="password"/></td>
			
			</tr>
			
			<tr>
				<td></td>
				<td><input type="submit" value="Login"/></td>
			
			</tr>		
			
		
		</table>
	
	
	</sf:form>







</body>
</html>