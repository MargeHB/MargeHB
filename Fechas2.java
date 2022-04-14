package desafio1_2;
import java.util.Scanner;
public class Fechas2 {


			public static void main(String[] args) {
			
			// Ejercicio Fechas Grupo6: Samuel Belmar + Alicia Ponce + Marcela Hermansen
			System.out.println("Desafío Quién es Mayor?");

			// Solicitar usuario ingresar Fechas
			Scanner sc = new Scanner(System.in);
			System.out.println("Ingrese Fecha de Nacimiento1 en formato DD/MM/AAA");
			String Fecha1 = sc.nextLine();
			System.out.println("Ingrese Fecha de Nacimiento2 en formato DD/MM/AAA");
			String Fecha2 = sc.nextLine();

			// Separacion Dia-Mes-Anio
			int dia1 = Integer.parseInt(Fecha1.substring(0, 2));
			int mes1 = Integer.parseInt(Fecha1.substring(3, 5));
			int anio1 = Integer.parseInt(Fecha1.substring(6));

			int dia2 = Integer.parseInt(Fecha2.substring(0, 2));
			int mes2 = Integer.parseInt(Fecha2.substring(3, 5));
			int anio2 = Integer.parseInt(Fecha2.substring(6));

			// logica
			// Comparación de anios
			if (anio1 > anio2) {
				System.out.println("la persona 2 es mayor");
			} else if (anio2 > anio1) {
				System.out.println("La persona 1 es mayor");
			}
			// Comparación por meses
			else {
				if (mes1 > mes2) {
					System.out.println("La persona 2 es mayor");
				} else if (mes1 < mes2) {
					System.out.println("La persona 1 es mayor");
				}

				// Comparación por dia?
				else {
					if (dia1 > dia2) {
						System.out.println("La persona 2 es mayor");
					} else if (dia1 < dia2) {
						System.out.println("La persona 1 es mayor");
					} else {
						System.out.println("Tienen la misma edad");
					}
				}
			}
		sc.close();
			}

	}

