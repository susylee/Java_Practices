<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
login_process.jsp<br>
Home> Login Information <hr>

<% request.setCharacterEncoding("UTF-8");

	String id = request.getParameter("id");
	String passwd = request.getParameter("password");

%>

	
	<table border="1">
		<tr>
			<th>ID</th>
			<th>PASSWD</th>
		</tr>
		<tr>
			<td><%= id %></td>
			<td><%= passwd %></td>
		</tr>
	</table>
		
</body>
</html>