package com.desafiolatam.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBD {

	// conexion singleton, enlace ser� compartido por toda la app
	private static Connection connectBD = null;

	// atributos de la Conexi�n
	private static final String DRIVER = "oracle.jdbc.driver.OracleDriver";
	private static final String URL = "jdbc:oracle:thin:@//localhost:1521/orcl2";
	private static final String USUARIO = "klin";
	private static final String PASSWORD = "hauz";

	// m�todo privado que crea configuracion para utilizar Driver de conexi�n
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

	// m�todo p�blico para conectarse
	public Connection ConectarBD() {

		if (connectBD == null) {
			CrearConexionDriver();
		}
		return connectBD;
	}

}
