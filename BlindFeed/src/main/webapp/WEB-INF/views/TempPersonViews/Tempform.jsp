<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>registration</title>
</head>
<body>
	<div>
		<fieldset>
			<legend>Add Person</legend>
			<!-- 
			  commandName contain object that we passed initially 
			  in each path is contain the model class atrribute
			 -->
			
			<form:form action="process" method="post" commandName="person">
			<table>
				<tr><td>Fisrt Name:</td><td><form:input path="fname"/></td></tr>
				<tr><td>Last Name:</td><td><form:input path="lname"/></td></tr>
				<tr><td>Age Name:</td><td><form:input path="age"/></td></tr>
				<tr><td></td><td><input type="submit" value="Push"></td></tr>
			</table>
		</form:form>
		</fieldset>
	</div>
	<br>
	<div><a href="home">Home</a></div>
</body>
</html>