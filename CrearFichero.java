package ejercArchivosDirectorio;

import java.io.*;


public class CrearFichero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	//crear método CrearFichero con parámetros: nombre del fichero y del directorio
	public static void crearFichero (String hola, String ficheroChao) {
	
		// Inicializar VARIABLE LOCAL DIRECTORIO con RUTA directorio
		File directorio = new File ("src/ejercArchivosDirectorio");
		
		//preguntamos con if si directorio existe
			if (directorio.exists()== false) {
			
		//crear directorio
			directorio.mkdir()	;
			
			
		//crear variable local ARCHIVO con RUTA directorio
			File archivo= new File ("src/ejercArchivosDIrectorio");
		}
		
		
		
	}
	
}
