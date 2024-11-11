package com.proyecto.animales.mamifero.canino;

public class Perro extends Canino{

    private int fuerzaMordida;

    public Perro(String habitat, float altura, float largo, float peso, String nombreCientifico, String color, float tamanoColmillos, int fuerzaMordida) {
        super(habitat, altura, largo, peso, nombreCientifico, color, tamanoColmillos);
        this.fuerzaMordida = fuerzaMordida;
    }

    public int getFuerzaMordida() {
        return fuerzaMordida;
    }


    @Override
    public String comer() {
        return "El perro "+ getNombreCientifico()+ " esta comiendo, con una fuerza de mordida de: " + getFuerzaMordida() + " psi";
    }

    @Override
    public String dormir() {
        return "El perro de color " + getColor() + " ha empezado a dormir.....";
    }

    @Override
    public String correr() {
        return "El perro ha empezado a correr....";
    }

    @Override
    public String comunicarse() {
        return "El perro ha empezado a ladrar con unos colmillos de tamaño: " + getTamanoColmillos();
    }

    @Override
    public String toString() {
        return "Perro: " +
                "Nombre Cientifico= '" + nombreCientifico + '\'' +
                ", Habitat='" + habitat + '\'' +
                ", Color='" + color + '\'' +
                ", Tamano Colmillos=" + tamanoColmillos +
                ", Fuerza Mordida=" + fuerzaMordida +
                ", Altura=" + altura +
                ", Largo=" + largo +
                ", Peso=" + peso;
    }



}
