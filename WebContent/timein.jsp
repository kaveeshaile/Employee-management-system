<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="com.oop.service.attendance.Iattendance"%>
<%@page import="com.oop.service.attendance.attendanceService"%>
<%@page import="com.oop.model.EmployeeRegistration.employee"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>timein</title>

<style>
body {
	 background-color: mediumturquoise;
}
header{
margin-top : 0%;
 height: 110px;
 text-align: center;
color:white;
background-color:DodgerBlue;
padding-top: 1%;
font-size: 150%;

}
footer{
 height: 120px;
 text-align: center;
color:white;
background-color:DodgerBlue;
padding-top: 1%;
font-size: 80%;

}

h3 {
	font-size: 30px;
	color: blueviolet;
}
</style>

<body>
	<header>
		<h1>Enter time details interface</h1>
	</header>
	<%
	employee employeevalid = (employee) request.getAttribute("employeevalid");
	%>
	<center>
		<div class="TimeINBackground1">
			<form method="post" action="timeinServlet" name = "form" onsubmit = "return validate()" required>
				<input type="hidden" name="attendanceID">
				<h3>Enter your id</h3>
				<input type="text" name="empID" style="font-size: 150%; width: 50%;" value="<%=employeevalid.getEmployeeID() %>"  required/>
				<h3>Enter the date</h3>
				<input type="date" name="date" style="font-size: 150%; width: 50%;"  required/>
				<h3>Enter the time in</h3>
				<input type="time" name="timein"
					style="font-size: 150%; width: 50%;" required/><br> <br>
				<h3>Enter the time out</h3>
				<input type="time" name="timeout"
					style="font-size: 150%; width: 50%;"  required/><br> <br> <input
					type="submit" name = "submit" value="submit"  style="font-size: 150%;"  >
			</form>
		
		
		
		</div>
		
	</center>
<br>
<br>
<br>
<br>
</body>
</html>