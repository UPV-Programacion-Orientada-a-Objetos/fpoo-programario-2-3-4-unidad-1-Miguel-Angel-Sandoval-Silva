package edu.upvictoria.fpoo;

import edu.upvictoria.fpoo.EstructurasRepetitivas.Menu3;
import edu.upvictoria.fpoo.EstructurasSelectivas.Menu2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class Menu {
    int opc;
    String entrada;
    public  void Principal() throws IOException {
        BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
        do {
            System.out.println("MENU");
            System.out.println("Ingrese que paquete desea ver");
            System.out.println("1.- ESTRUCTURAS SELECTIVAS");
            System.out.println("2.- ESTRUCTURAS REPETITIVAS");
            System.out.println("3.- ARREGLOS");
            System.out.println("4.- Salir");
            System.out.println("");
            entrada =  bufer.readLine();
            System.out.println("");
            opc = Integer.parseInt(entrada);
            switch (opc){
                case 1:
                    Menu2.run();
                    break;
                case 2:
                    try {
                        Menu3.run();
                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                    break;
                case 3:
                    System.out.println("Arreglos");
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Ingrese un numero entre 1 y 4");
            }
        }while (opc!=4);

    }
}
