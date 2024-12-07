package org.camilob.streams;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ModificarDevolver {
    public static void main(String[] args) {

        int max = 100;
        int[] numeros = new int[max];
        int num = 1;

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = num;
            num++;
        }

        for (int n : numeros) {
            System.out.print(n + " ");
        }


        System.out.println();
        List<Double> modificaDevuelve = Collections.singletonList(Arrays.stream(numeros)
                .filter(n -> n % 10 != 0)
                .asDoubleStream()
                .map(n -> n / 2)
                .reduce(0, Double::sum));

        System.out.println(modificaDevuelve);


    }
}
