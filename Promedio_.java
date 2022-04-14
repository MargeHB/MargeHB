package desafio3_1;


	 /** Desafío 3_1 -3
	 * Marcela Hermansen
	 */

	import java.util.ArrayList;
	import java.util.Collections;

	public class Promedio_ {
		
		public static void main(String[] args) {
		sumar();
			
		}
			static void sumar() {
			
		//Se crea ArrayList lista con sus parámetros
			ArrayList<Integer> lista = new ArrayList<>();
			lista.add(10);
			lista.add(20);
			lista.add(30);
			lista.add(33);
			lista.add(21);
			lista.add(8);
			lista.add(2);
			lista.add(61);
			
			//Collections.sort(lista);
			//System.out.println("Esta es la lista original ordenada: "+lista);
		
			//recorrer y filtrar lista, dejando sólo múltiplos de 3
			ArrayList lista3 = new ArrayList<Integer>();
				for (int i = 0; i < lista.size(); i++) {
					if (lista.get(i)%3 == 0) {
						lista3.add(lista.get(i));
					}
				} 
			//System.out.println("Esta es la lista de múltiplos de 3: "+ lista3);	
			//System.out.println("Este es el tamaño de la lista múltiplos de 3: " + lista3.size());
		
			//sumar múltiplos
				int suma= 0;
				for (int x=0; x < lista3.size(); x++) {
					int listaOk= (Integer)lista3.get(x);
					suma= suma + listaOk;
				}
			 
			System.out.println(suma);
			int promedio= suma/lista3.size();
			System.out.println(promedio);
		}

	}	