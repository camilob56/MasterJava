package com.proyecto.animales.mamifero.canino;

public class Lobo extends Canino{

    private int numCamada;
    private String especieLobo;

    public Lobo(String habitat, float altura, float largo, float peso, String nombreCientifico, String color, float tamanoColmillos, int numCamada, String especieLobo) {
        super(habitat, altura, largo, peso, nombreCientifico, color, tamanoColmillos);
        this.numCamada = numCamada;
        this.especieLobo = especieLobo;
    }

    public int getNumCamada() {
        return numCamada;
    }

    public String getEspecieLobo() {
        return especieLobo;
    }

    @Override
    public String comer() {
        return "El lobo come con unos colmillos tamaño: " + getTamanoColmillos();
    }

    @Override
    public String dormir() {
        return "El Lobo " + getColor() + " duerme en las cavernas de " + getHabitat();
    }

    @Override
    public String correr() {
        return "El lobo corre con su numero de camada: " + getNumCamada();
    }

    @Override
    public String comunicarse() {
        return "El lobo ha empezado a aullar";
    }

    @Override
    public String toString() {
        return "Lobo: " +
                "Nombre Cientifico= '" + nombreCientifico + '\'' +
                ", Habitat='" + habitat + '\'' +
                ", Especie Lobo='" + especieLobo + '\'' +
                ", Numero de Camada=" + numCamada +
                ", Color='" + color + '\'' +
                ", Tamano Colmillos=" + tamanoColmillos +
                ", Altura=" + altura +
                ", Largo=" + largo +
                ", Peso=" + peso;
    }

}
