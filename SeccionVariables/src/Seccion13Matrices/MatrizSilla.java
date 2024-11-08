package Seccion13Matrices;

import java.util.Scanner;

public class MatrizSilla {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el tamaño de la silla n * n: ");
        int n = scanner.nextInt();

        int[][] matriz = new int[n][n];


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = 0;
            }
        }

        for (int i = 0; i < n; i++) {
            matriz[i][0] = 1;
            matriz[i][n - 1] = (i <= n / 2) ? 0 : 1;

            if (i == n / 2) {
                for (int j = 1; j < n - 1; j++) {
                    matriz[i][j] = 1;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matriz[i][j]);
            }
            System.out.println();
        }

    }
}
