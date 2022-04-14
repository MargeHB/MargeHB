package desafio5_1;

//creación clase
public class Vehiculo {

	// declaración Atributos Clase Vehículo
	private String color;
	private String patente;

	// creación Constructor
		public Vehiculo(String color, String patente) {
		this.color = color;
		this.patente = patente;
	}

	// creación Getters-Setters color
		public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	// creación Getters-Setters patente
	public String getPatente() {
		return patente;
	}

	public void setPatente(String patente) {
		this.patente = patente;
	}

}
