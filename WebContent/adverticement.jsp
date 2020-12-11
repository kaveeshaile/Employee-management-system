<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="com.oop.service.attendance.Iattendance"%>
<%@page import="com.oop.service.attendance.attendanceService"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>timein</title>

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

<body>
	<header>
		<h1>Enter time details</h1>
	</header>
	<center>
		<div class="TimeINBackground1">
			<form method="post" action="timeinServlet" name = "form" onsubmit = "return validate()" required>
				<input type="hidden" name="attendanceID">
				<h3>Enter your id</h3>
				<input type="text" name="empID" style="font-size: 150%; width: 50%;"  required/>
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
</body>
</html>