package com.camilob.frase.repetida;

public class EjemploFraseRepetida {
    public static void main(String[] args) {

        String texto = "Hola, Mundo, Mundo, Hola, Hola, Tu...";

        var resultado = TextRepeat.palabrasRepetidas(texto);

        resultado.forEach((palabra, frecuencia) ->
                System.out.println("Palabra más repetida: " + palabra + ", Frecuencia: " + frecuencia)
        );

    }
}
