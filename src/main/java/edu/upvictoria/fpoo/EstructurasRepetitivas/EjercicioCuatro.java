package edu.upvictoria.fpoo.EstructurasRepetitivas;

import java.util.Scanner;

public class EjercicioCuatro {
    public static void run() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el número de alumnos:");
        int numAlumnos = sc.nextInt();

        int sumaEdades = 0;

        for (int i = 1; i <= numAlumnos; i++) {
            System.out.println("Ingrese la edad del alumno " + i + ":");
            int edad = sc.nextInt();

            sumaEdades += edad;
        }

        double edadPromedio = (double) sumaEdades / numAlumnos;
        System.out.println("La edad promedio del grupo de alumnos es: " + edadPromedio);
    }
}
