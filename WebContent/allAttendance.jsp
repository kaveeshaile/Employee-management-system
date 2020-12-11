<%@page import="com.oop.model.attendance.attendance"%>
<%@page import="com.oop.service.attendance.Iattendance"%>
<%@page import="com.oop.service.attendance.attendanceService"%>
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
	 background-color: mediumturquoise;
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
		<h1>Display Attendance</h1>
	</header>
	<div>
		<center>
			<table border="1" cellpadding="20" id="all"
				style="border: 1px solid black;">
				<tr style="background-color:aliceblue ;">
					<th>attendance ID</th>
					<th>employee ID</th>
					<th>date</th>
					<th>time_in</th>
					<th>time_out</th>
				</tr>
				<%
					Iattendance Iattendance2 = new attendanceService();
					List<attendance> attendanceDetails = Iattendance2.getAttendance();

					for (attendance attendance : attendanceDetails) {
				%>
				<tr style="background-color:white ;">
					<td><%=attendance.getAttendanceID()%></td>
					<td><%=attendance.getEmpID()%></td>
					<td><%=attendance.getDate()%></td>
					<td><%=attendance.getTimein()%></td>
					<td><%=attendance.getTimeout()%></td>

					<td>
						<form method="POST" action="oneAttendanceServlet">
							<input type="hidden" name="attendanceID"
								value="<%=attendance.getAttendanceID()%>"> <input
								type="submit" value="Select Attendance" class="select-button" />
						</form>
					</td>
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
							onclick="window.location='attendance.jsp'">home</button>
					</td>
				</tr>
			</table>
		</center>
	</div>

</body>
</html>