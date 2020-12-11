<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body
	style="margin: 0; padding: 0; background: rgb(209, 207, 207); font-size: 16px; color: #222; font-family: 'Roboto', sans-serif; font-weight: 300;">
	<form method="post" action="RegisterServlet" required/>
		<div
			style="position: relative; margin: 5% auto; width: 600px; height: 700px; background: rgb(240, 231, 231); border-radius: 15px; box-shadow: 0 2px 4px rgba(0, 0, 0, 0.4);">
			<div
				style="position: absolute; top: 0; left: 0; box-sizing: border-box; padding: 40px; width: 300px; height: 400px;">
				<h1 style="margin: 0 0 20px 0; font-weight: 300; font-size: 28px;">Sign
					up</h1>

				<input type="text" name="EmployeeID" placeholder="EmployeeID"
					style="display: block; box-sizing: border-box; margin-bottom: 20px; padding: 4px; width: 220px; height: 32px; border: none; border-bottom: 1px solid #AAA; font-family: 'Roboto', sans-serif; font-weight: 400; font-size: 15px; transition: 0.2s ease;"required><br>
				<input type="text" name="name" placeholder="Name"
					style="display: block; box-sizing: border-box; margin-bottom: 20px; padding: 4px; width: 220px; height: 32px; border: none; border-bottom: 1px solid #AAA; font-family: 'Roboto', sans-serif; font-weight: 400; font-size: 15px; transition: 0.2s ease;"required><br>
				<input type="text" name="email" placeholder="E-mail"
					style="display: block; box-sizing: border-box; margin-bottom: 20px; padding: 4px; width: 220px; height: 32px; border: none; border-bottom: 1px solid #AAA; font-family: 'Roboto', sans-serif; font-weight: 400; font-size: 15px; transition: 0.2s ease;"required><br>
				<input type="text" name="gender" placeholder="Gender"
					style="display: block; box-sizing: border-box; margin-bottom: 20px; padding: 4px; width: 220px; height: 32px; border: none; border-bottom: 1px solid #AAA; font-family: 'Roboto', sans-serif; font-weight: 400; font-size: 15px; transition: 0.2s ease;"required><br>
				<input type="text" name="address" placeholder="Address"
					style="display: block; box-sizing: border-box; margin-bottom: 20px; padding: 4px; width: 220px; height: 32px; border: none; border-bottom: 1px solid #AAA; font-family: 'Roboto', sans-serif; font-weight: 400; font-size: 15px; transition: 0.2s ease;"required><br>
				<input type="radio" name="position" value = "admin">admin<br>
				<input type="radio" name="position" value = "employee">employee<br><br><br>
				<input type="text" name="username" placeholder="Username"
					style="display: block; box-sizing: border-box; margin-bottom: 20px; padding: 4px; width: 220px; height: 32px; border: none; border-bottom: 1px solid #AAA; font-family: 'Roboto', sans-serif; font-weight: 400; font-size: 15px; transition: 0.2s ease;"required><br>
				<input type="password" name="password" placeholder="password"
					style="display: block; box-sizing: border-box; margin-bottom: 20px; padding: 4px; width: 220px; height: 32px; border: none; border-bottom: 1px solid #AAA; font-family: 'Roboto', sans-serif; font-weight: 400; font-size: 15px; transition: 0.2s ease;"required><br>


				<input type="submit" name="signup_submit" value="Sign up"
					style="margin-top: 28px; width: 120px; height: 32px; background: #16a085; border: none; border-radius: 2px; color: #FFF; font-family: 'Roboto', sans-serif; font-weight: 500; text-transform: uppercase; transition: 0.1s ease; cursor: pointer;">

			</div>

			<div
				style="position: absolute; top: 0; right: 0; box-sizing: border-box; padding: 40px; width: 300px; height: 700px; background: url('https://goo.gl/YbktSj'); background-size: cover; background-position: center; border-radius: 0 15px 15px 0; background-color: rgb(240, 233, 220);">
				<span class="loginwith"
					style="display: block; margin-bottom: 40px; font-size: 28px; color: rgb(19, 16, 16); text-align: center;">Sign
					in with<br>social network
				</span>

				<button
					style="background: #32508E; margin-bottom: 20px; width: 220px; height: 36px; border: none; border-radius: 2px; color: #FFF; font-family: 'Roboto', sans-serif; font-weight: 500; transition: 0.2s ease; cursor: pointer;">
					<a href="http://www.facebook.com">Log in with facebook</a>
				</button>
				<button
					style="background: #55ACEE; margin-bottom: 20px; width: 220px; height: 36px; border: none; border-radius: 2px; color: #FFF; font-family: 'Roboto', sans-serif; font-weight: 500; transition: 0.2s ease; cursor: pointer;">
					<a href="https://publish.twitter.com">Log in with Twitter</a>
				</button>
				<button
					style="background: #DD4B39; margin-bottom: 20px; width: 220px; height: 36px; border: none; border-radius: 2px; color: #FFF; font-family: 'Roboto', sans-serif; font-weight: 500; transition: 0.2s ease; cursor: pointer;">
					<a href=" https://plus.google.com">Log in with Google+</a>
				</button>
			</div>
			<div
				style="position: absolute; top: 180px; left: 280px; width: 40px; height: 40px; background: #DDD; border-radius: 50%; box-shadow: 0 2px 4px rgba(0, 0, 0, 0.4); line-height: 40px; text-align: center;">OR</div>
		</div>
	</form>

</body>
</html>