package ejercArreglos;

public class Sumar_arreglos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	System.out.println("La suma es: " + suma());
	}
		public static int suma() {
			int suma = 0;
		int[] arreglo = { 1, 5, 11, 33, 4, 6, 7, 44, 6, 1, -1 };
			for (int x = 0; x < arreglo.length; x++) {
				if (arreglo[x] >= 1 && arreglo[x] <= 10) {
				suma = suma + arreglo[x];
				}
			}
		return suma;
		}
		
	}


