package ejercArreglos;
import java.util.ArrayList;
import java.util.Iterator;

public class IterandoArrayL{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//se declara e inicializa un ArrayLIst de tipo String
		ArrayList<String>random = new ArrayList<String>();
		
		//Se agregan elementos al ArrayList
		random.add("Primero");
		random.add("Segundo");
		random.add("Tercero");
		random.add("Cuarto");
		random.add("Quinto");
		
		//se crea variable temporal iterator de tipo Iterator
		//variable arrayList random usa su metodo iterator() para crear la variable temporal iterator
		for (Iterator iterator = random.iterator(); iterator.hasNext();){
			
		//rescata primer elto de arreglo Iterator, lo asigna a variable elementos
			//con variable elemento se puede realizar condiciones de búsqueda dentro del bucle 
			String elemento = (String) iterator.next();
				
		//Se muestra por consola el elemento dentro del bucle
		System.out.println("El elemento es " + elemento);
		}		
		
		
		
		
		
	}

}
