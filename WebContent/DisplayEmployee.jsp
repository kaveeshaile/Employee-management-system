<%@page import="com.oop.model.EmployeeRegistration.employee"%>
<%@page import="com.oop.service.EmployeeRegistration.EmployeeDao"%>
<%@page import="com.oop.service.EmployeeRegistration.EmpolyeeDaoImpl"%>
<%@page import="java.util.ArrayList"%> 
<%@page import="java.util.List"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
body {
	background-color: lightblue;
}

header {
	text-align: center;
	color: red;
	padding-top: 0%;
	font-size: 150%;
}

h3 {
	font-size: 30px;
	color: blueviolet;
}
</style>

</head>
<body>
	<header>
		<h1>Display Employee Details</h1>
	</header>
	<div>
		<center>
			<table border="1" cellpadding="20" id="all"
				style="border: 1px solid black;">
				<tr style="background-color:aliceblue ;">
					<th>employee ID</th>
					<th>name</th>
					<th>email</th>
					<th>Gender</th>
					<th>address</th>
					<th>position</th>
					<th>username</th>
					<th>password</th>
				</tr>
				<%
					EmployeeDao EmployeeDao = new EmpolyeeDaoImpl();
					List<employee> employeeDetails = EmployeeDao.getemployee(); 

					for (employee employee : employeeDetails) {
				%>
				<tr style="background-color:white ;">
					<td><%=employee.getEmployeeID()%></td>
					<td><%=employee.getName()%></td>
					<td><%=employee.getEmail()%></td>
					<td><%=employee.getGender()%></td>
					<td><%=employee.getAddress()%></td>
					<td><%=employee.getPosition()%></td>
					<td><%=employee.getUsername()%></td>
					<td><%=employee.getPassword()%></td>
					
				</tr>
				<%
					}
				%>
			</table>
			<br>
			<br>
			<br>
			<table>
				<tr>
					<td colspan="2">
						<button type="button"
							style="border-radius: 10%; font-size: 200%; background-color: blanchedalmond;"
							onclick="window.location='EmployeeMainInterface.jsp'">home</button>
					</td>
				</tr>
			</table>
		</center>
	</div>

</body>
</html>