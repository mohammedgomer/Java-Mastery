<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="model.Sneaker"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update Sneaker</title>
</head>
<body>
	<h1>Update Sneaker</h1>

	<!-- The insert sneaker web page -->
	<form action="./UpdateSneakerServlet" method="POST">
		<!-- Forms for inserting a sneaker -->
		<input type="hidden" name="id" value="${sneaker.getId()}"> <input
		  type="text" name="shoe_name" placeholder="Sneaker name"
			value="${sneaker.getShoe_name()}"> <input type="text"
			name="description" placeholder="Description"
			value="${sneaker.getDescription()}"> <input type="text"
			name="colour" placeholder="Colour" value="${sneaker.getColour()}">
		<input type="text" name="release_date" placeholder="Release Date"
			value="${sneaker.getRelease_date()}"> <input type="text"
			name="price" placeholder="Price" value="${sneaker.getPrice()}">
		<input type="submit">
	</form>
	
	<!-- Once a user hits back, it will take them to the home page-->
	<a href="./GetSneakerServlet">Back</a>

</body>
</html>