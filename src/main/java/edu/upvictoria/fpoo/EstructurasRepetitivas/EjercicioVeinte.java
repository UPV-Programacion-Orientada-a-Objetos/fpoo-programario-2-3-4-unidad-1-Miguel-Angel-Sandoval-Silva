package edu.upvictoria.fpoo.EstructurasRepetitivas;
import java.util.Scanner;
public class EjercicioVeinte {
    public static void run() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el número de focos:");
        int numFocos = sc.nextInt();

        int focosVerdes = 0;
        int focosBlancos = 0;
        int focosRojos = 0;

        for (int i = 1; i <= numFocos; i++) {
            System.out.println("Foco " + i + ":");
            System.out.println("Ingrese el color del foco (V, B, R):");
            String colorFoco = sc.next();

            if (colorFoco.equalsIgnoreCase("V")) {
                focosVerdes++;
            } else if (colorFoco.equalsIgnoreCase("B")) {
                focosBlancos++;
            } else if (colorFoco.equalsIgnoreCase("R")) {
                focosRojos++;
            }
        }

        System.out.println("Cantidad de focos verdes: " + focosVerdes);
        System.out.println("Cantidad de focos blancos: " + focosBlancos);
        System.out.println("Cantidad de focos rojos: " + focosRojos);
    }

}
