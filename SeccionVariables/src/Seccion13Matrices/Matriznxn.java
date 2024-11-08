package Seccion13Matrices;

import java.util.Scanner;

public class Matriznxn {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el tamaño de la matriz n * n: ");
        int n = scanner.nextInt();

        String[][] matriz = new String[n][n];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i == j || j == matriz.length - 1 - i){
                    matriz[i][j] = "X";
                } else if (i != j){
                    matriz[i][j] = "_";
                }
            }
        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j]);
            }
            System.out.println();
        }


    }
}
