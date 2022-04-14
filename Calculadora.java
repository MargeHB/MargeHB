package ejerc2;
import java.util.Scanner;

public class Calculadora {

	
	public static void main(String[] args) {
	//Se declaran las variables a utilizar
	float numero = 0f;		//El número que ingrese el usuario debe ser float
	float resultado = 0;
	String ingreso = null;	//Variable tipo String, ya que puede ser un operador o un número
	int ascii = 0;			//Variable que guardará el código ascii de cada ingreso del usuario
	/** Se crea variable contador, para identificar si es el primer ingreso de usuario,el cual debe ser un número, 
	 * y luego un operador, número así sucesivamente. 
	 * Si contador es cero es inicio y debe ser	un número. Si es impar, debe ser un operador +, -, = */
  
	int contador = 0;
	Scanner sc = new Scanner(System.in); //Se crea objeto Scanner
		do {
			//Si contador es par el usuario debe ingresar un número, de lo contrario debe ingresar un operador
			if((contador % 2) == 0) {
				System.out.println("Ingrese un número: ");
			}else {
				System.out.println("Ingrese un operador (+, -, *,/=): ");
					contador++;
	sc.close();
}
//Se lee por pantalla el ingreso del usuario, operador o número
ingreso = sc.next();
/**
* Códigos ascii para operadores
* + --> 43
* - --> 45
* = --> 61
* * --> 42
* '/' --> 47
*/
ascii = (int) ingreso.charAt(0);

	//Si el programa inicio, es decir el contador esta en cero y el usuario no ingreso un operador (+, -, =)
	if(contador == 0 && ascii != 43 && ascii != 45 && ascii!= 61 && ascii != 42 && ascii != 47) {

		/**
		 * Se hace un cast de ingreso (String) a float. 
		 * Todas las clases tienen un parse, Integer.parseInteger, Double.parseDouble etc. 
		 * SE hace de esta manera, porque un String no se puede transformar en un número, sin embargo si el String no es un número, el programa dará un error.
		 */
		numero = Float.parseFloat(ingreso);
		
		//Se asigna a resultado el primer numero ingresado
		resultado = numero;
		contador++;
		}else { // De lo contrario, es el segundo ingreso de usuario
			//Suma
				if(ascii == 43) {
				resultado = sumar(resultado);
				contador++;
				}
			
			//Resta
				if(ascii == 45) {
				resultado = restar(resultado);
				contador++;
				}
		
			//Multiplicación
				if(ascii == 42) {
				resultado = multiplicar(resultado);
				contador++;
				}
			
			//División
			if(ascii == 47) {
			resultado = dividir(resultado);
			contador++;
			}
		}
		
	//Repite mientras el ingreso no sea =
		}while((int)ingreso.charAt(0) != 61);
		System.out.printf("El Resultado es: %f", resultado);
		}
		
		//método SUMAR
		static float sumar(float resultadoAnterior) {
		String ingreso = null;
		float numero = 0f;
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese un número: ");
		ingreso = sc.next(); 						//Debe ser un número o si no arrojará error
		sc.close();
		numero = Float.parseFloat(ingreso);
		return resultadoAnterior + numero;
		}
		
		//método RESTAR
		static float restar(float resultadoAnterior) {
		String ingreso = null;
		float numero = 0f;
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese un número: ");
		ingreso = sc.next(); 						//Debe ser un número o si no arrojará error
		sc.close();
		numero = Float.parseFloat(ingreso);
		return resultadoAnterior - numero;
		}
		
		//método MULTIPLICAR
		static float multiplicar(float resultadoAnterior) {
		String ingreso = null;
		float numero = 0f;
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese un número: ");
		ingreso = sc.next(); 						//Debe ser un número o si no arrojará error
		sc.close();
		numero = Float.parseFloat(ingreso);
		return resultadoAnterior * numero;
		}
		
		//método DIVIDIR
		static float dividir(float resultadoAnterior) {
		String ingreso = null;
		float numero = 0f;
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese un número: ");
		ingreso = sc.next(); 						//Debe ser un número o si no arrojará error
		sc.close();
		numero = Float.parseFloat(ingreso);
		return resultadoAnterior / numero;
		}

	
	}
