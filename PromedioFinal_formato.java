package ejerc1;

import java.util.Scanner;

public class PromedioFinal_formato {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//Crear Hoja Calificaciones con la siguiente información 
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese nombre del Estudiante: ");
		String nombreEst = sc.nextLine();
		
		System.out.println("Ingrese Nombre de Asignatura: ");
		String asignatura = sc.nextLine();
		
		System.out.println("Ingrese Nombre Docente: ");
		String nombreDoc = sc.nextLine();
		
		System.out.println("Ingrese Nota1: ");
		float nota1 = sc.nextFloat();			//se ingresa como número entero, ej 4.5==>se ingresa como 45
		
		System.out.println("Ingrese Nota2: ");
		float nota2 = sc.nextFloat();
		
		System.out.println("Ingrese Nota3: ");
		float nota3 = sc.nextFloat();
		
		//Sacar promedio notas
		float promedio = (nota1 + nota2 + nota3)/3;
				
		//Desplegar información por pantalla
		System.out.printf("Nombre Estudiante: %s\n" + "Asignatura: %s\n"+ "Nombre Docente: %s\n"+"nota1: %f\n"+ "nota2: %f\n"+"nota3: %f\n" + "promedio final: %f\n", nombreEst, asignatura, nombreDoc,nota1, nota2,nota3, promedio);
		
		//Si promedio es menor a 4, mostrar reprobado. Si es igual o mayor a 4, mostrar "Aprobado"
		float a= 4.0f;
		if (promedio >= a) {
			System.out.printf("Aprobado\n");
		}else {
			System.out.println("Reprobado\n");
		}
		
		sc.close();
		
	}

}
