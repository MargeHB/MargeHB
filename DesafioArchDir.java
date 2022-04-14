package desafio3_2;

import java.util.ArrayList;
import java.io.*;
import java.util.Iterator;

public class DesafioArchDir {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
	crearArchivo();
	buscarTexto();
	}
	
	//crear método CREAR ARCHIVO, recibe nombreDirectorio y Fichero
	public static void crearArchivo () throws IOException {
		File dir = new File ("src/desafio3_2/dir");
		File desafio = new File ("src/desafio3_2/dir/desafio.txt");
			
		//validar que nombre directorio no exista, Si no existe CREAR DIR
			if(dir.exists()==false) {
				dir.mkdir();
				System.out.println("El directorio dir, ha sido creado con éxito");
			}else {
				System.out.println("Error al crear directorio");
			}
		
	//Se crea y completa ArrayList lista		
	ArrayList<String> lista= new ArrayList<>();	
	lista.add("Perro");
	lista.add("Gato");
	lista.add("Juan");
	lista.add("Daniel");
	lista.add("Juan");
	lista.add("Gato");
	lista.add("Perro");
	lista.add("Camila");
	lista.add("Daniel");
	lista.add("Camila");
		//System.out.println("Esta es la lista a escribir en el archivo file: "+lista);
	
	//crear Fichero
	if(desafio.exists()==true) {
		System.out.println("Archivo ya está creado");
	}else {
		desafio.createNewFile();
		System.out.println("El archivo file ha sido creado exitósamente");
	}
	
	//Escribir en el archivo el contenido de ArrayList lista con un salto de línea 
		FileWriter fileW = new FileWriter(desafio);
		BufferedWriter bufferedWriter = new BufferedWriter(fileW);
		bufferedWriter.newLine();
		
		for (Iterator iterator = lista.iterator(); iterator.hasNext();) {
			String recorrer = (String) iterator.next();
			bufferedWriter.write(recorrer);
			bufferedWriter.newLine();
		}
		bufferedWriter.close();
		System.out.println("La lista se ha escrito en el archivo");
	}
	
	//crear método buscarTexto, recibe nombre fichero y texto a buscar como parámetros de entrada
		public static void buscarTexto() {
			try {
				File desafio = new File("src/desafio3_2/dir/desafio.txt");		//ruta donde se guardará archivo desafio
				String textoBuscar= "Gato";										//variable que contiene texto a buscar
				int cont=0;														//variable auxiliar contador
				
				//validar que fichero exista
				if (desafio.exists()) {
					FileReader fr = new FileReader(desafio);
					BufferedReader br = new BufferedReader(fr);
					String dataSave = br.readLine();					//variable dataSave guardará info del archivo desafio
					 
					while (dataSave != null) {
						if(dataSave.equalsIgnoreCase(textoBuscar)) {	//condición que buscará si texto aparece en dataSave
							cont+= 1;									//contará cuántas veces aparece el texto a buscar
						} 
					dataSave = br.readLine();
					}br.close();
					System.out.println("El texto "+ textoBuscar + " está "+cont+ " veces.");	//Resultado por pantalla método buscarTexto
				}else
					System.out.println("El fichero ingresado no existe");
			} catch (Exception e) {
			// TODO: handle exception
			}
		}
}
