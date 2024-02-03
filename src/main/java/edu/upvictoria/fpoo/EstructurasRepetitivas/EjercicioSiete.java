package edu.upvictoria.fpoo.EstructurasRepetitivas;
import java.util.Scanner;
public class EjercicioSiete {
    public static void run() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el número de cantidades:");
        int numCantidades = sc.nextInt();

        int cantidadesMenoresIgualesCero = 0;
        int cantidadesMayoresCero = 0;

        for (int i = 1; i <= numCantidades; i++) {
            System.out.println("Ingrese la cantidad " + i + ":");
            double cantidad = sc.nextDouble();

            if (cantidad <= 0) {
                cantidadesMenoresIgualesCero++;
            } else {
                cantidadesMayoresCero++;
            }
        }

        System.out.println("Cantidad de cantidades menores o iguales a cero: " + cantidadesMenoresIgualesCero);
        System.out.println("Cantidad de cantidades mayores a cero: " + cantidadesMayoresCero);
    }
}
