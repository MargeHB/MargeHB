package ejerc1;

import java.util.Scanner;

public class AreaRectangulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//se declaran variables de base y altura, y tipo de dato
		double base = 0.0;
		double altura = 0.0;
		
		//se solicita informaci�n a trav�s de consola
		Scanner sc = new Scanner(System.in);
		do {
			System.out.printf("Ingrese la base: ");
			base = sc.nextDouble();
			if (base <= 0) {
				System.out.println("Dato inv�lido");
			}
		} while (base <= 0);
		
		do {
			System.out.printf("Ingrese la altura: ");
			altura = sc.nextDouble();
			if (altura <= 0) {
				System.out.println("Dato inv�lido");
			}
		} while (altura <= 0);
		
		sc.close();
		
	//Declaraci�n Variable que guardar� resultado de operaci�n
		double area = 0.0;
	
	//Declaraci�n variable que realizar� la operaci�n
		area = base * altura;
	//Declaraci�n variable que imprimir� resultado por pantalla.
		System.out.println("El �rea del rect�ngulo es: " + area);
		
	}

}
