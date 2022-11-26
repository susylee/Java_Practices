<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
personInfo_proc.jsp<br>

<%  String name = request.getParameter("name");
	String enumber = request.getParameter("enumber");
	String gender = request.getParameter("gender");
	String hobby1 = request.getParameter("hobby1");
	String hobby2 = request.getParameter("hobby2");
	String hobby3 = request.getParameter("hobby3");

	
%>

name: <%=name %> <br>
enumber: <%=enumber %><br>
gender: <%=gender %><br>
hobby1: <%=hobby1 %><br>
hobby2: <%=hobby2 %><br>
hobby3: <%=hobby3 %><br>

<hr>

<table border="1" width=350>
	<tr>
		<th>name(gender)</th>
		<th>Employee number</th>
		<th> hobby </th> 
	</tr>
	
	<tr align="center">
		<td><%=name + "(" + gender + ")" %></td>
		<td><%=enumber %></td>
		<td><%=hobby1 + "&nbsp;" + hobby2 + "&nbsp;" + hobby3 %></td>
	</tr>

</table>


</body>
</html>