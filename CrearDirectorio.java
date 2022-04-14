package ejercArchivosDirectorio;

import java.io.File;
import java.io.IOException;		

public class CrearDirectorio {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub 
	crearFichero(null, null);
	}
	
	
//Método crearFichero(Archivo) + instanciar clase File para crear directorio
	public static void crearFichero (String nombre, String fichero) throws IOException{
		
		//inicializar variable local directorio con ruta de directorio
		File directorio = new File ("src/"+nombre);
		
		//Corroborar si directorio existe, sino crearlo
		if (directorio.exists() == false) {
			directorio.mkdir();
		
			//Crear variable local "archivo" con ruta del directorio
			File archivo= new File (directorio+fichero+".txt");
			archivo.createNewFile(); 	//Método crear archivo		
		}
	}

	
}
