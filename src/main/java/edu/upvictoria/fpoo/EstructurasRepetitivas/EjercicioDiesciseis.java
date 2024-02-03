package edu.upvictoria.fpoo.EstructurasRepetitivas;
import java.util.Scanner;

public class EjercicioDiesciseis {

    public static void run() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el número de ciudades:");
        int numCiudades = sc.nextInt();

        double recaudacionTotal = 0;

        for (int ciudad = 1; ciudad <= numCiudades; ciudad++) {
            System.out.println("Ciudad " + ciudad + ":");

            System.out.println("Ingrese el número de tiendas:");
            int numTiendas = sc.nextInt();

            double recaudacionCiudad = 0;

            for (int tienda = 1; tienda <= numTiendas; tienda++) {
                System.out.println("Tienda " + tienda + ":");

                System.out.println("Ingrese el número de empleados:");
                int numEmpleados = sc.nextInt();

                double recaudacionTienda = 0;

                for (int empleado = 1; empleado <= numEmpleados; empleado++) {
                    System.out.println("Empleado " + empleado + ":");
                    System.out.println("Ingrese el monto de venta:");
                    double ventaEmpleado = sc.nextDouble();

                    recaudacionTienda += ventaEmpleado;
                }

                System.out.println("La tienda " + tienda + " recaudó: $" + recaudacionTienda);

                recaudacionCiudad += recaudacionTienda;
            }

            System.out.println("La ciudad " + ciudad + " recaudó: $" + recaudacionCiudad);

            recaudacionTotal += recaudacionCiudad;
        }

        System.out.println("La cadena 'El mandilón' recaudó un total de: $" + recaudacionTotal);
    }
}
