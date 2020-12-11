<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<style>
body{background-color:lightblue;}
h1{font-size:150%;}
</style>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center>
<h1>Confirm Delete</h1>
</center>

<%
String TaskId = request.getParameter("taskId");
String Title = request.getParameter("title");
String DueDate = request.getParameter("dueDate");
String Description = request.getParameter("description");

%>


<form action ="DeleteTaskServlet" method="Post">

TaskId<input type="text" name="taskId" value="<%= TaskId %>"readonly><br>
Title<input type="text" name="title" value="<%= Title %>"><br>
DueDate<input type="text" name="dueDate" value="<%= DueDate %>"><br>
Description<input type="text" name="description" value="<%= Description %>"><br>


<input type ="submit" name="submit" value="DeleteMyData">



</form>








</body>
</html>