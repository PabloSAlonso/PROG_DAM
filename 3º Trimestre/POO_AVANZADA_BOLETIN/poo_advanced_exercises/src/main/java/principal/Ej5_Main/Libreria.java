package principal.Ej5_Main;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Libreria {
    public static int pedirEntero() {
        Scanner sc = new Scanner(System.in);
        int cantidad = 0;
        boolean isChecked;
        System.out.println("Introduce un numero entero entre 1 y 5");
        do {
            isChecked = true;
            try {
                cantidad = sc.nextInt();
            } catch (InputMismatchException m) {
                System.out.println("Introduce un caracter valido");
                sc.nextLine();
                isChecked = false;
            }
        } while (!isChecked);
        if (cantidad < 1 || cantidad > 5) {
            System.out.println("Fuera de rango");
            cantidad = 0;
        }
        return cantidad;
    }
    public static int pedirEntero(int limite) {
        Scanner sc = new Scanner(System.in);
        int cantidad = 0;
        boolean isChecked;
        System.out.println("Introduce un numero entero entre 1 y 5");
        do {
            isChecked = true;
            try {
                cantidad = sc.nextInt();
            } catch (InputMismatchException m) {
                System.out.println("Introduce un caracter valido");
                sc.nextLine();
                isChecked = false;
            }
        } while (!isChecked);
        while (cantidad < 1 || cantidad > limite) {
            System.out.println("Fuera de rango, mete numero entre 1 y " + limite);
            cantidad = sc.nextInt();
        }
        return cantidad;
    }

    public static double pedirReal() {
        Scanner sc = new Scanner(System.in);
        double cantidad = 0;
        boolean isChecked;
        System.out.println("Introduce un numero entero");
        do {
            isChecked = true;
            try {
                cantidad = sc.nextDouble();
            } catch (InputMismatchException m) {
                System.out.println("Introduce un caracter valido");
                sc.nextLine();
                isChecked = false;
            }
        } while (!isChecked);
        System.out.println("Listo, numero guardado correctamente: " + cantidad);
        return cantidad;
    }

}
