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

	// variable para acceder a BD a trav�s de la implementacion
	ProductoDAO productoDAO = new ProductoDAOimpl();

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// se busca el ID del producto a eliminar
		int IDproducto = Integer.parseInt(request.getParameter("IDproducto")); // este par�metro es que mostraremos en
																				// enlace para eliminarProducto

		// corroboramos que ID entregado sea n�mero entero y por tanto "v�lido"
		if (IDproducto <= 0) {
			request.getRequestDispatcher("error.jsp").forward(request, response);
		}
		request.setAttribute("IDproducto", IDproducto); // ser� la que se ocupar� en vista eliminar JSP, en value del
														// input del formulario
		request.getRequestDispatcher("eliminarProducto.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// se busca el ID del producto a eliminar
		int IDproducto = Integer.parseInt(request.getParameter("IDproducto")); // este "IDproducto" es el que se usar�
																				// en jspEliminar en name del input

		// corroboramos que ID entregado sea n�mero entero y por tanto "v�lido"
		if (IDproducto <= 0) {
			request.getRequestDispatcher("error.jsp").forward(request, response);
		}

		productoDAO.eliminarProducto(IDproducto);
		request.getRequestDispatcher("home.jsp").forward(request, response);
	}

}
