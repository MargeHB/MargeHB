package desafio5_1;
	//crear clase Persona
	public class Persona {
		
	//atributos Persona
	private String rut;
	private String nombre;
	private int edad;
	
	//get-set de rut-nombre-edad
	public String getRut() {
		return rut;
	}
	public void setRut(String rut) {
		this.rut = rut;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	//Constructor Clase Persona
	public Persona(String rut, String nombre, int edad) {
		this.rut = rut;
		this.nombre = nombre;
		this.edad = edad;
	}
	
}
