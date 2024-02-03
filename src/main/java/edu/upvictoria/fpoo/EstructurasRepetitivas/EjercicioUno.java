package edu.upvictoria.fpoo.EstructurasRepetitivas;
import java.util.Scanner;
public class EjercicioUno {
    public static void run() {
        Scanner sc = new Scanner(System.in);

        int contador = 0;
        double suma = 0;

        while (contador < 10) {
            System.out.println("Ingrese un número flotante:");
            double numero = sc.nextDouble();

            suma += numero;
            contador++;
        }

        System.out.println("La suma de los diez números es: " + suma);

    }
}
