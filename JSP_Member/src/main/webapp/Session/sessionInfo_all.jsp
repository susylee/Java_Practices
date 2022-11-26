<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.Enumeration" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<% String name ="";
		String value = "";
		
		Enumeration en = session.getAttributeNames();
		
		int count = 0;
		while(en.hasMoreElements()) {
			count ++;
			name = en.nextElement().toString();
			value = session.getAttribute(name).toString();
			
			out.println(count + ".Session name : [" + name + "] <br>");
			out.println(count + ".Session Value : [" + value + "] <br> ");
		}
	
	%>
</body>
</html>