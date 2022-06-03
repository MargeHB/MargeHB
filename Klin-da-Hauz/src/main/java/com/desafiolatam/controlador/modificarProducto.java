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

@WebServlet("/modificarProducto")
public class modificarProducto extends HttpServlet {
	private static final long serialVersionUID = 1L;

	// variables para acceder a BD a trav�s de la implementacion
	ProductoDAO productoDAO = new ProductoDAOimpl();
	CategoriaDAO categoriaDAO = new CategoriaDAOimpl();

//------------------------------------------------------------------------------------------------------------------------------------	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// se busca el ID del producto a modificar
		int IDproducto = Integer.parseInt(request.getParameter("IDproducto")); // este parametro ser� el que
																				// insertaremos en listarPro y
																				// modificarjsp en value

		// corroboramos que ID entregado sea n�mero entero y por tanto "v�lido"
		if (IDproducto <= 0) {
			request.getRequestDispatcher("error.jsp").forward(request, response);
		}

		// buscar� producto a trav�s del ID
		Producto producto = productoDAO.buscarProducto(IDproducto);

		// corrobora que producto que se trae de BD no sea "nuevo", que tenga registros
		// y sea v�lido
		if (producto.getIDproducto() == 0) {
			request.getRequestDispatcher("error.jsp").forward(request, response);
		}
		// se agrega la categoria
		List<Categoria> categoria = categoriaDAO.listarCategoria();
		request.setAttribute("categorias", categoria); // ser� la que se ocupar� en vista

		// se agrega el objeto modificado/editado
		request.setAttribute("producto", producto); // ser� la que se ocupar� en vista
		request.getRequestDispatcher("modificarProducto.jsp").forward(request, response);
	}

//-------------------------------------------------------------------------------------------------------------------------------------------------	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// se setea idioma
		request.setCharacterEncoding("UTF-8");

		// par�metros a traer (luego estos se mostrar�n en el value de modificarJSP, en
		// name"")
		String nombreProducto = request.getParameter("nombre");
		int precio = Integer.parseInt(request.getParameter("precio"));
		String descripcion = request.getParameter("descripcion");
		int IDcategoria = Integer.parseInt(request.getParameter("categoria"));
		int IDproducto = Integer.parseInt(request.getParameter("IDproducto")); // este es par�metro que hay que agregar
																				// en modificarJSP, en name del input

		// corroboramos que ID entregado sea n�mero entero y por tanto "v�lido"
		if (IDproducto <= 0) {
			request.getRequestDispatcher("error.jsp").forward(request, response);
		}

		// parametros se transforman en objeto producto para ser enviados
		Producto producto = new Producto();

		producto.setIDproducto(IDproducto);
		producto.setNombreProducto(nombreProducto);
		producto.setPrecio(precio);
		producto.setDescripcion(descripcion);
		producto.setIDcategoria(IDcategoria);

		// se agregar� objeto modificado utilizando m�todo modificarProducto
		productoDAO.modificarProducto(producto);

		// al terminar operaci�n, volver� a pag de inicio
		request.getRequestDispatcher("home.jsp").forward(request, response);
	}

}
