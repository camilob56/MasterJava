package Seccion4Operadores;

import java.util.Scanner;

public class NumeroMayor {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int mayor = 0;
        int menor = 0;

        System.out.println("Por favor ingrese un numero entero");
        int num1 = scanner.nextInt();
        System.out.println("Por favor ingrese otro numero entero");
        int num2 = scanner.nextInt();

        mayor = (num1>num2) ? num1 : num2;
        menor = (num1<num2) ? num1 : num2;

        System.out.println("Primer numero: " + num1);
        System.out.println("Segundo numero: " + num2);
        System.out.println("El numero mayor es: " + mayor);
        System.out.println("El numero menor es: " + menor);

    }
}
