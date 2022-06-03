package com.desafiolatam.controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/")
public class Home extends HttpServlet {
	private static final long serialVersionUID = 1L;

	// parámetros del requerimiento y de la respuesta
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// reqDispachatcher redirige el requerimiento, en este caso a home.jsp
		request.getRequestDispatcher("home.jsp").forward(request, response);
	}

}
