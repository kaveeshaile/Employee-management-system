<%@page import="com.oop.model.attendance.attendance"%>
<%@page import="com.oop.service.attendance.Iattendance"%>
<%@page import="com.oop.service.attendance.attendanceService"%>
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
		<h1>Editting Attendance Page</h1>
	</header>
	<br>
	<br>
	<%
		attendance attendance = (attendance) request.getAttribute("attendance");
	%>
	<center>
		<form method="POST" action="UpdateAttendanceServlet">
			<h3>attendance id</h3>
			<input type="text" name="attendanceID" disabled="disabled"
				value="<%=attendance.getAttendanceID()%>"
				style="font-size: 150%; width: 50%;" />
			<h3>employee id</h3>
			<input type="text" name="empID"
				value="<%=attendance.getEmpID()%>"
				style="font-size: 150%; width: 50%;" />
			<h3>Edit the date</h3>
			<input type="date" name="date" value="<%=attendance.getDate()%>"
				style="font-size: 150%; width: 50%;" />
			<h3>Edit the time in</h3>
			<input type="time" name="timein" value="<%=attendance.getTimein()%>"
				style="font-size: 150%; width: 50%;" /><br> <br>
			<h3>Edit the time out</h3>
			<input type="time" name="timeout"
				value="<%=attendance.getTimeout()%>"
				style="font-size: 150%; width: 50%;" /><br> <br> <input
				type="hidden" name="attendanceID" style="font-size: 150%;"
				value="<%=attendance.getAttendanceID()%>" /> <input type="submit"
				value="Update attendance" class="update" style="font-size: 150%;" />
		</form>

		<table>
			<tr>
				<td colspan="2">
					<form method="POST" action="DeleteAttendanceServlet">
						<input type="hidden" name="attendanceID" style="font-size: 150%;"
							value="<%=attendance.getAttendanceID()%>" /> <input
							type="submit" value="Delete attendance" class="delete"
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