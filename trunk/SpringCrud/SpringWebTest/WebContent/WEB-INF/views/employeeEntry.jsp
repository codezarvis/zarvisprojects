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
	<h1>Employee Data Entry</h1>
	<hr/>
	
	
	<sf:form modelAttribute="employeeForm">
	<table align="center">
			
			<tr>
				<td>Employee Id</td>
				<td><sf:input path="id"/></td>
			
			</tr>
			
			<tr>
				<td>Employee Name</td>
				<td><sf:input path="name"/></td>
			
			</tr>
			
			<tr>
				<td>Employee Salary</td>
				<td><sf:input path="salary"/></td>
			
			</tr>
			
			
			<tr>
				<td></td>
				<td><input type="submit" value="Create"/></td>
			
			</tr>		
			
		
		</table>
	</sf:form>
</body>
</html>