package ejerc2;

import java.util.Scanner;

public class SoloPuntos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//crear programa que dibuje n puntos, n valor ingresado por usuario
		System.out.println("Ingrese un número: ");
		Scanner sc = new Scanner(System.in);
		
		//dibujar puntos
		int n= sc.nextInt();
		for(int x=0;x<n;x++) {
			System.out.printf("*");
		}
	System.out.printf("\n");	
		
		
	}

}
