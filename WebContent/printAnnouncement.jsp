<%@page import="com.oop.model.announcement.announcement"%>
<%@page import="com.oop.service.announcement.Iannouncement"%>
<%@page import="com.oop.service.announcement.announcementService"%>
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
		<h1>printed announcement</h1>
	</header>
	<div>
		<center>
			<table border="1" cellpadding="20" id="all"
		style="border: 0.5px white;">
				<tr style="background-color:lightgreen ;">
					<th>announcement ID</th>
					<th>title</th>
					<th>date</th>
					<th>day</th>
					<th>description</th>
				</tr>
				<%
					Iannouncement Iannouncement2 = new announcementService();
					List<announcement> announcementDetails = Iannouncement2.getAnnouncement();

					for (announcement announcement : announcementDetails) {
				%>
				<tr style="background-color:white ;">
					<td style="background-color:#FFF991;"><%=announcement.getId() %></td>
					<td style="background-color:#FFF991;"><%=announcement.getTitle() %></td>
					<td style="background-color:#FFF991;"><%=announcement.getDate() %></td>
					<td style="background-color:#FFF991 ;"><%=announcement.getDay() %></td>
					<td style="background-color:#FFF991;"><%=announcement.getDescription() %></td>

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
			<br>
			<br>
		</center>
	</div>

</body>
</html>