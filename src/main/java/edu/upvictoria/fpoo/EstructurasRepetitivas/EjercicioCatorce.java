package edu.upvictoria.fpoo.EstructurasRepetitivas;
import java.util.Calendar;
import java.util.Scanner;

public class EjercicioCatorce {
    public static void run() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el número de trabajadores:");
        int numTrabajadores = sc.nextInt();

        double totalPagoEmpresa = 0;

        for (int i = 1; i <= numTrabajadores; i++) {
            System.out.println("Ingrese las horas trabajadas por el empleado " + i + " en la semana:");
            int horasTrabajadas = sc.nextInt();

            double sueldoSemanal = horasTrabajadas * 10; // Suponiendo un sueldo de $10 por hora trabajada

            System.out.println("El sueldo semanal del empleado " + i + " es: $" + sueldoSemanal);

            totalPagoEmpresa += sueldoSemanal;
        }

        System.out.println("La empresa pagó un total de $" + totalPagoEmpresa + " a los " + numTrabajadores + " empleados.");
    }
}
