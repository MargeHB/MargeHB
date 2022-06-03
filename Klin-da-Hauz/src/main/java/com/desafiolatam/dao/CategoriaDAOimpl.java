package com.desafiolatam.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.desafiolatam.conexion.ConexionBD;
import com.desafiolatam.modelo.Categoria;

public class CategoriaDAOimpl implements CategoriaDAO {

	// se inicializa conexión a base de datos
	private ConexionBD conexionBD = new ConexionBD();

	// variables para la relacion con SQL: CONECTAR + SENTENCIA PARAMETROS + LEER Y
	// RECORRER BD
	private Connection connectBD;
	private PreparedStatement pstmBD;
	private ResultSet resultBD;

//--------------------------------------------------------------------------------------------------------------------//	
	@Override
	public Categoria buscarCategoria(int IDcategoria) {

		// se inicializan variables de búsqueda e instancia categoria
		String dataBD = "SELECT * FROM Categoria WHERE IDcategoria = ?";
		Categoria categoria = new Categoria();

		// se establece conexion con BD y sentencia para BUSCAR en ella
		connectBD = conexionBD.ConectarBD();
		try {
			pstmBD = connectBD.prepareStatement(dataBD);
			pstmBD.setInt(1, IDcategoria); // se crea int que reemplazará a ?
			resultBD = pstmBD.executeQuery(); // se ejecuta sentencia y se almacena respuesta en variable ResultSet

			// se recorre info y se traen los datos de cada atributo del Categoria
			if (resultBD.next()) {
				categoria.setIDcategoria(resultBD.getInt("IDcategoria"));
				categoria.setNombreCategoria(resultBD.getString("nombreCategoria"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return categoria;
	}

//--------------------------------------------------------------------------------------------------------------------//
	@Override
	public List<Categoria> listarCategoria() {
		// se inicializan variables de búsqueda e instancia categoria
		String dataBD = "SELECT * FROM Categoria";
		List<Categoria> listaCategorias = new ArrayList<>();

		// se establece conexion con BD y sentencia para BUSCAR en ella
		connectBD = conexionBD.ConectarBD();
		try {
			pstmBD = connectBD.prepareStatement(dataBD);
			resultBD = pstmBD.executeQuery(); // se ejecuta sentencia y se almacena respuesta en variable ResultSet

			// se recorre info y se traen los datos para luego convertirlos en un objeto y
			// agregarlos a la listaProductos
			while (resultBD.next()) {
				Categoria categoria = new Categoria();
				categoria.setIDcategoria(resultBD.getInt("IDcategoria"));
				categoria.setNombreCategoria(resultBD.getString("nombreCategoria"));
				listaCategorias.add(categoria);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return listaCategorias;
	}

}
