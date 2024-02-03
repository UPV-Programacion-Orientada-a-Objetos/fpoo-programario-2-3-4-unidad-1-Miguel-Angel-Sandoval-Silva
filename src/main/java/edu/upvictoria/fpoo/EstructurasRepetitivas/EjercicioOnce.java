package edu.upvictoria.fpoo.EstructurasRepetitivas;

import java.util.Scanner;

public class EjercicioOnce {
    public static void run() {
        int kilometroPersona1 = 70;
        int kilometroPersona2 = 150;

        while (kilometroPersona1 != kilometroPersona2) {
            kilometroPersona1++;
            kilometroPersona2--;

            if (kilometroPersona1 > 200 || kilometroPersona2 < 0) {
                System.out.println("Las personas no se encontrarán en la carretera.");
                break;
            }
        }

        if (kilometroPersona1 == kilometroPersona2) {
            System.out.println("Las personas se encontrarán en el kilómetro " + kilometroPersona1);
        }
    }
}
