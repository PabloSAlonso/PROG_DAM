package exception.ejercicio2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {// TODO controlar entrada de datos
        Scanner sc = new Scanner(System.in);
        try {
            Geometria g = new Geometria(true, 15, 5);
            Geometria g2 = new Geometria();
            System.out.println("Introduce la altura del triángulo");
            g2.setAltura(sc.nextDouble());
            System.out.println("-----------------------------------------");
            System.out.println("Ahora la base");
            g2.setBase(sc.nextDouble());
            System.out.println("-----------------------------------------");
            System.out.printf("Tengo un %s de base %f y altura %f con base %f y perímetro %f", g.tipo(), g.getBase(),g.getAltura(), g.getBase(), g.perimetro());//
            System.out.println("\n-----------------------------------------");
            System.out.printf("Tengo un %s de base %f y altura %f con base %f y perímetro %f", g2.tipo(), g2.getBase(),g2.getAltura(), g2.getBase(), g2.perimetro());
        } catch (IllegalArgumentException e) {
            System.out.println("Has introducido valores negativos");
            sc.nextLine();
        } catch (InputMismatchException i) {
            System.out.println("Has introducido caracteres no validos");
            sc.nextLine();
        }
        sc.close();
    }
}
