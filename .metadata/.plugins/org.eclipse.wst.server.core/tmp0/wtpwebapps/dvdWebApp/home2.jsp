<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@
    page import="java.util.ArrayList"%>

<%@
page import="model.Dvd"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome to the DVD home page</title>
<link
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	rel="stylesheet" />
<link
	href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css"
	rel="stylesheet" />



</head>
<body>
	<nav class="navbar navbar-expand-lg navbar-light bg-light">
		<a class="navbar-brand" href="#">Mohammed's DVD Shop</a>
		<a class="nav-link" href="./UserProfileServlet">Profile</a>
		<button class="navbar-toggler" type="button" data-toggle="collapse"
			data-target="#navbarSupportedContent"
			aria-controls="navbarSupportedContent" aria-expanded="false"
			aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>

		<div class="collapse navbar-collapse" id="navbarSupportedContent">
			<ul class="navbar-nav mr-auto">
			
		
			</ul>

			<c:choose>
				<c:when test="${sessionScope.loggedin==true}">
				${SessionScope.user.getUsername()}
					<a class="btn btn-danger" href="./LogoutServlet">Log Out</a>
				</c:when>
				<c:otherwise>
					<a class="btn btn-success" href="./LoginServlet">Log In</a>
					<a class="btn btn-info" href="./SignupServlet">Sign Up</a>
				</c:otherwise>
			</c:choose>

		</div>
	</nav>
	<div class="container text-center">

		<div class="row text-center">
			<div class="col-12 text-center">




				<h4>All DVDs</h4>


				<table class="table table-striped table-hover">
					<thead>
						<tr>
							<th>Title</th>
							<th>Genre</th>
							<th>Year</th>
							<th></th>

						</tr>
					</thead>
					<tbody>
						<c:forEach items="${dvds}" var="dvd">
							<tr>
								<td>${dvd.getTitle()}</td>
								<td>${dvd.getGenre()}</td>
								<td>${dvd.getYear()}</td>
								<c:if test="${sessionScope.loggedin==true}">
									<td><a class="btn btn-danger"
										href="./DeleteDvdServlet?id=${dvd.getId()}"><i
											class="fa fa-trash"></i></a> <a class="btn btn-warning"
										href="./UpdateDvdServlet?id=${dvd.getId()}"><i
											class="fa fa-pencil-square-o"></i></a>
								</c:if>
							</tr>
						</c:forEach>


					</tbody>
				</table>
			</div>
			<a class="btn btn-primary" href="./insert.html"><i
				class="fa fa-plus-square-o">Add new</i></a>

		</div>
	</div>
</body>
</html>