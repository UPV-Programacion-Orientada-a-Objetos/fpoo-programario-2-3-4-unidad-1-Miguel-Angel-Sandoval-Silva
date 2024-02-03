package edu.upvictoria.fpoo.EstructurasRepetitivas;
import java.util.Scanner;
public class EjercicioDiesciocho {
    public static void run() {
        Scanner sc = new Scanner(System.in);

        int costoHamburguesaSencilla = 20;
        int costoHamburguesaDoble = 25;
        int costoHamburguesaTriple = 28;

        double cargoTarjeta = 0.05;

        System.out.println("Ingrese el número de hamburguesas a comprar:");
        int numHamburguesas = sc.nextInt();

        int totalPago = 0;

        for (int i = 1; i <= numHamburguesas; i++) {
            System.out.println("Hamburguesa " + i + ":");
            System.out.println("Ingrese el tipo de hamburguesa (S, D, T):");
            String tipoHamburguesa = sc.next();

            if (tipoHamburguesa.equalsIgnoreCase("S")) {
                totalPago += costoHamburguesaSencilla;
            } else if (tipoHamburguesa.equalsIgnoreCase("D")) {
                totalPago += costoHamburguesaDoble;
            } else if (tipoHamburguesa.equalsIgnoreCase("T")) {
                totalPago += costoHamburguesaTriple;
            }
        }

        double totalPagoTarjeta = totalPago + (totalPago * cargoTarjeta);

        System.out.println("El total a pagar es: $" + totalPago);
        System.out.println("El total a pagar con tarjeta es: $" + totalPagoTarjeta);
    }
}
