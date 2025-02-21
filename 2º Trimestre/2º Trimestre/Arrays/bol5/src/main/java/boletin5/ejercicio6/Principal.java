package boletin5.ejercicio6;

import java.util.Scanner;

public class Principal {
    @SuppressWarnings("static-access")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Matriz matriz = new Matriz(3);
        int opcion;
        int numeroFila;
        // Opciones del menu
        do {
            System.out.println("1- Muestra la matriz: ");
            System.out.println("2- Muestra la suma de todos los elementos: ");
            System.out.println("3- Muestra la suma de la diagonal");
            System.out.println("4- Muestra suma de elementos menos la diagonal");
            System.out.println("5- Muestra suma de elementos de fila a eleccion");
            System.out.println("6- Muestra matriz con una fila borrada");//TODO revisar mostrar cab col
            System.out.println("7- Salir del programa");
            opcion = sc.nextInt();
            // Opciones ejecutadas segun haya elegido el usuario
            switch (opcion) {
                case 1:
                //Dejamos fila en blanco y mostramos matriz
                    System.out.println();
                    matriz.muestraMatriz(matriz.bidimensional);
                    break;
                case 2:
                // Sumamos elementos de la matriz
                    System.out.println();
                    System.out.println("Suma matriz: " + matriz.suma());
                    System.out.println("------------------------------");
                    break;
                case 3:
                // Sumamos diagonal
                    System.out.println();
                    System.out.println("Suma diagonal: " + matriz.suma(true));
                    System.out.println("------------------------------");
                    break;
                case 4:
                // Sumamos sin diagonal
                    System.out.println();
                    System.out.println("Suma sin diagonal: " + matriz.suma(false));
                    System.out.println("------------------------------");
                    break;
                case 5:
                // Suma de fila
                    System.out.println();
                    System.out.println("Escoge una fila: ");
                    numeroFila = sc.nextInt();
                    System.out.println("Suma de la fila: " + matriz.suma(numeroFila - 1));
                    System.out.println("------------------------------");
                    break;
                case 6:
                // Mostramos sin una fila
                    System.out.println();
                    System.out.println("Escoge una fila a eliminar: ");
                    numeroFila = sc.nextInt();
                    System.out.println("Matriz con fila borrada: ");
                    //Antes de mostrar la nueva matriz la metemos en una variable para mayor claridad
                    int[][] nueva = matriz.borraFila(matriz.bidimensional,numeroFila);
                    matriz.muestraMatriz(nueva);
                    System.out.println("------------------------------");
                    break;
                case 7:
                // Fin del programa
                    System.out.println();
                    System.out.println("Hasta otra!");
                    System.out.println("------------------------------");
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
        } while (opcion != 7);
        sc.close();
    }
}
