<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	~~ Before Remove ~~ <br>
	
	<%
	String u_id = (String) session.getAttribute("memberId");
	String u_pw = (String) session.getAttribute("memberPw");
	out.println("1. ID Session Attribute Value: " + u_id + "<br>");
	out.println("2. PW Session Attribute Value: " + u_pw + " <br>");
	
	session.removeAttribute("memberId");
	%>

	~~ After Remove ~~ <Br>
	<%
	u_id = (String) session.getAttribute("memberId"); // null if there is no value 
	u_pw = (String) session.getAttribute("memberPw");
	out.println("1. ID Session Attribute Value: " + u_id + "<br>");
	out.println("2. PW Session Attribute Value: " + u_pw + " <br>");
	 %>
	
</body>
</html>