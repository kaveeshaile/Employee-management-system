<%@page import="com.oop.model.EmployeeRegistration.employee"%>
<%@page import="com.oop.service.EmployeeRegistration.EmployeeDao"%>
<%@page import="com.oop.service.EmployeeRegistration.EmpolyeeDaoImpl"%>
<%@page import="java.util.ArrayList"%>
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
		<h1>Editting Employee Page</h1>
	</header>
	<br>
	<br>
	<%
		employee employee = (employee) request.getAttribute("employee");
	%>
	<center>
		<form method="POST" action="UpdateEmployeeServlet">
			<h3>Employee ID</h3>
			<input type="text" name="employeeID"
				value="<%=employee.getEmployeeID() %>"
				style="font-size: 150%; width: 50%;" />
			<h3>name</h3>
			<input type="text" name="name"
				value="<%=employee.getName() %>"
				style="font-size: 150%; width: 50%;" />
			<h3>email</h3>
			<input type="text" name="email"
				value="<%=employee.getEmail() %>"
				style="font-size: 150%; width: 50%;" />
			<h3>gender</h3>
			<input type="text" name="gender"
				value="<%=employee.getGender() %>"
				style="font-size: 150%; width: 50%;" />
			<h3>address</h3>
			<input type="text" name="address"
				value="<%=employee.getAddress() %>"
				style="font-size: 150%; width: 50%;" />
			<h3>position</h3>
			<input type="text" name="position"
				value="<%=employee.getPosition() %>"
				style="font-size: 150%; width: 50%;" />
			<h3>username</h3>
			<input type="text" name="username"
				value="<%=employee.getUsername() %>"
				style="font-size: 150%; width: 50%;" />
			<h3>password</h3>
			<input type="text" name="password"
				value="<%=employee.getPassword() %>"
				style="font-size: 150%; width: 50%;" />
				 <input
				type="hidden" name="employeeID" style="font-size: 150%;"
				value="<%=employee.getEmployeeID() %>" />
				<br>
				<br>
				 <input type="submit"
				value="Update employee" class="update" style="font-size: 150%;" />
		</form>

		<table>
			<tr>
				<td colspan="2">
					<form method="POST" action="deleteEmployeeServlet">
						<input type="hidden" name="employeeID" style="font-size: 150%;"
							value="<%=employee.getEmployeeID() %>" /> <input
							type="submit" value="Delete employee" class="delete"
							style="font-size: 150%;" />
					</form>
				</td>
			</tr>
		</table>
	</center>
	<br>
	<br>
	<br>
</body>
</html>