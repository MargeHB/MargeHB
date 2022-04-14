package desafio_7_1;

import java.util.Map;
import java.util.TreeMap;

public class Golosinas_Map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//Se instancia Map golosinas
	Map<String, Integer> golosinas = new TreeMap<>();
	golosinas.put("Chocman", 100);
	golosinas.put("Trululú", 100);
	golosinas.put("Centella", 100);
	golosinas.put("Kilate", 50);
	golosinas.put("Miti-miti", 30);
	golosinas.put("Traga Traga", 150);
	golosinas.put("Tabletón", 5);
	System.out.println(golosinas);
	
	//Filtrar golosinas >=100 (para subir a rrss)
	golosinas.entrySet().stream().filter(precio -> precio.getValue()<=100).forEach(System.out::println);		

		
	}

}
