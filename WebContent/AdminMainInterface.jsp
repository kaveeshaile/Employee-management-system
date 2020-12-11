<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin Interface</title>
<style>

body{ background-color: mediumturquoise;}

  
header{
margin-top : 0%;
 height: 110px;
 text-align: center;
color:white;
background-color:DodgerBlue;
padding-top: 1%;
font-size: 150%;

}

</style>
</head>
<body>

<center>
<header><h1>Admin Interface</h1></header>

<br>
<br>
<br>
<br>

<button type="button" style=" background-color: #242323;border: none;color: white;padding: 10px;
text-align: center;text-decoration:none;display: inline-block;font-size: 30px;margin: 4px 2px;cursor: pointer;
height:200px;width:400px;"
onclick="window.location='DisplayEmployeeDetails.jsp'">Employee Details</button>
  

  
<button type="button" style=" background-color: #242323;border: none;color: white;padding: 10px;
text-align: center;text-decoration:none;display: inline-block;font-size: 30px;margin: 4px 2px;cursor: pointer;
height:200px;width:400px;"
onclick="window.location='announcement.jsp'">Announcements</button>
      

<button type="button" style=" background-color: #242323;border: none;color: white;padding: 10px;
text-align: center;text-decoration:none;display: inline-block;font-size: 30px;margin: 4px 2px;cursor: pointer;
height:200px;width:400px;"
onclick="window.location='loging.jsp'">Payments</button>
          

<br>
<br>

<center>
<button type="button" style=" background-color: #242323;border: none;color: white;padding: 10px;
text-align: center;text-decoration:none;display: inline-block;font-size: 30px;margin: 4px 2px;cursor: pointer;
height:200px;width:400px;"
onclick="window.location='index.jsp'">holidays</button>       
</center>

</center>
<br>
<br>
<br>
<br>
</body>
</html>