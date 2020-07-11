
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Database.MyDAO;
import Model.Dvd;

// Servlet is mapping - path of your server application - http://localhost:8080/ServletPractice/MyFirstServlet
@WebServlet("/MyFirstServlet")
public class MyFirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public MyFirstServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String name = request.getParameter("name");

		// TODO Auto-generated method stub
		PrintWriter writer = response.getWriter();
		// This is how you set header son a servlet, tells the browser I'm going to send
		// you HTML and just not plain text
		response.setHeader("Content-Type", "text/html");
		writer.write(("<h1>Hi there " + name + "!!!</h1>"));
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		// pULLING THE PARAMETERS
		int id = Integer.valueOf(request.getParameter("id"));
		String title = request.getParameter("title");
		String genre = request.getParameter("genre");
		int year = Integer.valueOf(request.getParameter("year"));

		Dvd dvd = new Dvd(id, title, genre, year);
		MyDAO dao = new MyDAO();
		try {
			dao.insertDvd(dvd);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// System.out.println(id + " " + title);

	}

}
