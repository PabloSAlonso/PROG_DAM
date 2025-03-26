package libreriaPedirRobusto;

import java.util.InputMismatchException;
import java.util.Scanner;

public class entero {
    public static void pedirRobusto(String mensaje, int minimo, int maximo) {
        Scanner sc = new Scanner(System.in);
        System.out.println(mensaje);
        int cantidad;
        if (maximo - minimo < 2 || minimo > maximo || mensaje == "" || mensaje == null) {
            throw new IllegalArgumentException("Parametros incorrectos");
        } else {
            System.out.println("Introduce un numero entero");
            do {
                try {
                    cantidad = sc.nextInt();
                    while (cantidad < minimo || cantidad > maximo) {
                        System.out.println("Introduce un valor dentro del rango");
                        cantidad = sc.nextInt();
                    }
                } catch (InputMismatchException m) {
                    System.out.println("Introduce un caracter valido");
                    sc.nextLine();
                    cantidad = 0;
                }
            } while (cantidad == 0);
        }
        sc.close();
    }

    public static void main(String[] args) {
        try {
            System.out.println("Primer caso");
            pedirRobusto("Holaaa", 2, 100);
        } catch (IllegalArgumentException i) {
            System.out.println("Parametro no válido");
        }
        try {
            System.out.println("Segundo caso");
            pedirRobusto("Hola", 1, 2);
        } catch (IllegalArgumentException i) {
            System.out.println("Parametro no válido");
        }
        try {
            System.out.println("Tercer caso");
            pedirRobusto("Holaa", 5, 2);
        } catch (IllegalArgumentException i) {
            System.out.println("Parametro no válido");
        }
        try {
            System.out.println("Cuarto caso");
            pedirRobusto(null, 1, 5);
        } catch (IllegalArgumentException i) {
            System.out.println("Parametro no válido");
        }
    }
}
