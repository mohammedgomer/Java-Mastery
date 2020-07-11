<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ page import="model.Dvd"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<% 
Dvd dvd = (Dvd) request.getAttribute("dvd");
%>
	<form action="./UpdateDvdServlet" method="POST">
		<h1>Update DVD</h1>
		<input type="hidden" name="id" placeholder="Title" value ="<%= dvd.getId()%>"> 
		<input type="text" name="title" placeholder="Title" value ="<%= dvd.getTitle()%>"> 
		<input type="text" name="genre" placeholder="Genre" value ="<%= dvd.getGenre()%>"> 
		<input type="text" name="year" placeholder="Year" value ="<%= dvd.getYear()%>"> 
		<button type="submit">Update</button>

	</form>


</body>
</html>