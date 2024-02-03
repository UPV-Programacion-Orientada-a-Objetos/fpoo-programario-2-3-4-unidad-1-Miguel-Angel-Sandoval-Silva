package edu.upvictoria.fpoo.EstructurasRepetitivas;
import java.util.Scanner;

public class EjercicioQuince {
    public static void run() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el número de trabajadores:");
        int numTrabajadores = sc.nextInt();

        double totalPagoEmpresa = 0;

        for (int i = 1; i <= numTrabajadores; i++) {
            System.out.println("Ingrese las horas trabajadas por el empleado " + i + " en cada día de la semana:");

            int horasTrabajadas = 0;
            for (int dia = 1; dia <= 6; dia++) {
                System.out.println("Día " + dia + ":");
                int horasDia = sc.nextInt();
                horasTrabajadas += horasDia;
            }

            double sueldoSemanal = horasTrabajadas * 10; // Suponiendo un sueldo de $10 por hora trabajada

            System.out.println("El sueldo semanal del empleado " + i + " es: $" + sueldoSemanal);

            totalPagoEmpresa += sueldoSemanal;
        }

        System.out.println("La empresa pagó un total de $" + totalPagoEmpresa + " a los " + numTrabajadores + " empleados.");
    }
}
