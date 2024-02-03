package edu.upvictoria.fpoo.EstructurasRepetitivas;
import java.util.Scanner;
public class EjercicioNueve {
    public static void run() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el número de elementos de la sucesión de Fibonacci:");
        int numElementos = sc.nextInt();

        int num1 = 0;
        int num2 = 1;

        System.out.println("Sucesión de Fibonacci:");

        System.out.print(num1 + ", " + num2 + ", ");

        for (int i = 3; i <= numElementos; i++) {
            int siguiente = num1 + num2;
            System.out.print(siguiente + ", ");

            num1 = num2;
            num2 = siguiente;
        }
    }
}
