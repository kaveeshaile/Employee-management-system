<%@page import="com.oop.model.attendance.attendance"%>
<%@page import="com.oop.service.attendance.Iattendance"%>
<%@page import="com.oop.service.attendance.attendanceService"%>
<%@ page import="java.util.*" %> 
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
		<h1>search Attendance Page</h1>
	</header>
	<br>
	<br>
	<center>
	<table border="1" cellpadding="20" id="all"
		style="border: 0.5px white;">
		<tr style="background-color: aliceblue;">
			<th>attendance ID</th>
			<th>employee ID</th>
			<th>date</th>
			<th>time_in</th>
			<th>time_out</th>
		</tr>
		<%
			int count = 0;
			String color = "#F9EBB3";

			if (request.getAttribute("search_list") != null) {
				ArrayList arraylist = (ArrayList) request.getAttribute("search_list");
				Iterator itr = arraylist.iterator();

				while (itr.hasNext()) {

					if ((count % 2) == 0) {
						color = "#eeffee";
					} else {
						color = "#F9EBB3";
					}
					count++;
					ArrayList search_list = (ArrayList) itr.next();
		%>
		<tr style="background-color:<%=color%>;">
			<td><%=search_list.get(0)%></td>
			<td><%=search_list.get(1)%></td>
			<td><%=search_list.get(2)%></td>
			<td><%=search_list.get(3)%></td>
			<td><%=search_list.get(4)%></td>
		</tr>
		<%
			}
			}
		%>
		<%
			if (count == 0) {
		%>
		<tr>
			<td colspan=8 align="center" style="background-color: eeffee"><b>No
					Record</b></td>
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
							onclick="window.location='searchAttendance.jsp'">Back</button>
					</td>
				</tr>
			</table>
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
</body>
</html>