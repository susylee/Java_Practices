<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
	String session_id = session.getId();
	long last_time = session.getLastAccessedTime();
	long start_time = session.getCreationTime();
	long keeping_time = (last_time - start_time) / 60000;
	
	out.print("1. Session ID: [" + session_id + "] <br>");
	out.print("2. Session Time: [" + keeping_time + "] minutes <br>");
	%>
</body>
</html>