package exception.ejercicio3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ejercicio3 {
    public static void pedirRobusto(String mensaje, int minimo, int maximo) {
        Scanner sc = new Scanner(System.in);
        System.out.println(mensaje);
        int cantidad = 0;
        boolean isChecked;
        if (mensaje == null || maximo - minimo < 2 || minimo > maximo || mensaje.equals("")) { // minimo > maximo es
                                                                                               // innecesario porque
                                                                                               // maximo - minimo < 2 ya
                                                                                               // lo comprueba
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
            } while (!isChecked);// TODO boolean
            System.out.println("Listo, numero guardado correctamente: " + cantidad);
        }
        sc.close();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int minimo;
        do {
            try {
                System.out.println("Introduce el mensaje inicial");
                String mensaje = sc.nextLine();
                System.out.println("Introduce el valor minimo del rango");
                minimo = sc.nextInt();
                System.out.println("Introduce el valor maximo del rango");
                int maximo = sc.nextInt();
                System.out.println("Peticion Iniciada correctamente:");
                System.err.print("Mensaje inicial: ");
                pedirRobusto(mensaje, minimo, maximo);
            } catch (IllegalArgumentException i) {
                System.out.println("Parametro no válido");
                minimo = 0;
            } catch (InputMismatchException e) {
                System.out.println("Parametro no válido");
                minimo = 0;
            }
        } while (minimo == 0);
        sc.close();
    }
}
