package ejerc2;

import java.util.Scanner;

public class SumaNumeroUsuario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Solicitar INGRESO N�MERO al usuario
		System.out.println("Ingrese un n�mero: ");
		
//Inicializar SCANNER
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		sc.close();
		
//Inicializar CONTADOR y ACUMULADOR
		int i= 0;
		int suma= 0;

//CONDICIONAL para RECORRER y SUMAR (desde 1 hasta n�mero ingresado por usuario-n-)
	while(i<n) {
		i++;
		suma +=i;
	}
	System.out.println("La suma es:"
			+ " "+suma);
	//System.out.printf("%d\n",suma);		//al ser printf se pone formato del texto que saldr�, COMA, variable a mostrar
	}
		
}

