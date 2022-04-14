package ejercArreglos;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class ListaPlatos {

	public static void main(String[] args) throws IOException { 
			
	
	//crear metodo llamado ordenar
		//	public static ordenar() {
			
	//crear variable local tipo ArrayList llamada lista
		ArrayList<String> lista = new ArrayList<String>();
		
	//agregar elementos al arreglo
		lista.add("Cazuela");
		lista.add("Porotos");
		lista.add("Pastel de Choclo");
		lista.add("Ají de Gallina");
		lista.add("Ceviche");
		lista.add("Arepas");
		
	//ordenar la lista
		Collections.sort(lista);
		
	//mostrar por consola
		System.out.println("La lista de comida es " + lista);
		
	


			
	}
	}

//}