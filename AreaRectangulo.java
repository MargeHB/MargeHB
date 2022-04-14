package ejerc1;

import java.util.Scanner;

public class AreaRectangulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//se declaran variables de base y altura, y tipo de dato
		double base = 0.0;
		double altura = 0.0;
		
		//se solicita información a través de consola
		Scanner sc = new Scanner(System.in);
		do {
			System.out.printf("Ingrese la base: ");
			base = sc.nextDouble();
			if (base <= 0) {
				System.out.println("Dato inválido");
			}
		} while (base <= 0);
		
		do {
			System.out.printf("Ingrese la altura: ");
			altura = sc.nextDouble();
			if (altura <= 0) {
				System.out.println("Dato inválido");
			}
		} while (altura <= 0);
		
		sc.close();
		
	//Declaración Variable que guardará resultado de operación
		double area = 0.0;
	
	//Declaración variable que realizará la operación
		area = base * altura;
	//Declaración variable que imprimirá resultado por pantalla.
		System.out.println("El área del rectángulo es: " + area);
		
	}

}
