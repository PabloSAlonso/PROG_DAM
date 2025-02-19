package exception.ejercicio1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        double libras, euros;

        do {
            try {
                System.out.println("Introduce un número según desees:");
                System.out.println("1. Pasar de euros a libras");
                System.out.println("2. Pasar de libras a euros");
                System.out.println("3. Salir");
                System.out.print("Opción: ");
                opcion = sc.nextInt();
                
                switch (opcion) {
                    case 1:
                        do {
                            try {
                                System.out.println("Introduce la cantidad de euros:");
                                euros = sc.nextDouble();
                                if (euros < 0) {
                                    System.out.println("No se puede introducir un número negativo. Introduce un número de euros válido.");
                                }
                            } catch (InputMismatchException e) {
                                System.out.println("Has introducido un carácter inválido. Inténtalo de nuevo.");
                                sc.nextLine(); // Limpiar buffer
                                euros = -1; // Asegura que se repita el bucle
                            }
                        } while (euros < 0);
                        libras = euros * 0.85;
                        System.out.printf("La cantidad de euros en libras es %.2f \n", libras);
                        break;

                    case 2:
                        do {
                            try {
                                System.out.println("Introduce la cantidad de libras:");
                                libras = sc.nextDouble();
                                if (libras < 0) {
                                    System.out.println("No se puede introducir un número negativo. Introduce un número de libras válido.");
                                }
                            } catch (InputMismatchException e) {
                                System.out.println("Has introducido un carácter inválido. Inténtalo de nuevo.");
                                sc.nextLine(); // Limpiar buffer
                                libras = -1; // Asegura que se repita el bucle
                            }
                        } while (libras < 0);
                        euros = libras / 0.85;
                        System.out.printf("La cantidad de libras en euros es %.2f \n", euros);
                        break;

                    case 3:
                        System.out.println("Nos vemos!");
                        break;

                    default:
                        System.out.println("Opción incorrecta. Por favor, introduce un número entre 1 y 3.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Has introducido un carácter inválido. Inténtalo de nuevo.");
                sc.nextLine(); // Limpiar buffer del scanner
                opcion = -1; // Para que el bucle no termine antes de pedir una opción válida
            }
        } while (opcion != 3);

        sc.close();
    }
}
