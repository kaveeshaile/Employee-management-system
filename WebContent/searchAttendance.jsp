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
	 background-color: mediumturquoise;
}
header {
	text-align: center;
	color: red;
	padding-top: 0%;
	font-size: 150%;
}

h3 , p {
	font-size: 30px;
	color: blueviolet;
}
</style>
<body>
	<header>
		<h1>Search attendance Details</h1>
	</header>
	<center>
		<div class="SearchBackground">
			<br>
			<br>
			<br>
			<form method="post" action="searchServlet" name="form" required>
				<h3>Enter the attendance ID</h3>
				<p>Like : 1 , 2 , 3 , 4 ......</p>
				<br>
				<br> <input type="text" name="search"
					style="font-size: 150%; width: 50%;" required /><br>
				<br>
				<br> <input type="submit" name="submit" value="submit"
					style="font-size: 150%;">
			</form>
		</div>
	</center>
</body>
</html>