package ejercicios;

//clase hereda de clase Exception de java
public class MiExcepcion extends Exception {
	
	//método constructor
	public MiExcepcion (String arg) {
		super (arg);
	}
	
	//método de excepcion personalizado que valida si campo es nulo
	public String validaNulo (String arg) {
		String mensaje = "";
		if (arg ==null) {
			mensaje = "campo nulo";
		}
		return mensaje;
	}
}


