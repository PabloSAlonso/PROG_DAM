package principal.Ej2.Interfaz;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Libreria {
    public static void pedirEntero(String mensaje, int minimo, int maximo) {
        Scanner sc = new Scanner(System.in);
        System.out.println(mensaje);
        int cantidad = 0;
        boolean isChecked;
        if (mensaje == null || maximo - minimo < 2 || minimo > maximo || mensaje.equals("")) { //minimo > maximo es innecesario porque maximo - minimo < 2 ya lo comprueba
            sc.close();
            throw new IllegalArgumentException("Parametros incorrectos");
        } else {
            System.out.println("Introduce un numero entero");
            do {
                isChecked = true;
                try {
                    cantidad = sc.nextInt();
                    while (cantidad < minimo || cantidad > maximo) {
                        System.out.println("Introduce un valor dentro del rango");
                        cantidad = sc.nextInt();
                    }
                } catch (InputMismatchException m) {
                    System.out.println("Introduce un caracter valido");
                    sc.nextLine();
                    isChecked = false;
                }
            } while (!isChecked);
            System.out.println("Listo, numero guardado correctamente: " + cantidad);
        }
        sc.close();
    }

    public static void pedirReal(String mensaje, double minimo, double maximo) {
        Scanner sc = new Scanner(System.in);
        System.out.println(mensaje);
        double cantidad = 0;
        boolean isChecked;
        if (mensaje == null || maximo - minimo < 2 || minimo > maximo || mensaje.equals("")) { //minimo > maximo es innecesario porque maximo - minimo < 2 ya lo comprueba
            sc.close();
            throw new IllegalArgumentException("Parametros incorrectos");
        } else {
            System.out.println("Introduce un numero entero");
            do {
                isChecked = true;
                try {
                    cantidad = sc.nextDouble();
                    while (cantidad < minimo || cantidad > maximo) {
                        System.out.println("Introduce un valor dentro del rango");
                        cantidad = sc.nextDouble();
                    }
                } catch (InputMismatchException m) {
                    System.out.println("Introduce un caracter valido");
                    sc.nextLine();
                    isChecked = false;
                }
            } while (!isChecked);
            System.out.println("Listo, numero guardado correctamente: " + cantidad);
        }
        sc.close();
    }
    

}
