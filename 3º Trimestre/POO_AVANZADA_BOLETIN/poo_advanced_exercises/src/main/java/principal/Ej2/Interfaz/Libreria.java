package principal.Ej2.Interfaz;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Libreria {
    public static int pedirEntero() {
        Scanner sc = new Scanner(System.in);
        int cantidad = 0;
        boolean isChecked;
        System.out.println("Introduce un numero entero");
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
