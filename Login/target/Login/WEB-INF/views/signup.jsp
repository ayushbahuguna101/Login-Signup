<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Signup</title>
</head>
<body>
	<form action="doSignup" method="post">
		<table>
			<tr>
				<td>First Name</td>
				<td><input type="text" name="first_name"></td>
			</tr>
			<tr>
				<td>Last Name</td>
				<td><input type="text" name="last_name"></td>
			</tr>
			<tr>
				<td>Email</td>
				<td><input type="email" name="email"></td>
			</tr>
			<tr>
				<td>Username</td>
				<td><input type="text" name="username"></td>
			</tr>
			<tr>
				<td>Password</td>
				<td><input type="password" name="password"></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="Signup"></td>
			</tr>
			<!-- <tr>
                <a href="/Webhome.jsp">Go back to home</a>
            </tr> -->
		</table>
	</form>
</body>
</html>