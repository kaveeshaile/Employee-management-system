<%@page import="com.oop.model.announcement.announcement"%>
<%@page import="com.oop.service.announcement.Iannouncement"%>
<%@page import="com.oop.service.announcement.announcementService"%>
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
		<h1>Editting Announcement Page</h1>
	</header>
	<br>
	<br>
	<%
	announcement announcement = (announcement) request.getAttribute("announcement");
	%>
	<center>
		<form method="POST" action="UpdateAnnouncementServlet">
			<h3>announcement id</h3>
			<input type="text" name="id" disabled="disabled"
				value="<%=announcement.getId() %>"
				style="font-size: 150%; width: 50%;" />
			<h3>title</h3>
			<input type="text" name="title"
				value="<%=announcement.getTitle() %>"
				style="font-size: 150%; width: 50%;" />
			<h3>date</h3>
			<input type="date" name="date" value="<%=announcement.getDate()%>"
				style="font-size: 150%; width: 50%;" />
			<h3>day</h3>
			<input type="text" name="day" value="<%=announcement.getDay() %>"
				style="font-size: 150%; width: 50%;" /><br> <br>
			<h3>descrption</h3>
			<input type="text" name="description" value="<%=announcement.getDescription()%>"
					style="font-size: 150%; width: 50%;" />
			<br> <br> <input
				type="hidden" name="id" style="font-size: 150%;"
				value="<%=announcement.getId() %>" /> <input type="submit"
				value="Update announcement" class="update" style="font-size: 150%;" />
		</form>

		<table>
			<tr>
				<td colspan="2">
					<form method="POST" action="DeleteAnnouncementServlet">
						<input type="hidden" name="id" style="font-size: 150%;"
							value="<%=announcement.getId() %>" /> <input
							type="submit" value="Delete announcement" class="delete"
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