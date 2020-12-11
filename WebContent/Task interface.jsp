<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Task interface</title>
</head>
<style>

body {
    background-color: rgb(14, 104, 44);
}





</style>
<body>


<center>
<h1 style="color:white;background-color:black;height:100px;">Employee Task Interface</h1>


<br>
<br>
<br>
<button type="button" style=" background-color: grey;border: none;color: white;padding: 10px;
text-align: center;text-decoration:none;display: inline-block;font-size: 30px;margin: 4px 2px;cursor: pointer;
height:150px;width:900px;"
onclick="window.location='Add task.jsp'">Assign Tasks</button>
<br>
<br>
<br>
<form action= "DisplaytaskServlet" method="get">
<input type="submit" style=" background-color:gray;border: none;color: white;padding: 10px;
text-align: center;text-decoration:none;display: inline-block;font-size: 30px;margin: 4px 2px;cursor: pointer;
height:150px;width:900px;"
value="Display task">
</form>

<br>
<br>

<button type="button" style=" background-color:red;border: none;color: white;padding: 10px;
text-align: center;text-decoration:none;display: inline-block;font-size: 10px;margin: 4px 2px;cursor: pointer;
height:30px;width:50px;"
onclick="window.location='EmployeeMainInterface.jsp'">Back</button>
</center>





















</body>
</html>