<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>       
<!DOCTYPE html>    
<html>  
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	Home> Session Create
	<hr>
	
	<% 
	String u_id = request.getParameter("id");
	String u_pw = request.getParameter("passwd");
	
	if(u_id.equals("space") && u_pw.equals("123456")) {
	session.setAttribute("memberId", u_id);
	session.setAttribute("memberPw", u_pw);

	out.println("New Session create Success! <br>");
	out.println("[" + u_id + "] entered");
	} else {
		out.println("Session create failed <br>");
		out.println("try again");
	}
  %>       
    
</body>
</html>