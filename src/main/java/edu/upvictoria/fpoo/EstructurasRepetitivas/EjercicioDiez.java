package edu.upvictoria.fpoo.EstructurasRepetitivas;

import java.util.Scanner;

public class EjercicioDiez {
    public static void run() {
        Scanner sc = new Scanner(System.in);

        int totalHoras = 0;
        double sueldo = 0;

        for (int dia = 1; dia <= 6; dia++) {
            System.out.println("Ingrese las horas trabajadas el día " + dia + ":");
            int horasDia = sc.nextInt();

            totalHoras += horasDia;
        }

        sueldo = totalHoras * 10; // Suponiendo un sueldo de $10 por hora trabajada

        System.out.println("Total de horas trabajadas: " + totalHoras);
        System.out.println("Sueldo a recibir: $" + sueldo);
    }
}
