package org.camilob.alfanumerico;

public class EjemploThreads {
    public static void main(String[] args) {

        AlfanumericoTarea tareaNumeros = new AlfanumericoTarea(Tipo.NUMERO);
        AlfanumericoTarea tareaLetras = new AlfanumericoTarea(Tipo.LETRA);

        Thread hilo1 = new Thread(tareaNumeros);
        Thread hilo2 = new Thread(tareaLetras);

        hilo1.start();
        hilo2.start();

    }
}
