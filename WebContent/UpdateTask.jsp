<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<style>
h1{font-size:150%;}
body{background-color:lightblue;}

</style>
<meta charset="ISO-8859-1">
<title>Update employee task</title>
</head>
<body>
<h1>Update Details</h1>

<%
String TaskId = request.getParameter("taskId");
String Title = request.getParameter("title");
String DueDate = request.getParameter("dueDate");
String Description = request.getParameter("description");

%>


<form action ="UpdateTaskServlet" method="Post">

TaskId<input type="text" name="taskId" value="<%= TaskId %>"readonly><br>
Title<input type="text" name="title" value="<%= Title %>"><br>
DueDate<input type="date" name="dueDate" value="<%= DueDate %>"><br>
Description<input type="text" name="description" value="<%= Description %>"><br>


<input type ="submit" name="submit" value="UpdateMyData">



</form>




