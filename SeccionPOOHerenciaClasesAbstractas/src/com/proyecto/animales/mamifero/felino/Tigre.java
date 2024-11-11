package com.proyecto.animales.mamifero.felino;

public class Tigre extends Felino{

    private String especieTigre;

    public Tigre(String habitat, float altura, float largo, float peso, String nombreCientifico, float tamanoGarras, int velocidad, String especieTigre) {
        super(habitat, altura, largo, peso, nombreCientifico, tamanoGarras, velocidad);
        this.especieTigre = especieTigre;
    }

    public String getEspecieTigre() {
        return especieTigre;
    }

    @Override
    public String comer() {
        return "El tigre come con sus garras de tamaño: " + getTamanoGarras();
    }

    @Override
    public String dormir() {
        return "El tigre especie " + getEspecieTigre() + " suele dormir en su habitat " + getHabitat();
    }

    @Override
    public String correr() {
        return "El tigre ha empezado a correr con una velocidad de: " + getVelocidad();
    }

    @Override
    public String comunicarse() {
        return "El tigre ha empezado a rugir....";
    }

    @Override
    public String toString() {
        return "Tigre: " +
                "Nombre Cientifico= '" + nombreCientifico + '\'' +
                ", Especie Tigre='" + especieTigre + '\'' +
                ", Habitat='" + habitat + '\'' +
                ", Tamano Garras=" + tamanoGarras +
                ", Velocidad=" + velocidad +
                ", Altura=" + altura +
                ", Largo=" + largo +
                ", Peso=" + peso;
    }



}
