package ejercicios;
import java.util.ArrayList;
public class Wurlitzer {
	

	public static void main (String [] args) {
		reproductor("1");;
		}
	//se declara método con parámetro de entrada
		public static String reproductor(String numero) {
		ArrayList<String> canciones = new ArrayList<String>();
		canciones.add("Yellow ledbetter");
		canciones.add("Echoes");
		canciones.add("Tu Sangre");
		canciones.add("Miño");
		canciones.add("La voz de los 80");
		canciones.add("Mira niñita");
		
		//se declara variable local llamada canción
		String cancion = "";
		try {
		//se convierte parámetro de string a int
			int indiceCancion = Integer.parseInt(numero);
		
		//validar que sea mayor o igual a 1
			if(indiceCancion >=1) {
		//retornar canción con método get y número ingresado por parámetro. Asignar canción del índice
		cancion = canciones.get(indiceCancion);
		}
		}
		// se lanzara cuando el indice de la cancion es mayor al tamaño del arreglo
		catch (IndexOutOfBoundsException e) {
		throw new IndexOutOfBoundsException("Indice fuera de rango " +e.getMessage());		//se ve así: java.lang.NumberFormatException: Error en la operacion Index: 17, Size: 6
		}
		
		// se lanza cuando el parámetro sea distinto a una numero
		catch (NumberFormatException e) {
			throw new NumberFormatException("Formato de número incorrecto :" + e.getMessage());	//se ve así: java.lang.NumberFormatException: Formato de número incorrecto :For input string: "prueba"
			}
			return cancion;
			}
}
