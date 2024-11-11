package com.proyecto.animales.mamifero.felino;

public class Leon extends Felino{

    private int numManada;
    private float potenciaRugidoDecibel;

    public Leon(String habitat, float altura, float largo, float peso, String nombreCientifico, float tamanoGarras, int velocidad, int numManada, float potenciaRugidoDecibel) {
        super(habitat, altura, largo, peso, nombreCientifico, tamanoGarras, velocidad);
        this.numManada = numManada;
        this.potenciaRugidoDecibel = potenciaRugidoDecibel;
    }

    public int getNumManada() {
        return numManada;
    }

    public float getPotenciaRugidoDecibel() {
        return potenciaRugidoDecibel;
    }

    @Override
    public String comer() {
        return "El leon come en su habitat " + getHabitat() + " con su manada de " + getNumManada();
    }

    @Override
    public String dormir() {
        return "El leon ha empezado a dormir en su habitat " + getHabitat();
    }

    @Override
    public String correr() {
        return "El leon corre a una velocidad de: " + getVelocidad();
    }

    @Override
    public String comunicarse() {
        return "El leon ha empezado a rugir con una potencia de: " + getPotenciaRugidoDecibel() + "dB";
    }

    @Override
    public String toString() {
        return "León: " +
                "Nombre Cientifico= '" + nombreCientifico + '\'' +
                ", Habitat='" + habitat + '\'' +
                ", Tamano Garras=" + tamanoGarras +
                ", Velocidad=" + velocidad +
                ", Altura=" + altura +
                ", Largo=" + largo +
                ", Peso=" + peso +
                ", Numero de Manada=" + numManada +
                ", Potencia de Rugido (Decibelios)=" + potenciaRugidoDecibel;
    }



}
