<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<style>
body{background-color:lightblue;}

h1{
font-size:150%;
}

</style>
<meta charset="ISO-8859-1">
<title>Delete Leave Data from Database</title>
</head>
<body>
<center>
<h1>Confirm  Delete</h1>
</center>

<%
String EmployeeId = request.getParameter("employeeId");
String EmployeeName = request.getParameter("employeeName");
String LeaveType = request.getParameter("leaveType");
String Duration = request.getParameter("duration");
String Reason = request.getParameter("reason");

%>

<form action ="DeleteLeaveServlet" method="Post">

EmployeeId<input type="text" name="employeeId" value="<%= EmployeeId %>"readonly><br>
EmployeeName<input type="text" name="employeeName" value="<%= EmployeeName %>"><br>
LeaveType<input type="text" name="leaveType" value="<%= LeaveType %>"><br>
Duration<input type="text" name="duration" value="<%= Duration %>"><br>
Reason<input type="text" name="reason" value="<%= Reason %>"><br>

<input type ="submit" name="submit" value="DeleteData">

</form>











</body>
</html>