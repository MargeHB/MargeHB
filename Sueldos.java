package ejercArreglos;

public class Sueldos {

//metodo promedio de tipo double
	public static double Promedio(){
		// Código a ejecutar dentro del método.
	
	//declarar e inicializar arreglo sueldos
		int[] sueldos= {400000, 760000, 1100000, 650000, 654980, 987300,700450, 442300};
			
	//recorrer arreglo	
		double suma= 0;
		double count=0;
		for (int i = 0; i < sueldos.length; i++) {
			if (sueldos[i] >= 500000) {
				suma += sueldos[i];
				count++;
				}
		}
		return suma / count;	
			}
		
  }

