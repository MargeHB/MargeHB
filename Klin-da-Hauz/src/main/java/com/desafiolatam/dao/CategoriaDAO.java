package com.desafiolatam.dao;

import java.util.List;

import com.desafiolatam.modelo.Categoria;

//interfaz con m�todos 
public interface CategoriaDAO {
	public Categoria buscarCategoria(int IDcategoria);

	public List<Categoria> listarCategoria();
}
