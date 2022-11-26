<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Join the Membership</title>
</head>
<body>
	Home > Join the Membership
	<hr>
	<form action="form_membership02.jsp" name="person_info" method="get">
		<fieldset style="width:330px">
		<legend>Personal Information</legend>
		
		ID: <br>
		<input type="text" name="p_id" size="16"><br><br>
		PW: <br>
		<input type="password" name="p_pw" size="16"><br><br>
		
		Name: <br>
		<input type="text" name="p_name" size="16"><br><br>
		
		Phone: <br>
		<select name="choice" style="width:60px; height:20.5px">
			<option value="choice">choice </option>
			<option value="kt">KT </option>
			<option value="skt"> SKT </option>
			<option value="Rogers"> Rogers </option>
		</select>
		
		<input type="text" maxlength="3" size="3" name="phone1">-
		<input type="text" maxlength="3" size="3" name="phone2">-
		<input type="text" maxlength="3" size="3" name="phone3"><br><br>
		
		Gender:
		<input type="radio" name="gender" value="male"> male
		<input type="radio" name="gender" value="female">female<br><br>
		
		Hobby:
		<input type="checkbox" name="hobby" value="gym"> gym
		<input type="checkbox" name="hobby" value="reading"> reading
		<input type="checkbox" name="hobby" value="music"> music
		<input type="checkbox" name="hobby" value="dancing"> dancing <br><br>
		
		Introduction: <br>
		<textarea name="Introduction" cols="50" rows="3"></textarea>
		<hr>
		
		<div align="center">
			<input type="submit" value="register"> &nbsp; &nbsp;
			<input type="reset" value="cancel">
		</div> <br>
		</fieldset>
	</form>
</body>
</html>