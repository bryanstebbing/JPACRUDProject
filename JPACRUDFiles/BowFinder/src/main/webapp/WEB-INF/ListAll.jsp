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
		<h1>List of All Bows in the Database</h1>

		<div>
			<h5>Name: ${bow.name}</h5>
			<h6>Type: ${bow.type_of_bow}</h6>
			<h6>Weight of Pull: ${bow.weight_of_pull} lbs</h6>
			<h6>Weight of Bow: ${bow.weight_of_bow} lbs</h6>
		</div>

</body>
</html>