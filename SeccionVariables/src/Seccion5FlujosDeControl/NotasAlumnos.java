package Seccion5FlujosDeControl;

import java.util.Scanner;

public class NotasAlumnos {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese las notas finales escala 1 - 7");
        double nota = 0;
        double acumMayores = 0;
        double acumMenores = 0;
        double acumUno = 0;
        int cont1 = 0, cont2 = 0, cont3 =0;
        double promedio = 0;

        for(int i = 1; i <= 20; i++){
            System.out.println("Por favor ingrese la nota " + i);

            try {
                nota = scanner.nextDouble();

                if(nota < 1 || nota > 7){
                    System.out.println("Nota no valida se debe finalizar el programa...");
                    main(args);
                    System.exit(0);
                }else {
                    if(nota >= 5 && nota <= 7){
                        acumMayores += nota;
                        cont1++;
                    }else if(nota > 1 && nota < 5){
                        acumMenores += nota;
                        cont2++;
                    }else if(nota == 1){
                        acumUno += nota;
                        cont3++;
                    }
                }


            }catch (Exception e){
                System.out.println("Por favor solo ingrese numeros, empieze de nuevo...");
                main(args);
                System.exit(0);
            }

        }

        promedio = acumMayores/cont1;
        System.out.println("La notas mayores a 5 son: " + cont1);
        System.out.println("El promedio es: " + promedio);

        promedio = acumMenores/cont2;
        System.out.println("La notas menores a 5 son: " + cont2);
        System.out.println("El promedio es: " + promedio);

        promedio = acumUno/cont3;
        System.out.println("La notas en 1 son: " + cont3);
        System.out.println("El promedio es: " + promedio);

        promedio = (acumMayores+acumMenores+acumUno)/20;
        System.out.println("El promedio total es: " + promedio);


    }
}
