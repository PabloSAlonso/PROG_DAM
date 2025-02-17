package boletin5.ejercicio6;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Matriz matriz = new Matriz(5);
        int opcion;
        int numeroFila;
        do{
            System.out.println("1- Muestra la matriz: ");
            System.out.println("2- Muestra la suma de todos los elementos: ");
            System.out.println("3- Muestra la suma de la diagonal");
            System.out.println("4- Muestra suma de elementos menos la diagonal");
            System.out.println("5- Muestra suma de elementos de fila a eleccion");
            System.out.println("6- Muestra matriz con una fila borrada");
            System.out.println("7- Salir del programa");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    
                    break;
                case 2:
                    System.out.println(matriz.suma());
                    break;
                case 3:
                    System.out.println(matriz.suma(true));
                    break;
                case 4:
                    System.out.println(matriz.suma(false));
                    break;
                case 5:
                    numeroFila = sc.nextInt();
                    System.out.println(matriz.suma(numeroFila));
                    break;
                case 6:
                    
                    break;
                case 7:
                    
                    break;
            
                default:
                System.out.println("Opcion no valida");
            }
        } while (opcion != 7);
        sc.close();
    }
}
