package edu.upvictoria.fpoo.EstructurasRepetitivas;
import java.util.Scanner;

public class EjercicioDiescisiete {
    public static void run() {
        double salarioInicial = 1500;
        double incrementoAnual = 0.10;
        double salarioActual = salarioInicial;

        for (int año = 1; año <= 6; año++) {
            double incremento = salarioActual * incrementoAnual;
            salarioActual += incremento;

            System.out.println("Salario del año " + año + ": $" + salarioActual);
        }

        System.out.println("Salario al cabo de 6 años: $" + salarioActual);
    }
}
