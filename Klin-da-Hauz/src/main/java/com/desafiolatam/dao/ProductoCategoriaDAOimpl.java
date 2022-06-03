package com.desafiolatam.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.desafiolatam.conexion.ConexionBD;
import com.desafiolatam.modelo.Categoria;
import com.desafiolatam.modelo.Producto;
import com.desafiolatam.modelo.ProductoCategoria;

public class ProductoCategoriaDAOimpl implements ProductoCategoriaDAO {

	// se crean instancias de las interfases
	private ProductoDAO productoDAO = new ProductoDAOimpl();
	private CategoriaDAO categoriaDAO = new CategoriaDAOimpl();

	// --------------------------------------------------------------------------------------------------------------------//
	@Override
	public List<ProductoCategoria> listarProductoCategoria() {

		// se declara e inicializa variable lista
		List<ProductoCategoria> lista = new ArrayList<>();

		List<Producto> listaProductos = productoDAO.listarProducto();

		for (Producto producto : listaProductos) {
			Categoria categoria = categoriaDAO.buscarCategoria(producto.getIDcategoria());
			ProductoCategoria productoCategoria = new ProductoCategoria();
			productoCategoria.setProducto(producto);
			productoCategoria.setCategoria(categoria);

			lista.add(productoCategoria);
		}
		return lista;
	}
}