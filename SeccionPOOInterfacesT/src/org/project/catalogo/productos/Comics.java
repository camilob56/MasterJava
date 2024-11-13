package org.project.catalogo.productos;

import java.util.Date;

public class Comics extends Libro{

    private String personaje;

    public Comics(int precio, Date fechaPublicacion, String autor, String titulo, String editorial, String personaje) {
        super(precio, fechaPublicacion, autor, titulo, editorial);
        this.personaje = personaje;
    }

    public String getPersonaje() {
        return personaje;
    }

    @Override
    public double getPrecioVenta() {
        return super.getPrecioVenta();
    }

    @Override
    public String toString() {
        return "Comics {\n" +
                "  Personaje: '" + personaje + "',\n" +
                "  Fecha de Publicación: " + getFechaPublicacion() + ",\n" +
                "  Autor: '" + getAutor() + "',\n" +
                "  Título: '" + getTitulo() + "',\n" +
                "  Editorial: '" + getEditorial() + "',\n" +
                "  Precio: $" + getPrecio() + "\n" +
                '}';
    }


}
