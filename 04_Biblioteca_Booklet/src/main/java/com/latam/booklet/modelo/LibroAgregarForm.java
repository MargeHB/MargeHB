package com.latam.booklet.modelo;

public class LibroAgregarForm {
    Integer idLibro;
    Integer anho;
    String titulo;
    String autor;
    String imprenta;
    Boolean disponibilidad;
    String observaciones;
    Integer clasificacion;

    public LibroAgregarForm(Integer idLibro, Integer anho, String titulo, String autor, String imprenta, Boolean disponibilidad, String observaciones, Integer clasificacion) {
        super();
        this.idLibro = idLibro;
        this.anho = anho;
        this.titulo = titulo;
        this.autor = autor;
        this.imprenta = imprenta;
        this.disponibilidad = disponibilidad;
        this.observaciones = observaciones;
        this.clasificacion = clasificacion;
    }

    public LibroAgregarForm(Libro libro) {
        super();
        this.idLibro = libro.getIdLibro();
        this.anho = libro.getAnho();
        this.titulo = libro.getTitulo();
        this.autor = libro.getAutor();
        this.imprenta = libro.getImprenta();
        this.disponibilidad = null != libro.getDisponibilidad() ? (libro.getDisponibilidad() == 1) : true;
        this.observaciones = libro.getObservaciones();
        this.clasificacion = libro.getClasificacion();
    }

    public LibroAgregarForm() {
        super();
    }

    public Integer getIdLibro() {
        return idLibro;
    }

    public void setIdLibro(Integer idLibro) {
        this.idLibro = idLibro;
    }

    public Integer getAnho() {
        return anho;
    }

    public void setAnho(Integer anho) {
        this.anho = anho;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getImprenta() {
        return imprenta;
    }

    public void setImprenta(String imprenta) {
        this.imprenta = imprenta;
    }

    public Boolean getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(Boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }
    
    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public Integer getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(Integer clasificacion) {
        this.clasificacion = clasificacion;
    }
    
    @Override
    public String toString() {
        return "Libro [idLibro=" + idLibro + ", anho=" + anho + ", titulo=" + titulo + ", autor=" + autor
                + ", imprenta=" + imprenta + ", disponibilidad=" + disponibilidad + ", observaciones=" + observaciones + ", clasificacion" + clasificacion +"]";
    }



}