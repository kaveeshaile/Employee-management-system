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
div.Background1 {
	background-color: aliceblue;
	position: absolute;
	right: 15%;
	top: 30%;
	width: 70%;
	height: 50%
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

.timein {
	text-align: left;
	margin-left: 10%;
	margin-top: 10%;
}

.timeout {
	text-align: right;
	margin-right: 10%;
	margin-top: -13%;
}
</style>

</head>
<body>
	<header>
		<h1>Employee ID validation Interface</h1>
	</header>

	<div class="Background1">
		<center>
			<form method="post" action="validationServlet" name="form"
				onsubmit="return validate()">
				<h3>Enter your employee id</h3>
				<input type="text" name="empID" style="font-size: 150%; width: 50%;"
					required /> <br> <br> <input type="submit" name="submit"
					value="submit" style="font-size: 150%;">
			</form>
		</center>
	</div>

</body>
</html>