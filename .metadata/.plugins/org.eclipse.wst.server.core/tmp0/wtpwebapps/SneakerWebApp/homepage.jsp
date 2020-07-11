<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@
    page import="java.util.ArrayList"%>

<%@
page import="model.Sneaker"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>sneakerBay</title>
<!-- Using bootstrap library for styling -->
<link
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	rel="stylesheet" />
<link
	href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css"
	rel="stylesheet" />

</head>
<body>
	<div class="container text-center">

		<div class="row text-center">
			<div class="col-12 text-center">




				<!-- Heading of page -->
				<h4>Sneakers</h4>
				<!-- Scripting in order to use Java in a HTML page -->
				<!-- ArrayList to pass client side to JSP, passing all the sneakers to the client -->
				<%-- 
				<%
					ArrayList<Sneaker> allSneakers = (ArrayList<Sneaker>) request.getAttribute("sneakers");
				%>
 --%>

				<table class="table table-striped table-hover">
					<thead>
						<tr>
							<th>Shoe</th>
							<th>Description</th>
							<th>Colour</th>
							<th>Release date</th>
							<th>Price</th>


						</tr>
					</thead>
					<tbody>



						<c:forEach items="${sneakers}" var="sneaker">
							<tr>
								<td>${sneaker.getShoe_name()}</td>
								<td>${sneaker.getDescription()}</td>
								<td>${sneaker.getColour()}</td>
								<td>${sneaker.getRelease_date()}</td>
								<td>${sneaker.getPrice()}</td>
								<td><a class="btn btn-warning"
									href="./UpdateSneakerServlet?id=${sneaker.getId()}"><i
										class="fa fa-pencil-square-o"></i></a>
							</tr>
						</c:forEach>

					</tbody>
				</table>
			</div>
			<!-- Add button to add a new sneaker -->
			<a class href="./insert.html"><i class="fa fa-plus-square-o">Add
					new</i></a>

		</div>
	</div>
</body>
</html>