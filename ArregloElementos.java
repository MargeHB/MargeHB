package ejercArreglos;

import java.util.ArrayList;
import java.util.Iterator;

public class ArregloElementos {

//crear metodo
public static void agregarElemento(String nuevoElemento) {

//declarar e inicializar ArrayList elementos
	ArrayList <String> elementos = new ArrayList<String>();
	elementos.add("mesa");
	elementos.add("Refrigerador");
	elementos.add("Cocina");
	elementos.add("lavadora");

//recorrer array con iterator
	for (Iterator iterator = elementos.iterator(); iterator.hasNext();) {
		//variable temporal que guardara los elementos del array
		String element = (String) iterator.next();	
//condicional
	if(element.contains(nuevoElemento)) {
		System.out.println("Elemento ya existe");
		}else{
		elementos.add(nuevoElemento);
		}
}
}
}