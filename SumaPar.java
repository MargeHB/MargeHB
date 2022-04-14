package ejerc2;

import java.io.InputStream;
import java.util.Scanner;

public class SumaPar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		
	//sumar números pares dentro de ciclo entre 1 y # ingresado por usuario (si n=100, R=2550)
		System.out.println("Ingrese un número: ");
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		
		
	//ciclo condicional	
		int i=0;		//variable que itera
		int suma=0;		//variable que guarda resultados
		while (i<n) {
			i++;
			if(i%2==0) {
				suma += i;
			}
		}	
		System.out.println(suma);
	}

}
				
		
		
	
