package boletin5.ejercicio8;

import java.util.ArrayList;
import java.util.Scanner;

public class Coleccion {
    private ArrayList<Videojuego>videojuegos;

    public void menu(){
        Scanner sc = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("1- Insertar un nuevo videojuego: ");
            System.out.println("2- Visualizar lista de videojuegos: ");
            System.out.println("3- Buscar videojuegos: ");
            System.out.println("4- Eliminar videojuegos por posiciones: ");
            System.out.println("5- Borrar videojuegos de un año determinado: ");
            System.out.println("6- Salir del programa");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    
                    break;
                case 2:
                    
                    break;
                case 3:
                    
                    break;
                case 4:
                    
                    break;
                case 5:
                    
                    break;
                case 6:
                    
                    break;
            
                default:
                    System.out.println("Opcion Invalida");
            }

        } while (opcion != 6);
    }
}
