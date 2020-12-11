<%@page import="com.emp.employeePayment"%>
<%@page import="com.emp.emplyoyeeDButil"%>
<%@page import="com.emp.employeePaymentInterface"%>
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
		<h1>Display Payment Details</h1>
	</header>
	<div>
		<center>
			<table border="1" cellpadding="20" id="all"
				style="border: 1px solid black;">
				<tr style="background-color:aliceblue ;">
					<th>employee ID</th>
					<th>name</th>
					<th>department</th>
					<th>basic Salary</th>
					<th>deduction</th>
					<th>overTime</th>
				</tr>
				<%
					employeePaymentInterface employeePaymentInterface = new emplyoyeeDButil();
					List<employeePayment> employeeDetails = employeePaymentInterface.getemployeePayment(); 

					for (employeePayment employeePayment : employeeDetails) {
				%>
				<tr style="background-color:white ;">
					<td><%=employeePayment.getId()%></td>
					<td><%=employeePayment.getName()%></td>
					<td><%=employeePayment.getDepartment()%></td>
					<td><%=employeePayment.getBasicSalary()%></td>
					<td><%=employeePayment.getDeduction()%></td>
					<td><%=employeePayment.getOverTime()%></td>
					

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