package ejerc2;

public class HolaMundo_SobreCargaMetodo {
	//m�todo Main
	public static void main(String[] args) {
		System.out.println(holaMundo());
		System.out.println(holaMundo("Pepito"));
	}
	//SOBRECARGA METODO holaMundo
	public static String holaMundo(){	//mismo m�todo pero SIN par�metros
		return "Hola Mundo!!";			//return DEBE SER de tipo STRING, pues se defini� al declarar el m�todo 
		}
	
		public static String holaMundo(String nombre){  //mismo m�todo CON parametros
		return "Hola Mundo " + nombre;
		}
	
	
	
	/*public String HolaMundo_SobreCargaMetodo() {
		return "Hola Mundo !!";
		// TODO Auto-generated constructor stub
	}

	public static String holaMundo (String nombre) {
		return "Hola Mundo " + nombre;
	}*/

}
