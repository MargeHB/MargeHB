package com.latam.booklet.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.latam.booklet.modelo.Libro;
import com.latam.booklet.modelo.LibroMapper;

@Repository
public class LibroDAOImpl implements LibroDAO {

    JdbcTemplate jdbcTemplate;
    DataSource dataSource;

    @Autowired
    public LibroDAOImpl(DataSource dataSource) {
        this.dataSource = dataSource;
        jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public List<Libro> findAll() {
        return jdbcTemplate.query("select * from MODBD", new LibroMapper());
    }

    @Override
    public Libro findById(Integer idLibro) {
        Object[] args = new Object[1];
        args[0] = idLibro;
        return jdbcTemplate.queryForObject("select * from MODBD where id_libro = ?", args, new LibroMapper());
    }

    @Override
    public int add(Libro libro) {
        System.out.println(libro);
        return jdbcTemplate.update("insert into modbd values (seq_libro.nextval, ?, ?, ?, ?, ?, ?, ?)", libro.getAnho(),
                libro.getTitulo(), libro.getAutor(), libro.getImprenta(), libro.getDisponibilidad(), libro.getObservaciones(), libro.getClasificacion());
    }

    @Override
    public int update(Libro libro) {
        return jdbcTemplate.update(
                "update modbd set anho = ?, titulo = ?,  autor = ?, imprenta = ?, disponible = ?, observaciones = ?, clasificacion = ? where id_libro = ?",
                libro.getAnho(), libro.getTitulo(), libro.getAutor(), libro.getImprenta(), libro.getDisponibilidad(), libro.getObservaciones(), libro.getClasificacion(),
                libro.getIdLibro());
    }

    @Override
    public int delete(Libro libro) {
        return jdbcTemplate.update("delete from modbd where id_libro = ?", libro.getIdLibro());
    }

    @Override
    public List<Libro> findByTituloOrAutor(String textoBuscado) {
        Object[] args = new Object[2];
        textoBuscado = "%"+textoBuscado+"%";
        args[0] = textoBuscado;
        args[1] = textoBuscado;
        return jdbcTemplate.query("select * from modbd where TITULO like ? or AUTOR like ?", args, new LibroMapper());
    }

}