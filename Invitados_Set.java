package desafio_7_1;

import java.util.Set;
import java.util.TreeSet;
import java.util.Arrays;
import java.util.HashSet;


public class Invitados_Set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	//Se inicializa e imprime Set invitados con parámetros
	Set<String> invitados = new HashSet<>();
	invitados.add("Daniel");
	invitados.add("Paola");
	invitados.add("Facundo");
	invitados.add("Pedro");
	invitados.add("Jacinta");
	invitados.add("Florencia");
	invitados.add("Juan Pablo");
	System.out.println(invitados);

	//Ordenar e imprimir Set invitados
	Set<String> invitadosOrdenados = new TreeSet<>(invitados);
	System.out.println(invitadosOrdenados);	
	
	//Crear e imprimir listado posiblesInvitados
	Set<String> posiblesInvitados = new TreeSet<>(Arrays.asList("Jorge","Francisco","Marcos"));
	Set<String> todosJuntos = new TreeSet<>(invitados);
	todosJuntos.addAll(posiblesInvitados);
	System.out.println(todosJuntos);	
	
	//Eliminar a Jorge!
	todosJuntos.remove("Jorge");
	System.out.println(todosJuntos);
	
	}
}
