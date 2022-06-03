package cl.desafiolatam;

import java.util.ArrayList;

public class Planeta implements IPlaneta{
	private String nombre;
	private int tamanio;
	private int distanciaSol;
	private int nlunas;
	private ArrayList<Luna> lunas = new ArrayList<Luna>();
	
	
//Getters y Setters
	public String getNombre() {
		return nombre;	}

	public void setNombre(String nombre) {
		this.nombre = nombre;	}

	public int getTamanio() {
		return tamanio;	}

	public void setTamanio(int tamanio) {
		this.tamanio = tamanio;	}

	public int getDistanciaSol() {
		return distanciaSol;	}

	public void setDistanciaSol(int distanciaSol) {
		this.distanciaSol = distanciaSol;	}

	public int getNlunas() {
		return nlunas;	}

	public void setNlunas(int nlunas) {
		this.nlunas = nlunas;	}

	public ArrayList<Luna> getLunas() {
		return lunas;	}

	public void setLunas(Luna luna) {
		this.lunas.add(luna);	}

//Constructor Vacio
	public Planeta() {
		super();	}

//Constructor
	public Planeta(String nombre, int tamanio, int distanciaSol, int nlunas) {
		super();
		this.nombre = nombre;
		this.tamanio = tamanio;
		this.distanciaSol = distanciaSol;
		this.nlunas = nlunas;
	}

//toString "Planeta: La Tierra está a 149600000 km del sol, su tamaño es de 12756 km de diámetro y tiene 1 luna" 
	@Override
	public String toString() {
		return "Planeta " + nombre + " está a " + distanciaSol + "0000 km del sol, su tamaño es de " + tamanio + "km de diámetro y tiene "  + nlunas + " lunas. ";
	}

}
