<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	~~ Before Remove All ~~ <br>
	
	<%
	String u_id = (String) session.getAttribute("memberId");
	String u_pw = (String) session.getAttribute("memberPw");
	out.println("1. ID Session Attribute Value: " + u_id + "<br>");
	out.println("2. PW Session Attribute Value: " + u_pw + " <br>");
	
	if(request.isRequestedSessionIdValid() == true)  {
		out.println(">> Valid Session. <br><br>");
		
	}
	else {
		out.println(">> Invalid Session. <br><br>");
	}
	session.invalidate();
	%>

	~~ After Remove All ~~ <Br>
	
	<%
	if(request.isRequestedSessionIdValid() == true) {
		out.println(">> After Remove, still Valid Session. <br><br>");
	} else {
		out.println(">> Invalid Session after removed.");
	}
	
	%>
	
</body>
</html>