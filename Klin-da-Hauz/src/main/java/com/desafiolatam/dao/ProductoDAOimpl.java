package com.desafiolatam.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.desafiolatam.modelo.Categoria;
import com.desafiolatam.modelo.Producto;
import com.desafiolatam.conexion.ConexionBD;

//se crea clase que implementará métodos de Producto Dao
public class ProductoDAOimpl implements ProductoDAO {

	// se inicializa conexión a base de datos
	private ConexionBD conexionBD = new ConexionBD();

	// variables para la relacion con SQL: CONECTAR + SENTENCIA PARAMETROS + LEER Y
	// RECORRER BD
	private Connection connectBD;
	private PreparedStatement pstmBD;
	private ResultSet resultBD;

//--------------------------------------------------------------------------------------------------------------------//	
	@Override // implementacion método BUSCARproducto
	public Producto buscarProducto(int IDproducto) {

		// se inicializan variables de búsqueda e instancia producto
		String dataBD = "SELECT * FROM Producto WHERE IDproducto = ?";
		Producto producto = new Producto();
		Categoria categoria = new Categoria();

		// se establece conexion con BD y sentencia para BUSCAR en ella
		connectBD = conexionBD.ConectarBD();
		try {
			pstmBD = connectBD.prepareStatement(dataBD);
			pstmBD.setInt(1, IDproducto); // se crea int que reemplazará a ?
			resultBD = pstmBD.executeQuery(); // se ejecuta sentencia y se almacena respuesta en variable ResultSet

			// se recorre info y se traen los nombres de las columnas de la BD
			if (resultBD.next()) {
				producto.setIDproducto(resultBD.getInt("IDproducto"));
				producto.setNombreProducto(resultBD.getString("nombreProducto"));
				producto.setPrecio(resultBD.getInt("precio"));
				producto.setDescripcion(resultBD.getString("descripcion"));
				producto.setIDcategoria(resultBD.getInt("IDcategoria"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return producto;
	}

//--------------------------------------------------------------------------------------------------------------------//
	@Override // implementacion método LISTARproducto
	public List<Producto> listarProducto() {
		// se declara variable que recibirá datos y la que guardará lista
		String dataBD = "SELECT * FROM Producto";
		List<Producto> listaProductos = new ArrayList<>();

		// se establece conexion con BD
		connectBD = conexionBD.ConectarBD();
		try {
			pstmBD = connectBD.prepareStatement(dataBD);
			resultBD = pstmBD.executeQuery(); // se ejecuta sentencia y se almacena respuesta en variable ResultSet

			// se recorre info y se traen los datos para luego convertirlos en un objeto y
			// agregarlos a la listaProductos
			while (resultBD.next()) {
				Producto producto = new Producto();
				producto.setIDproducto(resultBD.getInt("IDproducto"));
				producto.setNombreProducto(resultBD.getString("nombreProducto"));
				producto.setPrecio(resultBD.getInt("precio"));
				producto.setDescripcion(resultBD.getString("descripcion"));
				producto.setIDcategoria(resultBD.getInt("IDcategoria"));
				listaProductos.add(producto);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return listaProductos;
	}

//--------------------------------------------------------------------------------------------------------------------//
	@Override // implementacion método AGREGARproducto
	public boolean agregarProducto(Producto producto) {

		// variable búsqueda+declaracion+conexión
		String dataBD = "INSERT INTO Producto (IDproducto, nombreProducto, precio, descripcion,IDcategoria)"
				+ "VALUES (?,?,?,?,?)";
		connectBD = conexionBD.ConectarBD();

		try {
			pstmBD = connectBD.prepareStatement(dataBD);

			pstmBD.setInt(1, producto.getIDproducto());
			pstmBD.setString(2, producto.getNombreProducto());
			pstmBD.setInt(3, producto.getPrecio());
			pstmBD.setString(4, producto.getDescripcion());
			pstmBD.setInt(5, producto.getIDcategoria());

			// se declara variable que guardará resultado (n° fila afectada)
			int resultado = pstmBD.executeUpdate();

			// Se revisa si fue sólo 1 la fila afectada/agregada, de no serlo retornará
			// false
			if (resultado == 1) {
				return true;
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
//--------------------------------------------------------------------------------------------------------------------//

	@Override
	public boolean modificarProducto(Producto producto) {

		// variable búsqueda+declaracion+conexión
		String dataBD = "UPDATE Producto SET nombreProducto=?, precio=?, descripcion=?,IDcategoria=?"
				+ "WHERE IDproducto=?";
		connectBD = conexionBD.ConectarBD();

		try {
			pstmBD = connectBD.prepareStatement(dataBD);

			pstmBD.setString(1, producto.getNombreProducto());
			pstmBD.setInt(2, producto.getPrecio());
			pstmBD.setString(3, producto.getDescripcion());
			pstmBD.setInt(4, producto.getIDcategoria());
			pstmBD.setInt(5, producto.getIDproducto());

			// se declara variable que guardará resultado (n° fila afectada)
			int resultado = pstmBD.executeUpdate();

			// Se revisa si fue sólo 1 la fila afectada/modificada, de no serlo retornará
			// false
			if (resultado == 1) {
				return true;
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

//--------------------------------------------------------------------------------------------------------------------//
	@Override
	public boolean eliminarProducto(int IDproducto) {
		// variable búsqueda+declaracion+conexión
		String dataBD = "DELETE FROM Producto WHERE IDproducto=?";
		connectBD = conexionBD.ConectarBD();

		try {
			pstmBD = connectBD.prepareStatement(dataBD);
			pstmBD.setInt(1, IDproducto);

			// se declara variable que guardará resultado (n° fila afectada)
			int resultado = pstmBD.executeUpdate();

			// Se revisa si fue sólo 1 la fila afectada/eliminada, de no serlo retornará
			// false
			if (resultado == 1) {
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

//--------------------------------------------------------------------------------------------------------------------//
	@Override
	public int ultimoIDproducto() {

		// se inicializa variable que arrojará último ID
		int maximo = 0;

		String dataBD = "SELECT MAX(IDproducto) AS maxID FROM Producto";

		// se establece conexion con BD y sentencia para BUSCAR en ella
		connectBD = conexionBD.ConectarBD();
		try {
			pstmBD = connectBD.prepareStatement(dataBD);
			resultBD = pstmBD.executeQuery(); // se ejecuta sentencia y se almacena respuesta en variable ResultSet

			// se verifica que número obtenido corresponde al ID más alto
			if (resultBD.next()) {
				maximo = resultBD.getInt("maxID");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return maximo;
	}

}
