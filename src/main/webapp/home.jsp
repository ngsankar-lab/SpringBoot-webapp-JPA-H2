<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3>Add Person</h3>
<form action="addPerson">
<input type="text" name="pid"><br>
<input type="text" name="pname"><br>
<input type="text" name="paddress"><br>
<input type="submit"><br><br><br>
</form>
<h3>Get Person Details</h3>
<form action="getPerson">
<input type="number" name="pid"><br>
<input type="submit"><br>
</form>
</body>
</html>