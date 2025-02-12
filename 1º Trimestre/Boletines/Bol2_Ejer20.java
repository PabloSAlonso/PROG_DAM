import java.util.Scanner;

public class Bol2_Ejer20 {
    //FUNCION (lo va a pedir asi en el examen)
    public static void piramide(int n){
        // Piramide de asteriscos
        for (int i = 1; i <= n; i++) {
            // Los espacios que va a pintar
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // Los asteriscos que va a pintar
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeroAsteriscos;
        String asterisco = "*";
        String space = " ";
        System.out.print("Introduce el numero de filas: ");
        numeroAsteriscos = sc.nextInt();
        for (int i = 1; i <= numeroAsteriscos; i++) {
            for (int x = 1; x <= i; x++) {
                System.out.print(asterisco);
            }
            System.out.println(space);
        }
        System.out.println("\n");
        for (int i = 1; i <= numeroAsteriscos; i++) {
            for (int j = 1; j <= numeroAsteriscos - i; j++) {
                System.out.print(space);
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print(asterisco);
            }
            System.out.println();
        }
        piramide(numeroAsteriscos);
        sc.close();
    }
}