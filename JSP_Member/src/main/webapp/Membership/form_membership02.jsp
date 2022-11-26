<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
form_membership02.jsp<br>
Home > Personal Information Inquiry
<hr>

	<% 
		String id = request.getParameter("p_id");
		String pw = request.getParameter("p_pw");
		String name = request.getParameter("p_name");
		
		String choice = request.getParameter("choice");
		String ph01 = request.getParameter("phone1");
		String ph02 = request.getParameter("phone2");
		String ph03 = request.getParameter("phone3");
		
		String gender = request.getParameter("gender");
		String[] hobby = request.getParameterValues("hobby");
		String intro = request.getParameter("Introduction");
	%>
	
	<%=id %> <br>
	<%=pw %>  <br>
	<%=name %>  <br>
	<%=choice %> - <%=ph01 %> - <%=ph02 %>  - <%=ph03 %>  <br>
	<%=gender %>  <br>
	
	<%
		if(hobby != null) {
			for(int i=0; i<hobby.length; i++) {
				out.println("<br>" + hobby[i]);
			}
		}
	
	%>
<br>
	<%=intro %>  <br>

</body>
</html>