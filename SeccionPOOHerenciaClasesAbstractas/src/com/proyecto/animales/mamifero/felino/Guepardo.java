package com.proyecto.animales.mamifero.felino;

public class Guepardo extends Felino {

    public Guepardo(String habitat, float altura, float largo, float peso, String nombreCientifico, float tamanoGarras, int velocidad) {
        super(habitat, altura, largo, peso, nombreCientifico, tamanoGarras, velocidad);
    }

    @Override
    public String comer() {
        return "El guepardo con sus garras de tamaño: " + getTamanoGarras() + " caza sus presas para comer";
    }

    @Override
    public String dormir() {
        return "El guepardo ha empezado a dormir en su habitat " + getHabitat();
    }

    @Override
    public String correr() {
        return "El guepardo ha empezado a correr con una velocidad de: " + getVelocidad();
    }

    @Override
    public String comunicarse() {
        return "El guepardo se comunica con un chirrido";
    }

    @Override
    public String toString() {
        return "Guepardo: " +
                "Nombre Cientifico= '" + nombreCientifico + '\'' +
                ", Habitat='" + habitat + '\'' +
                ", Tamano Garras=" + tamanoGarras +
                ", Velocidad=" + velocidad +
                ", Altura=" + altura +
                ", Largo=" + largo +
                ", Peso=" + peso;
    }

}
