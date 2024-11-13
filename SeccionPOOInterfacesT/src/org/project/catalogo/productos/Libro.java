package org.project.catalogo.productos;

import java.util.Date;

public class Libro extends Producto{

    private Date fechaPublicacion;
    private String autor;
    private String titulo;
    private String editorial;

    public Libro(int precio, Date fechaPublicacion, String autor, String titulo, String editorial) {
        super(precio);
        this.fechaPublicacion = fechaPublicacion;
        this.autor = autor;
        this.titulo = titulo;
        this.editorial = editorial;
    }

    public Date getFechaPublicacion() {
        return fechaPublicacion;
    }

    public String getAutor() {
        return autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getEditorial() {
        return editorial;
    }

    @Override
    public double getPrecioVenta() {
        return 0;
    }

    @Override
    public String toString() {
        return "Libro {\n" +
                "  Fecha de Publicación: " + fechaPublicacion + ",\n" +
                "  Autor: '" + autor + "',\n" +
                "  Título: '" + titulo + "',\n" +
                "  Editorial: '" + editorial + "',\n" +
                "  Precio: $" + getPrecio() + "\n" +
                '}';
    }




}
