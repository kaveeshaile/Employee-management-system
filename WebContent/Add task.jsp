<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Adding Task Interface</title>
<style>


body{
    background-color: rgb(14, 104, 44);;
}



</style>

</head>
<body>
<form action="AddtaskServlet" method ="post">
<center>
    <h1 style="color:white;background-color:black;height:100px ;">Adding Tasks Interface</h1>
</center>
<br>
<br>
<br>
<p style ="color:white">Task Id:</p>
<input type="number" placeholder= "Task ID" name="TaskId" style="width:400px;height:40px;"required>
<br>
<br>
<p style ="color:white;">Title:</p>
<input type="text" placeholder= "Title" name ="Title" style="width:400px;height:40px;"required>
<br>
<br>
<p style ="color:white;">DueDate:</p>
<input type="date" id="Date" name="DueDate" placeholder="2020-10-01" style="height: 40px;width:200px ;">

<br>
<br>
<p style ="color:white">Description:</p>
<input type="text" name="Description" style="width:900px;height:100px"required>





    <button type="button" style=" background-color:red;border: none;color: white;padding: 10px;
    text-align: center;text-decoration:none;display: inline-block;font-size: 10px;margin: 4px 2px;cursor: pointer;
    height:30px;width:50px;"
    onclick="window.location='EmployeeMainInterface.jsp'">Back</button>

    <br>
    <br>
<center>


    
<input type="Reset"  value="Reset " style="font-size:10pt;color:white;
background-color:red;border:2px solid #FF0000;padding:3px;[COLOR="Red"]margin-bottom:30px[/COLOR]">
 <br> <br><input type="submit" value=" submit" style="font-size:10pt;color:white;
 background-color:green;border:2px solid #336600;padding:3px;[COLOR="Red"]margin-bottom:30px[/COLOR]">
 
 </center>


















</form>

</body>
</html>