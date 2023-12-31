<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="jakarta.tags.core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN"
	crossorigin="anonymous">
<link rel="stylesheet" href="stylesheet.css">
<title>Archery Gear</title>
</head>
<body>

	<h1>Welcome to the Archery Gear Finder Page</h1>

	<div class="container">
		<h6>
			<a href="home.do">Home</a>
		</h6>

		<h1>Archery Gear Details</h1>

		<div class="dropdown">
			<button class="dropdownbutton">Options</button>
			<div class="dropdown-menu">
				<a href="CreateABow.jsp">Create a Bow</a> 
				<a href="FindById.jsp">Find a Bow by Id</a> 
				<a href="Update.jsp">Update a Bow by ID</a>
				<a href="Remove.jsp">Remove a Bow</a> 
				<a href="ListAll.jsp">See all Bows</a>
			</div>
		</div>
	</div>
</body>
</html>