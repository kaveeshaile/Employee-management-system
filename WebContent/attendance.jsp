<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
body {
	 background-color: mediumturquoise;
}

div.attendanceBackground1 {
	background-color:white;
	position: absolute;
	right: 15%;
	top: 30%;
	width: 70%;
	height: 60%;
}

header{
margin-top : 0%;
 height: 110px;
 text-align: center;
color:white;
background-color:DodgerBlue;
padding-top: 1%;
font-size: 150%;

}

h3 {
	font-size: 30px;
	color: blueviolet;
}

.timein {
	text-align: left;
	margin-left: 10%;
	margin-top: 4%;
}

.timeout {
	text-align: right;
	margin-right: 10%;
	margin-top: -13%;
}
.display {
	text-align: left;
	margin-left: 10%;
	margin-top: 4%;
}

.maininterface {
	text-align: right;
	margin-right: 10%;
	margin-top: -13%;
}
</style>

</head>
<body>
	<header>
		<h1>Attendance Interface</h1>
	</header>
	
	<div>
	<div class="attendanceBackground1">
		<div class="timein">
			<br>
			<button type="button"
				style="border-radius: 10%; font-size: 600%; background-color: #242323; color: white;"
				onclick="window.location='validEmployeeID.jsp'">TimeIn</button>
		</div>
		<div class="timeout">
			<button type="button"
				style="border-radius: 10%; font-size: 600%; background-color: #242323; color: white;" onclick="window.location='searchAttendance.jsp'">Search</button>
		</div>
		<br>
		<br>
		<div class="display">
			<button type="button"
				style="border-radius: 10%; font-size: 600%; background-color: #242323; color: white;" onclick="window.location='allAttendance.jsp'">Display</button>
		</div>
		<div class="maininterface">
			<button type="button"
				style="border-radius: 10%; font-size: 500%; background-color: #242323; color: white;" onclick="window.location='EmployeeMainInterface.jsp'">E_home</button>
		</div>
	</div>
	</div>
	
</body>
</html>