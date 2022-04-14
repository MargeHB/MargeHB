package ejercArreglos;
import java.util.ArrayList;
import java.util.Iterator;
public class NombresFiltrados {

//metodo
	static void filtroNombre(String parametro) {

	//declaracion e inicializacion arrayList
	ArrayList<String> nombres = new ArrayList<String>();

	// Agregar elementos a nombres[]
	nombres.add("Juan");
	nombres.add("Pedro");
	nombres.add("Luis");
	nombres.add("Ana");
	
	
	// Recorrer array con Iterator
	for (Iterator iterator = nombres.iterator(); iterator.hasNext();){

	//declaramos variable local elemento que rescata 1er elemento del arreglo
	String elemento = (String) iterator.next();
	
	//condicional busqueda con variable local- nombre ingresado esta en elementos[]??
	if (elemento.equals(parametro)) {

	//mostrar por consola elemento en el bucle
	System.out.println("Elemento encontrado -> " + elemento);
	} else {

	//eliminar nombres no encontrados
	iterator.remove();
	System.out.println("Elemento no encontrado -> " + elemento);
}
}
}
}
