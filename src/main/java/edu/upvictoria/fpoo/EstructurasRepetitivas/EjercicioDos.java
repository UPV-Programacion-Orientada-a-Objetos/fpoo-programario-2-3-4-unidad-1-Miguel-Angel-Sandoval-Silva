package edu.upvictoria.fpoo.EstructurasRepetitivas;

import java.util.Scanner;

public class EjercicioDos {
    public static void run(){
        Scanner sc = new Scanner(System.in);

        int contador = 0;
        double suma = 0;

        do {
            System.out.println("Ingrese un número flotante:");
            double numero = sc.nextDouble();

            suma += numero;
            contador++;
        } while (contador < 10);

        System.out.println("La suma de los diez números es: " + suma);
    }
}
