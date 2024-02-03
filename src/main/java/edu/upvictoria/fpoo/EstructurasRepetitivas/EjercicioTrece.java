package edu.upvictoria.fpoo.EstructurasRepetitivas;

import java.util.Scanner;

public class EjercicioTrece {
    public static void run() {
        double montoPago = 10;
        double totalPagado = 0;

        for (int mes = 1; mes <= 20; mes++) {
            totalPagado += montoPago;
            montoPago *= 2;
        }

        System.out.println("Monto mensual a pagar: $" + montoPago);
        System.out.println("Total pagado después de 20 meses: $" + totalPagado);
    }
}
