<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
	Before change session time: <br>
	<%
	int s_time = session.getMaxInactiveInterval() / 60;
	out.println("session time : [" + s_time + "minutes ]<br><br>");
	%>
	
	After change session time: <br>
	
	<% 
	session.setMaxInactiveInterval(60*5);
	s_time = session.getMaxInactiveInterval() / 60;
	out.println("session time: [" + s_time + " minutes]");
	
	%>
</body>
</html>