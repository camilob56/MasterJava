package com.proyecto.animales.mamifero;
import com.proyecto.animales.mamifero.canino.*;
import com.proyecto.animales.mamifero.felino.*;


public class EjemploMamiferos {
    public static void main(String[] args) {

        Mamifero[] mamiferos = new Mamifero[7];

        Mamifero lobo1 = new Lobo("bosques", 0.8f, 1.5f, 50.0f, "Canis lupus", "gris", 2.5f, 4, "Lobo gris");
        Mamifero lobo2 = new Lobo("tundra", 0.7f, 1.3f, 45.0f, "Canis lupus arctos", "blanco", 2.2f, 3, "Lobo ártico");
        Mamifero perro = new Perro("ciudad", 0.5f, 1.0f, 30.0f, "Canis lupus familiaris", "marrón", 1.5f, 250);
        Mamifero tigre1 = new Tigre("bosque tropical", 1.0f, 2.7f, 100.0f, "Panthera tigris altaica", 3.2f, 60, "Tigre siberiano");
        Mamifero tigre2 = new Tigre("selva", 0.9f, 2.5f, 90.0f, "Panthera tigris", 3.0f, 65, "Tigre de Bengala");
        Mamifero leon = new Leon("Sabana Africana", 1.2f, 2.1f, 190.0f, "Panthera leo", 5.0f, 80,15, 110.5f);
        Mamifero guepardo = new Guepardo("Sabana", 0.9f, 1.5f, 72.0f, "Acinonyx jubatus", 3.5f, 120);

        mamiferos[0] = lobo1;
        mamiferos[1] = lobo2;
        mamiferos[2] = perro;
        mamiferos[3] = tigre1;
        mamiferos[4] = tigre2;
        mamiferos[5] = leon;
        mamiferos[6] = guepardo;

        for (Mamifero animal : mamiferos) {
            System.out.println(animal);
        }

        // Accion con el lobo
        System.out.println(lobo1.comer()); // Lobo comiendo
        System.out.println(lobo1.dormir()); // Lobo durmiendo

        // Accion con el perro
        System.out.println(perro.comer()); // Perro comiendo
        System.out.println(perro.correr()); // Perro corriendo

        // Accion con el tigre
        System.out.println(tigre1.comunicarse()); // Tigre comunicándose
        System.out.println(tigre1.correr()); // Tigre corriendo

        // Accion con el leon
        System.out.println(leon.comer()); // León comiendo
        System.out.println(leon.dormir()); // León durmiendo



    }

}
