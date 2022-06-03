package cl.desafiolatam;

import java.util.ArrayList;

public interface IPlaneta {
	public String getNombre();
	public void setNombre(String nombre);
	public int getTamanio();
	public void setTamanio(int tamanio);
	public int getDistanciaSol(); 
	public void setDistanciaSol(int distanciaSol);
	public ArrayList<Luna> getLunas();
	public void setLunas(Luna luna);
}
