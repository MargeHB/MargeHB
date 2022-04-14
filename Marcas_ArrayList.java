package desafio_7_1;

import java.util.ArrayList;

public class Marcas_ArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Crear ArrayList marcas
		ArrayList<String> marcas= new ArrayList <>();
		marcas.add("Fiorucci");
		marcas.add("Pamela Grant");
		marcas.add("Il Gioco");
		marcas.add("Bambino");
		marcas.add("Chiteco");
		marcas.add("Advance");
		marcas.add("Caricia");
		marcas.add("Free");
		marcas.add("Marca Chancho");
		marcas.add("Atari");
		System.out.println("Esta es el listado de marcas original: " + marcas);
		
		//Agregar 3 marcas al listado
		ArrayList<String>otrasMarcas = new ArrayList<>();
		otrasMarcas.add("Blokbaster");
		otrasMarcas.add("Carrefour");
		otrasMarcas.add("Jetix");
		
		marcas.addAll(otrasMarcas);
		System.out.println("Este es listado de marcas agregadas: " + marcas);
		
		//cambiar marca mal escrita
		marcas.set(10,"Blockbuster");
		System.out.println("Esta es el listado con marca corregida: " + marcas);
		//System.out.println(marcas.remove("Carrefour"));   =====> probando. Efectivamente cuando existe el atributo, retorna true
		//borrar marca Carrefour
		marcas.remove(11);
		System.out.println("Esta es el listado sin Carrefour: " + marcas);
		
		//Corroborar que se borró marca Carrefour
		System.out.println(marcas.remove("Carrefour"));		//false pues no lo encuentra
		
		//Crear nueva colección Marcas Fuera del Mercado y agregarla al listado marcas
		ArrayList<String> posiblesMarcas = new ArrayList<>();
		posiblesMarcas.add("Mampato");
		posiblesMarcas.add("Grosso");
		posiblesMarcas.add("Peta Zeta");
		posiblesMarcas.add("Chocolate Safari");
		posiblesMarcas.add("Traga Traga");
		
		marcas.addAll(posiblesMarcas);
		System.out.println("Esta es la lista con otras posibles Marcas: " + marcas);
		
		//contar número de elementos de la lista
		System.out.println("Esta lista tiene: " + marcas.size() + " elementos, que son: " + marcas);	
		
	}

}
