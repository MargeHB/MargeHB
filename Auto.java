package ejercicios;

//creacion clase Auto
public class Auto {
	
	//atributos clase Auto
	private String marca;
	private String modelo;
	private String color;
	private int velocidadActual;
	private boolean patente;
	private boolean permisoCirculacion;
	private int revisionTecnica;		//indicar� a�o
		
	
	//get - set atributos
	public String getMarca() {
	return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getVelocidadActual() {
		return velocidadActual;
	}

	public void setVelocidadActual(int velocidadActual) {
		this.velocidadActual = velocidadActual;
	}

	//creacion constructor 
	public Auto(String marca, String modelo, String color, int velocidadActual) {
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.velocidadActual = velocidadActual;
		}
	
	//m�todos de la clase
	public int aumentarVelocidad(){
		velocidadActual = velocidadActual + 10;
		
		return velocidadActual;
	}
	
	/*	//sobreCarga M�todo aumentarVelocidad
	public void aumentarVelocidad(int velocidad){
		velocidadActual = velocidadActual + velocidad;
		}*/
	
	/*//sobrecarga-si no recibe par�metros aumenta en 10 su valor
	public void aumentarVelocidad(){
		velocidadActual = velocidadActual + 10;
		}*/
	
	//sobrecarga-recibe 2 valores booleanos
	public void aumentarVelocidad(boolean maximoCiudad, boolean maximoCarretera){
		if(maximoCiudad) {
		velocidadActual = velocidadActual + 50;
		}
		if(maximoCarretera) {
		velocidadActual = velocidadActual + 100;
		}
		}
	

	/*Sobrecarga de m�todo propio de java que es de la clase (sin atributos agregados dsp)
	@Override
	public String toString() {		//se define como string, le entregamos los par�metros
		return "Auto [marca=" + marca + ", modelo=" + modelo + ", color=" + color + ", velocidadActual="
				+ velocidadActual + "]";
	}*/
	
	//Sobrecarga de m�todo clase Auto con NUEVOS ATRIBUTOS AGREGADOS
	@Override
	public String toString() {
		return "El contenido de la instancia de Auto es: [marca=" + marca + ", modelo=" + modelo + ", color=" + color + ", velocidadActual="
				+ velocidadActual + ", patente=" + patente + ", permisoCirculacion=" + permisoCirculacion
				+ ", revisionTecnica=" + revisionTecnica + "]";
	}
	
	
	/*//M�todo circulacionCiudad con variables como par�metros y definicion de valores
	public void circulacionCiudad(boolean param1, boolean param2, int param3) {;
	this.revisionTecnica = param3;			//se setea su valor
	this.permisoCirculacion = param1;
	this.patente = param2;
	}*/

	//M�todo circulacionCiudad con variables como par�metros y definicion de valores
	public void circulacionCiudad(boolean param1, boolean param2, int param3) {;
	this.revisionTecnica = 2021;			//se setea su valor
	this.permisoCirculacion = false;
	this.patente = true;
	}
	
	//sobreCarga m�todo circulacionCiudad
	public void circulacionCiudad() {
	
	
	}

}
/*//m�todo MAIN
	public static void main(String[] args) {
		
	}*/