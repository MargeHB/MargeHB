package desafio5_1;
	//crea clase vendedor, hereda de Persona
	public class Vendedor extends Persona {
		
	//atributo
	private String direccion;

	//get-set direccion
	public String getDirecci�n() {
		return direccion;
	}

	public void setDirecci�n(String direccion) {
		this.direccion = direccion;
	}

	//constructor
	public Vendedor(String rut, String nombre, int edad, String direccion) {
		super(rut, nombre, edad);
		this.direccion = direccion;
		
		
	}
	
	
	
	
}
