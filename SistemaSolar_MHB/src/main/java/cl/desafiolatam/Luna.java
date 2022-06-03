package cl.desafiolatam;

public class Luna implements ILuna{
	private String nombreLuna;
	private int diametro;
	private double tpOrbita;
	
//Getters y Setters
	public String getNombreLuna() {
		return nombreLuna;	}
	public void setNombreLuna(String nombreLuna) {
		this.nombreLuna = nombreLuna;	}
	
	public int getDiametro() {
		return diametro;	}
	public void setDiametro(int diametro) {
		this.diametro = diametro;	}
	
	public double getTpOrbita() {
		return tpOrbita;	}
	public void setTpOrbita(double tpOrbita) {
		this.tpOrbita = tpOrbita;	}
		
//constructor vacio
	public Luna() {
		super();	}
	
//constructor
	public Luna(String nombreLuna, int diametro, double tpOrbita) {
		super();
		this.nombreLuna = nombreLuna;
		this.diametro = diametro;
		this.tpOrbita = tpOrbita;
	}
	
//toString "Luna de nombre Luna que mide 3476 km de diámetro y el tiempo de órbita es de 27322.0	días."
	@Override
	public String toString() {
		return "Una luna de nombre " + nombreLuna + ", que mide " + diametro + "km de diámetro, y cuyo tiempo de órbita es de " + tpOrbita + " días.";
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
