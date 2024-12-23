package org.camilob.streams;

import java.util.Arrays;

public class AplanarArreglo {
    public static void main(String[] args) {

        int[][] matriz = {
                {1, 2, 3, 4, 5, 6, 7, 8, 9, 10},
                {2, 4, 6, 8, 10, 12, 1, 16, 7, 20},
        };

        Arrays.stream(matriz)
                .flatMapToInt(Arrays::stream)
                .distinct()
                .forEach(System.out::println);

    }
}
