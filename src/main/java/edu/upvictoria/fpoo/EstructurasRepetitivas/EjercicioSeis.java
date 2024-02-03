package edu.upvictoria.fpoo.EstructurasRepetitivas;

import java.util.Scanner;

public class EjercicioSeis {

    public static void run() {
        Scanner sc = new Scanner(System.in);

        double ahorroTotal = 0;

        for (int mes = 1; mes <= 12; mes++) {
            System.out.println("Ingrese la cantidad de dinero ahorrada en el mes " + mes + ":");
            double ahorroMensual = sc.nextDouble();

            ahorroTotal += ahorroMensual;

            System.out.println("El ahorro acumulado hasta el mes " + mes + " es: " + ahorroTotal);
        }

        System.out.println("El ahorro total en el año es: " + ahorroTotal);
    }
}
