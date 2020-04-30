<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
<title>Insert title here</title>
</head>
<body>
	<h1>Enter trainee details</h1>
	<form action="addtrainee">
		<pre>
Trainee Id       <input type="number" name="traineeId">
Trainee Name     <input type="text" name="traineeName">
Trainee Location <input type="radio" id="chennai1"
				name="traineeLocation" value="chennai">Chennai<input
				type="radio" id="banglore1" name="traineeLocation" value="banglore">Banglore<input
				type="radio" id="mumbai1" name="traineeLocation" value="mumbai">Mumbai<input
				type="radio" id="pune1" name="traineeLocation" value="Pune">Pune
Trainee Domain   <select name="traineeDomain">
                 <option>JEE</option>
                 <option>C++</option>
                 <option>C</option>         
                </select>
<input type="submit" value="addtraineer">                 
</pre>
	</form>
</body>
</html>