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
	String u_id = (String)session.getAttribute("memberId");
	String u_pw = (String)session.getAttribute("memberPw");
	out.println("1. ID Session Value: " + u_id + "<br>");
	out.println("2. PW Session Value: " + u_pw + "<br>");
	
%>

	
</body>
</html>