package ejercicios;
import java.util.ArrayList;
public class Wurlitzer {
	

	public static void main (String [] args) {
		reproductor("1");;
		}
	//se declara m�todo con par�metro de entrada
		public static String reproductor(String numero) {
		ArrayList<String> canciones = new ArrayList<String>();
		canciones.add("Yellow ledbetter");
		canciones.add("Echoes");
		canciones.add("Tu Sangre");
		canciones.add("Mi�o");
		canciones.add("La voz de los 80");
		canciones.add("Mira ni�ita");
		
		//se declara variable local llamada canci�n
		String cancion = "";
		try {
		//se convierte par�metro de string a int
			int indiceCancion = Integer.parseInt(numero);
		
		//validar que sea mayor o igual a 1
			if(indiceCancion >=1) {
		//retornar canci�n con m�todo get y n�mero ingresado por par�metro. Asignar canci�n del �ndice
		cancion = canciones.get(indiceCancion);
		}
		}
		// se lanzara cuando el indice de la cancion es mayor al tama�o del arreglo
		catch (IndexOutOfBoundsException e) {
		throw new IndexOutOfBoundsException("Indice fuera de rango " +e.getMessage());		//se ve as�: java.lang.NumberFormatException: Error en la operacion Index: 17, Size: 6
		}
		
		// se lanza cuando el par�metro sea distinto a una numero
		catch (NumberFormatException e) {
			throw new NumberFormatException("Formato de n�mero incorrecto :" + e.getMessage());	//se ve as�: java.lang.NumberFormatException: Formato de n�mero incorrecto :For input string: "prueba"
			}
			return cancion;
			}
}
