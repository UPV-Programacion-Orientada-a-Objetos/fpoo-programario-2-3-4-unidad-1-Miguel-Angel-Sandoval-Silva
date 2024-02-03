package edu.upvictoria.fpoo.EstructurasRepetitivas;
import java.util.Scanner;
public class EjercicioDiescinueve {
    public static void run() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el número de cantidades:");
        int numCantidades = sc.nextInt();

        int cantidadesCero = 0;
        int cantidadesMenorCero = 0;
        int cantidadesMayorCero = 0;

        for (int i = 1; i <= numCantidades; i++) {
            System.out.println("Ingrese la cantidad " + i + ":");
            double cantidad = sc.nextDouble();

            if (cantidad == 0) {
                cantidadesCero++;
            } else if (cantidad < 0) {
                cantidadesMenorCero++;
            } else {
                cantidadesMayorCero++;
            }
        }

        System.out.println("Cantidad de cantidades igual a cero: " + cantidadesCero);
        System.out.println("Cantidad de cantidades menor a cero: " + cantidadesMenorCero);
        System.out.println("Cantidad de cantidades mayor a cero: " + cantidadesMayorCero);
    }
}
