package com.desafiolatam.modelo;

//se crea clase para reflejar la relación entre catogoría y producto
public class ProductoCategoria {

	// clase con objetos como atributos
	private Producto producto;
	private Categoria categoria;

	// GETTER-SETTER PRODUCTO
	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	// GETTER-SETTER CATEGORIA
	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

//CONSTRUCTOR VACIO
	public ProductoCategoria() {
		super();
	}

//CONSTRUCTOR CON PARAMETROS
	public ProductoCategoria(Producto producto, Categoria categoria) {
		super();
		this.producto = producto;
		this.categoria = categoria;
	}

}
