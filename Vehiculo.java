package desafio5_1;

//creaci�n clase
public class Vehiculo {

	// declaraci�n Atributos Clase Veh�culo
	private String color;
	private String patente;

	// creaci�n Constructor
		public Vehiculo(String color, String patente) {
		this.color = color;
		this.patente = patente;
	}

	// creaci�n Getters-Setters color
		public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	// creaci�n Getters-Setters patente
	public String getPatente() {
		return patente;
	}

	public void setPatente(String patente) {
		this.patente = patente;
	}

}
