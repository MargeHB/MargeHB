package desafio_7_1;

import java.util.LinkedList;
import java.util.Queue;

public class JuegosQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//inicializar queue juegos
		Queue<String> juegos = new LinkedList<>();
		juegos.add("Tombo");
		juegos.add("Congelado");
		juegos.add("Quemaditas");
		juegos.add("Cachipún");
		juegos.add("Pillarse");
		//System.out.println(juegos);
		
		//contar juegos e imprimir
		System.out.println("Son: "+juegos.size()+" juegos");
		System.out.println("Juegos de Infancia: " + juegos);
		
	}

}
