package ejerc1;
import java.util.Scanner;
public class Encomienda_StringFormato {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	//Solicitar usuario campos para el destinatario de la encomienda
	Scanner sc = new Scanner(System.in);
	String nombre = sc.nextLine(); 			//Carmen
	String apellido = sc.nextLine(); 		//Silva
	String direccion = sc.nextLine(); 		//Los aguiluchos
	int numeroDireccion = sc.nextInt(); 	//43
	String ciudad = sc.nextLine();			//Concepción
	int telefono = sc.nextInt(); 			//562264895;
	
	//Crear etiqueta 1
		String etiqueta = String.format("DE: %s %s \nDirección: %s %d\nCiudad: %s\nContacto:%d\n", nombre, apellido, direccion, numeroDireccion, ciudad, telefono);
		System.out.println(etiqueta);
	
	//Crear etiqueta 2
		String etiqueta2 = String.format("DE: %s %s\n" + "Dirección: %s %d\n" + "Ciudad: %s\n" + "Contacto: %d\n", nombre, apellido, direccion, numeroDireccion, ciudad, telefono);
		System.out.println(etiqueta2);
	
	//Etiqueta3
		System.out.printf("DE: %s %s\n" + "Dirección: %s %d\n" + "Ciudad: %s\n"+"Contacto: %d\n", nombre, apellido, direccion, numeroDireccion, ciudad, telefono);
		
	sc.close();
}
}