package org.camilob.streams;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MayorArreglo {
    public static void main(String[] args) {

        int[] numeros ={3, 5, 12, 45, 11, 6, 65, 32, 22};
        int inicio = 0;

        Function<int[], Integer> numMayor = (array) ->
                Arrays.stream(array)
                        .reduce(Integer.MIN_VALUE, (a, b) -> a > b ? a : b);

        int mayor = numMayor.apply(numeros);
        System.out.println("El numero mayor es: " + mayor);


        /*
        int[] numeros = {1, 2, 3, 4, 5, 6, 8, 12, 32, 11};

        int maximo = Arrays.stream(numeros)
                .max()
                .orElse(Integer.MIN_VALUE);

        System.out.println("El número mayor es: " + maximo);

         */

    }
}
