package com.desafiolatam.modelo;

//clase Categoria
public class Categoria {

	// atributos clase
	private int IDcategoria;
	private String nombreCategoria;

	// GETTERS-SETTERS IDcategoria
	public int getIDcategoria() {
		return IDcategoria;
	}

	public void setIDcategoria(int iDcategoria) {
		IDcategoria = iDcategoria;
	}

	// GETTERS-SETTERS NOMBREcategoria
	public String getNombreCategoria() {
		return nombreCategoria;
	}

	public void setNombreCategoria(String nombreCategoria) {
		this.nombreCategoria = nombreCategoria;
	}

	// Constructor VACIO
	public Categoria() {
		super();
	}

	// CONSTRUCTOR CATEGORIA
	public Categoria(int iDcategoria, String nombreCategoria) {
		super();
		IDcategoria = iDcategoria;
		this.nombreCategoria = nombreCategoria;
	}

}
