package org.camilob.datetime.ejemplo;

import javax.swing.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class CalcularEdad {
    public static void main(String[] args) {
        DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        String fechaNacimiento = JOptionPane.showInputDialog("Ingrese su fecha de nacimiento: año/mes/dia");
        try {
            LocalDate fecha = LocalDate.parse(fechaNacimiento, df);
            System.out.println("La fecha ingresada es: " + fecha);
            LocalDate ahora = LocalDate.now();
            int edad = ahora.getYear() - fecha.getYear();
            System.out.println("Su edad es: " + edad + " años.");
        } catch (DateTimeParseException e) {
            System.err.println("Error: La fecha ingresada no tiene el formato correcto.");
        }

    }
}
