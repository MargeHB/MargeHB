package com.desafiolatam.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBD {

	// conexion singleton, enlace será compartido por toda la app
	private static Connection connectBD = null;

	// atributos de la Conexión
	private static final String DRIVER = "oracle.jdbc.driver.OracleDriver";
	private static final String URL = "jdbc:oracle:thin:@//localhost:1521/orcl2";
	private static final String USUARIO = "klin";
	private static final String PASSWORD = "hauz";

	// método privado que crea configuracion para utilizar Driver de conexión
	private void CrearConexionDriver() {

		try {
			Class.forName(DRIVER);
			connectBD = DriverManager.getConnection(URL, USUARIO, PASSWORD);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	// método público para conectarse
	public Connection ConectarBD() {

		if (connectBD == null) {
			CrearConexionDriver();
		}
		return connectBD;
	}

}
