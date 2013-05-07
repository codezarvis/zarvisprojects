<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h1>Employee List</h1>
	<hr/>
	
	<table align="center" cellpadding="5" cellspacing="3" border="1">
	
		<tr>
			<th>Employee Id</th>
			<th>Employee Name</th>
			<th>Employee Salary</th>
		
		</tr>
	
	
		<c:forEach items="${employeeList}" var="employee">
		
			<tr>
				<td>${employee.id}</td>
				<td>${employee.name}</td>
				<td>${employee.salary}</td>
				<td><a href="${pageContext.request.contextPath}/employeeHome?id=${employee.id}">Delete</a></td>
				<td><a href="#">Update</a></td>
			
			</tr>
		
		</c:forEach>
	
	
	</table>
	
	
	<a href="${pageContext.request.contextPath}/employeeHome">Add More</a>
	

</body>
</html>