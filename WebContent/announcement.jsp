<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>announcement</title>

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

<body>
	<header>
		<h1>Enter Announcements</h1>
	</header>
	<center>
		<div class="announcement">
			<form method="post" action="AnnouncementServlet" name = "form" required>
				<h3>Enter the announcement title</h3>
				<input type="text" name="title" style="font-size: 150%; width: 50%;"  required/>
				<h3>Enter the announcement date</h3>
				<input type="date" name="date" style="font-size: 150%; width: 50%;"  required/>
				<h3>Enter the announcement day</h3>
				<input type="text" name="day" style="font-size: 150%; width: 50%;"  required/>
				<h3>Enter the Anouncement</h3>
				<textarea rows="4" cols="50" name="description"
					style="font-size: 150%; width: 50%;" required/></textarea><br> <br>
				<br> <br> <input
					type="submit" name = "submit" value="submit"  style="font-size: 150%;"  >
			</form>

		</div>
	</center>
</body>
</html>