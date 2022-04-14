package desafio5_1;
	//crea clase vendedor, hereda de Persona
	public class Vendedor extends Persona {
		
	//atributo
	private String direccion;

	//get-set direccion
	public String getDirección() {
		return direccion;
	}

	public void setDirección(String direccion) {
		this.direccion = direccion;
	}

	//constructor
	public Vendedor(String rut, String nombre, int edad, String direccion) {
		super(rut, nombre, edad);
		this.direccion = direccion;
		
		
	}
	
	
	
	
}
