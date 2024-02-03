package edu.upvictoria.fpoo.EstructurasRepetitivas;

import java.io.IOException;
import java.util.Scanner;

public class Menu3 {
    public static void run() throws Exception{
        Menu();
    }
    public static void Menu() throws IOException {
        int opcion;
        System.out.println("Se encuentra en la carpeta de Estructura Selectiva");
        do {
            Scanner teclado = new Scanner(System.in);
            System.out.println("Si desea volver al menu principal digite 0\n" +
                    "[1]Ejercicio1\n"+
                    "[2]Ejercicio2\n" +
                    "[3]Ejercicio3\n" +
                    "[4]Ejercicio4\n" +
                    "[5]Ejercicio5\n" +
                    "[6]Ejercicio6\n" +
                    "[7]Ejercicio7\n" +
                    "[8]Ejercicio8\n" +
                    "[9]Ejercicio9\n" +
                    "[10]Ejercicio10\n" +
                    "[11]Ejercicio11\n" +
                    "[12]Ejercicio12\n" +
                    "[13]Ejercicio13\n" +
                    "[14]Ejercicio14\n" +
                    "[15]Ejercicio15\n"+
                    "[16]Ejercicio16\n" +
                    "[17]Ejercicio17\n" +
                    "[18]Ejercicio18\n" +
                    "[19]Ejercicio19\n" +
                    "[20]Ejercicio20\n");
            opcion = teclado.nextInt();
            switch (opcion){
                case 0: break;
                case 1:
                    EjercicioUno.run();break;
                case 2:
                    EjercicioDos.run();break;
                case 3:
                    EjercicioTres.run();break;
                case 4:
                    EjercicioCuatro.run();break;
                case 5:
                    EjercicioCinco.run();break;
                case 6:
                    EjercicioSeis.run();break;
                case 7:
                    EjercicioSiete.run();break;
                case 8:
                    EjercicioOcho.run();break;
                case 9:
                    EjercicioNueve.run();break;
                case 10:
                    EjercicioDiez.run();break;
                case 11:
                    EjercicioOnce.run();break;
                case 12:
                    EjercicioDoce.run();break;
                case 13:
                    EjercicioTrece.run();break;
                case 14:
                    EjercicioCatorce.run();break;
                case 15:
                    EjercicioQuince.run();break;
                case 16:
                    EjercicioDiesciseis.run();break;
                case 17:
                    EjercicioDiescisiete.run();break;
                case 18:
                    EjercicioDiesciocho.run();break;
                case 19:
                    EjercicioDiescinueve.run();break;
                case 20:
                    EjercicioVeinte.run();break;
                default:System.out.println("Esa opcion no esta disponible");break;
            }
        } while (opcion != 0);
    }
}
