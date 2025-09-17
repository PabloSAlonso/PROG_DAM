package principal.Ej5_Main;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Libreria {
    public static String pedirString(String cadena) {
        Scanner sc = new Scanner(System.in);
        String cadenaFinal = "";
        while (cadena == "" || cadena == null) {
            System.out.println("Introduce una cadena válida");
            cadena = sc.nextLine().trim();
        }
        for (int i = 0; i < cadena.length(); i++) {
                cadenaFinal += cadena.charAt(i);
        }
        return cadenaFinal;
    }

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
                System.out.println("Caracter no válido");
                sc.nextLine();
                isChecked = false;
            }
        } while (!isChecked);
        // while (cantidad < 0 || cantidad > 5) {
        //     System.out.println("Introduce un numero entero");
        //     try {
        //         cantidad = sc.nextInt();
        //     } catch (InputMismatchException m) {
        //         System.out.println("Caracter no válido");
        //         sc.nextLine();
        //         isChecked = false;
        //     }
        // }
        return cantidad;
    }

    public static int pedirEntero(int minimo, int maximo) {
        Scanner sc = new Scanner(System.in);
        int cantidad = 0;
        boolean isChecked;
        System.out.println("Introduce un numero entero entre " + minimo + " y " + maximo);
        do {
            isChecked = true;
            try {
                cantidad = sc.nextInt();
            } catch (InputMismatchException m) {
                System.out.println("Caracter no válido");
                sc.nextLine();
                isChecked = false;
            }
        } while (!isChecked);
        while (cantidad < minimo || cantidad > maximo) {
            System.out.println("Introduce un numero entero entre " + minimo + " y " + maximo);
            try {
                cantidad = sc.nextInt();
            } catch (InputMismatchException m) {
                System.out.println("Caracter no válido");
                sc.nextLine();
                isChecked = false;
            }
        }
        return cantidad;
    }

    public static double pedirReal() {
        Scanner sc = new Scanner(System.in);
        double cantidad = 0;
        boolean isChecked;
        System.out.println("Introduce un numero real");
        do {
            isChecked = true;
            try {
                cantidad = sc.nextDouble();
            } catch (InputMismatchException m) {
                System.out.println("Caracter no válido");
                sc.nextLine();
                isChecked = false;
            }
        } while (!isChecked);
        System.out.println("Listo, numero guardado correctamente: " + cantidad);
        return cantidad;
    }

}
