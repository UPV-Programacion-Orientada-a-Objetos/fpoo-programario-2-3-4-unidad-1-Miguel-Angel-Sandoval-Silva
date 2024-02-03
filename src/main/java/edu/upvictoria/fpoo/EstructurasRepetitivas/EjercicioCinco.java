package edu.upvictoria.fpoo.EstructurasRepetitivas;

import java.util.Scanner;

public class EjercicioCinco {
    public static void run() {
        Scanner sc = new Scanner(System.in);

        int contador = 0;
        double sumaEstaturas = 0;

        System.out.println("Ingrese las estaturas de las personas (ingrese 0 para finalizar):");

        while (true) {
            double estatura = sc.nextDouble();

            if (estatura == 0) {
                break;
            }

            sumaEstaturas += estatura;
            contador++;
        }

        double estaturaPromedio = sumaEstaturas / contador;
        System.out.println("La estatura promedio del grupo de personas es: " + estaturaPromedio);
    }
}
