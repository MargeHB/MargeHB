package com.desafiolatam.controlador;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.desafiolatam.dao.CategoriaDAO;
import com.desafiolatam.dao.CategoriaDAOimpl;
import com.desafiolatam.dao.ProductoDAO;
import com.desafiolatam.dao.ProductoDAOimpl;
import com.desafiolatam.modelo.Categoria;
import com.desafiolatam.modelo.Producto;

@WebServlet("/agregarProducto")
public class agregarProducto extends HttpServlet {
	private static final long serialVersionUID = 1L;

	// variables para acceder a BD a través de la implementacion
	ProductoDAO productoDAO = new ProductoDAOimpl();
	CategoriaDAO categoriaDAO = new CategoriaDAOimpl();

//------------------------------------------------------------------------------------------------------------------------------------	
	// retornará la vista de agregar producto -con formulario
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		List<Categoria> categorias = categoriaDAO.listarCategoria();
		request.setAttribute("categorias", categorias);
		request.getRequestDispatcher("agregarProducto.jsp").forward(request, response);
	}

//------------------------------------------------------------------------------------------------------------------------------------
	// recibe información desde el formulario, los transforma en objeto y los guarda
	// en BD
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// se setea idioma
		request.setCharacterEncoding("UTF-8");

		// parámetros a traer
		String nombreProducto = request.getParameter("nombre"); // estos serán los parámetros a agregar en jsp
																// agregarProductos
		int precio = Integer.parseInt(request.getParameter("precio"));
		String descripcion = request.getParameter("descripcion");
		int IDcategoria = Integer.parseInt(request.getParameter("categoria"));

		// asignar id al nuevo producto
		int IDproducto = productoDAO.ultimoIDproducto();

		Producto producto = new Producto();
		producto.setIDproducto(IDproducto + 1);
		producto.setNombreProducto(nombreProducto);
		producto.setPrecio(precio);
		producto.setDescripcion(descripcion);
		producto.setIDcategoria(IDcategoria);

		// se agregará objeto recién creado utilizando método agregarProducto
		productoDAO.agregarProducto(producto);

		// al terminar operación, volverá a pag de inicio
		request.getRequestDispatcher("home.jsp").forward(request, response);

	}

}
