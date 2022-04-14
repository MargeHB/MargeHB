package desafio1_1;
/*import java.text.DateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;*/
import java.util.Scanner;


		public class Resistencia {

			public static void main(String[] args) {
				// TODO Auto-generated method stub

		//Ejercicio Resistencia
				System.out.println("Cálculo Resistencia Total");

		//Solicitar usuario ingresar 3 resistencias 
				Scanner sc = new Scanner(System.in);
				{
					System.out.println("Ingrese valor resistencia 1: ");
					float resistencia1 = sc.nextFloat();
					System.out.println("Ingrese valor resistencia 2: ");
					float resistencia2 = sc.nextFloat();
					System.out.println("Ingrese valor resistencia 3: ");
					float resistencia3 = sc.nextFloat();
					sc.close();

		//Calcular resistencia total
					float Rtotal = 1 / (1 / resistencia1 + 1 / resistencia2 + 1 / resistencia3);

		//Mostrar resultado en pantalla, con decimales
					System.out.println("La Resistencia Total es:" + Rtotal);

					/*
					 * //Solicitar usuario ingresar Fechas Scanner sc= new Scanner(System.in);
					 * System.out.println("Ingrese Fecha de Nacimiento1 en formato DD/MM/AAA");
					 * Integer Fecha1= sc.nextInt();
					 * 
					 * System.out.println("Ingrese Fecha de Nacimiento2 en formato DD/MM/AAA");
					 * Integer Fecha2= sc.nextInt();
					 * 
					 * //crear fecha de hoy para comparar DateFormat fechaHoy=LocalDate.now();
					 * 
					 * LocalDate fechaNacimiento; //ahora comparar los años de las dos fechas y asi
					 * obtener la edad int edad = fechaHoy.getYear() - fechaNacimiento.getYear();
					 */

				}

			}

		
	}


