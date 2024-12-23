package org.camilob.streams;

import java.util.Arrays;
import java.util.OptionalInt;

public class MayorArreglo {
    public static void main(String[] args) {

        int[] numeros = {1, 2, 3, 4, 5, 6, 8, 12, 32, 11};

        int maximo = Arrays.stream(numeros)
                .max()
                .orElse(Integer.MIN_VALUE);

        System.out.println("El número mayor es: " + maximo);

    }
}
