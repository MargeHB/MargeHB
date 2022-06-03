package com.desafiolatam.modelo;

//clase producto
public class Producto {

	// atributos producto
	private int IDproducto;
	private String nombreProducto;
	private int precio;
	private String descripcion;
	private int IDcategoria;

	// GETTER-SETTER ID PRODUCTO
	public int getIDproducto() {
		return IDproducto;
	}

	public void setIDproducto(int iDproducto) {
		IDproducto = iDproducto;
	}

	// GETTER-SETTER NOMBRE PRODUCTO
	public String getNombreProducto() {
		return nombreProducto;
	}

	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}

	// GETTER-SETTER PRECIO
	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	// GETTER-SETTER DESCRIPCION
	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	// GETTER-SETTER CATEGORIA
	public int getIDcategoria() {
		return IDcategoria;
	}

	public void setIDcategoria(int iDcategoria) {
		IDcategoria = iDcategoria;
	}

//Constructor VACIO
	public Producto() {
		super();
	}

//CONSTRUCTOR
	public Producto(int iDproducto, String nombreProducto, int precio, String descripcion, int iDcategoria) {
		super();
		IDproducto = iDproducto;
		this.nombreProducto = nombreProducto;
		this.precio = precio;
		this.descripcion = descripcion;
		IDcategoria = iDcategoria;
	}

}
