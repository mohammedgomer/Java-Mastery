<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@
    page import="java.util.ArrayList"%>

<%@
page import="model.Dvd"%>
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
	<div class="container text-center">

		<div class="row text-center">
			<div class="col-12 text-center">




				<h4>All DVDs</h4>
				<%
					ArrayList<Dvd> allDvds = (ArrayList<Dvd>) request.getAttribute("dvds");
				%>


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
						<%
							for (Dvd dvd : allDvds) {
								String buttons = "<td> <a class=\"btn btn-danger\" href=\"./DeleteDvdServlet?id=" + dvd.getId()
										+ "\"><i class=\"fa fa-trash\"></i><a/> <a class=\"btn btn-warning\" href=\"./UpdateDVDServlet?id="
										+ dvd.getId() + "\"><i class=\"fa fa-pencil-square-o\"></i><a/></td>";
								out.print("<tr><td>" + dvd.getTitle() + "</td><td>" + dvd.getGenre() + "</td><td>" + dvd.getYear());

								if ((boolean) session.getAttribute("loggedin")) {
									out.print(buttons);
								}
								out.print("</td></tr>");

								/* 		out.print("<tr><td>" + dvd.getTitle() + "</td><td>" + dvd.getGenre() + "</td><td>" + dvd.getYear()
										+ "</td><td><form method = \"POST\" action =\" ./DeleteDvdServlet\"> <input type =\"hidden\" value =\""
										+ dvd.getId()
										+ "\" name = \"id\"><input type=\"submit\" value = \"Delete\"></form></td> </tr>"); */
							}
						%>
					</tbody>
				</table>
			</div>
			<a class="btn btn-primary" href="./insert.html"><i
				class="fa fa-plus-square-o">Add new</i></a>

		</div>
	</div>
</body>
</html>