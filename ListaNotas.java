package ejercArreglos;
import java.util.ArrayList;
import java.util.Collections;

public class ListaNotas {

	//public static void notas() {
		public static void main(String[] args) {
	
		//se crea metodo notas
	//public static void notas() {

	//declarar e inicializar ArrayList
		ArrayList<Double> notas = new ArrayList<>();
		notas.add(4.7);
		notas.add(2.2);
		notas.add(5.4);
		notas.add(6.9);
		notas.add(4.4);
		notas.add(2.6);

	//rescatar nota max y min, crear clase collections con sus metodos min y max
		System.out.println(Collections.min(notas));
		System.out.println(Collections.max(notas));

	}
}
