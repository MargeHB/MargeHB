package ejercArchivosDirectorio;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CrearEscribirEnArchivo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		crearFile();
	}

//crear METODO CREAR DIRECTORIO FISICO
	public static void crearFile() throws IOException {
		File directorio = new File ("src/carpetaDesafio");	//directorio es una instancia de la clase File, con parámetro tipo String al ser inicializado, parámetro que recibe el constructor (new FILE) de la clase
													//ruta es relativa, un subdirectorio (define desde el punto donde está parado, en este caso el proyecto)
		//COMPROBAR SI EXISTE directorio a crear
		if(directorio.exists() == false) {
		directorio.mkdir();
		
		//opcion A
		System.out.println("DIRECTORIO CREADO");
		}else {
			System.out.println("NO SE CREO DIRECTORIO");
		}
		
		/*//opcion B
				boolean accion = directorio.mkdir();
				System.out.println("RESULTADO DE ACCION====>" + accion);*/
	
	//CREAR FICHERO o ARCHIVO
	File archivo= new File ("src/carpetaDesafio/Probando.txt");
	archivo.createNewFile();
		
		//CREAR FileWriter y BufferedWriter
		
			//Crear objeto FileWriter con un Archivo File
		FileWriter fileW = new FileWriter(archivo);
		
			//Crear objeto BufferedWriter con un Archivo FileWriter
		BufferedWriter bufferedWriter = new BufferedWriter (fileW);
		
	//ESCRIBIR y CERRAR ARCHIVO
		//método WRITE para ESCRIBIR en el archivo
		bufferedWriter.write("texto Hola");
		bufferedWriter.write ("texto Chao");
		
		//SALTO de LINEA con método NEWLINE()
		bufferedWriter.newLine();
		
		//CERRAR con método CLOSE()
		bufferedWriter.close();
		
	}//cierre del método

	
}
