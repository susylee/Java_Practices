<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	Home > Login
	<hr>
	<form action="login_process.jsp" method="get">
		ID :<br> <input type="text" name="id"><br><br> 
		PASSWORD : <br> <input type="text" name="password"><br><br>
		 <input type="submit" value="Login"> &nbsp;
		 <input type="reset" value="Cancel">
	</form>
</body>
</html>