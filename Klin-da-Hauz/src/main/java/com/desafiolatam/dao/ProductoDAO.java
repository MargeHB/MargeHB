package com.desafiolatam.dao;

import java.util.List;

import com.desafiolatam.modelo.Producto;

//se crea interfaz de producto con los m�todos requeridos
public interface ProductoDAO {

	public Producto buscarProducto(int IDproducto);

	public List<Producto> listarProducto();

	public boolean agregarProducto(Producto producto);

	public boolean modificarProducto(Producto producto);

	public boolean eliminarProducto(int IDproducto);

	// se agrega m�todo para automatizar asignaci�n ID a nuevos productos
	public int ultimoIDproducto();

}
