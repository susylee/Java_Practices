<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
Home> Person Information <hr>
<form name="person_info" action="personInfo_proc.jsp" method="get">
Name: <input type="text" name="name" size="10"><br><br>
Employee Number: <input type="text" name="enumber" size="10"><br><br>

Gender: <input type="radio" name="genter" value="Male">Male
<input type="radio" name="gender" value="Female">Female
<br><br>

Hobby: <input type="checkbox" name="hobby1" value="gym"> Gym
<input type="checkbox" name="hobby2" value="Reading"> Reading
<input type="checkbox" name="hobby3" value="Music"> Music <br>

<hr>
<input type="submit" value="Register"> &nbsp;  &nbsp;
<input type="reset" value="cancel"> 
</form>

</body>
</html>