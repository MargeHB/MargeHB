package com.desafiolatam.controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.desafiolatam.dao.CategoriaDAO;
import com.desafiolatam.dao.CategoriaDAOimpl;
import com.desafiolatam.dao.ProductoDAO;
import com.desafiolatam.dao.ProductoDAOimpl;

@WebServlet("/eliminarProducto")
public class eliminarProducto extends HttpServlet {
	private static final long serialVersionUID = 1L;

	// variable para acceder a BD a través de la implementacion
	ProductoDAO productoDAO = new ProductoDAOimpl();

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// se busca el ID del producto a eliminar
		int IDproducto = Integer.parseInt(request.getParameter("IDproducto")); // este parámetro es que mostraremos en
																				// enlace para eliminarProducto

		// corroboramos que ID entregado sea número entero y por tanto "válido"
		if (IDproducto <= 0) {
			request.getRequestDispatcher("error.jsp").forward(request, response);
		}
		request.setAttribute("IDproducto", IDproducto); // será la que se ocupará en vista eliminar JSP, en value del
														// input del formulario
		request.getRequestDispatcher("eliminarProducto.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// se busca el ID del producto a eliminar
		int IDproducto = Integer.parseInt(request.getParameter("IDproducto")); // este "IDproducto" es el que se usará
																				// en jspEliminar en name del input

		// corroboramos que ID entregado sea número entero y por tanto "válido"
		if (IDproducto <= 0) {
			request.getRequestDispatcher("error.jsp").forward(request, response);
		}

		productoDAO.eliminarProducto(IDproducto);
		request.getRequestDispatcher("home.jsp").forward(request, response);
	}

}
