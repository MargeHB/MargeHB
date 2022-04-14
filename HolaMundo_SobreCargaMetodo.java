package ejerc2;

public class HolaMundo_SobreCargaMetodo {
	//método Main
	public static void main(String[] args) {
		System.out.println(holaMundo());
		System.out.println(holaMundo("Pepito"));
	}
	//SOBRECARGA METODO holaMundo
	public static String holaMundo(){	//mismo método pero SIN parámetros
		return "Hola Mundo!!";			//return DEBE SER de tipo STRING, pues se definió al declarar el método 
		}
	
		public static String holaMundo(String nombre){  //mismo método CON parametros
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
