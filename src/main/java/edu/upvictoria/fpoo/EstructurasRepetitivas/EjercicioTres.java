package edu.upvictoria.fpoo.EstructurasRepetitivas;

import java.util.Scanner;
public class EjercicioTres {
    public static void run() {
        Scanner sc = new Scanner(System.in);

        int suma = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.println("Ingrese un número entero:");
            int numero = sc.nextInt();

            suma += numero;
        }

        System.out.println("La suma de los diez números es: " + suma);
    }
}
