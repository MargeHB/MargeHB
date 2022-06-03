package com.desafiolatam.controlador;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.desafiolatam.dao.ProductoCategoriaDAO;
import com.desafiolatam.dao.ProductoCategoriaDAOimpl;
import com.desafiolatam.modelo.ProductoCategoria;

@WebServlet("/listarProductos")
public class listarProductos extends HttpServlet {
	private static final long serialVersionUID = 1L;

	// se instancia clase para a través del dao obtener lista producto
	private ProductoCategoriaDAO productoCategoriaDAO = new ProductoCategoriaDAOimpl();

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// trae lista desde BD a través de método listar del dao
		List<ProductoCategoria> lista = productoCategoriaDAO.listarProductoCategoria();

		// enviar lista a jsp listarProducto a traves de request para su procesamiento
		request.setAttribute("productos", lista);
		request.getRequestDispatcher("listarProductos.jsp").forward(request, response);
	}

}
