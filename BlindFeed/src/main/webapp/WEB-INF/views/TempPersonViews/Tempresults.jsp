<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>hellooo</title>
</head>
<body>
	<h3>User's from the database</h3>
	<table border="1">
		<!-- 
		PersonList is the object which contain available persons in the database
		its displayed iterately. using JSTL fname,lname,age is attribute of model class
		 -->
	
		<c:forEach var="person" items="${PersonList}">
			<tr>
			<td>${person.fname}</td>
			<td>${person.lname}</td>
			<td>${person.age}</td>
			</tr>
	</c:forEach>
	</table>
	<br>
	<div><a href="home">Home</a></div>
</body>
</html>