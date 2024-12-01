package com.camilob.frase;

public class EjemploFrase {

    public static void main(String[] args) {

        TextFormatter frase = new TextFormatter();
        String resultado1 = frase.formatearString(" Hola, Mundo... ");
        System.out.println(resultado1);

        TextUtilities formatoReferencia = TextFormatter::formatearString;
        String resultado3 = formatoReferencia.aplicar(" Hola, Mundo... ");
        System.out.println(resultado3);

    }

}




