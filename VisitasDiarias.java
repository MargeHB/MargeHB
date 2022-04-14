/**
 * Desafío 3_1 -1
 * Marcela Hermansen
 */

package desafio3_1;

import java.util.ArrayList;

	public class VisitasDiarias {

		public static void main(String[] args) {
			System.out.println("Para la entrada anterior el resultado es: " + promedio());
		}

		// Crear ArrayList
		ArrayList<Integer> visitas = new ArrayList<>();

		// Creamos Método Promedio
		public static int promedio() {

			// Definición de Array visitasDiarias y su contenido (ingresar como parámetros)
			int[] visitas = { 3001, 1402, 1304, 1505 };
			
			// Se inicializa contador y variable suma
			int cont = 0;
			int suma = 0;
			
			// Recorrer Array para conocer su tamaño
			for (int x = 0; x < visitas.length; x++) {
			
				// Condicional para Conocer Valores que están dentro del rango solicitado
				if (visitas[x] > 0) {
					suma += visitas[x];
					cont++;
				}
			}
			// Retorno del programa, Promedio Visitas (suma/total)
			return suma / cont;
		}
	}


