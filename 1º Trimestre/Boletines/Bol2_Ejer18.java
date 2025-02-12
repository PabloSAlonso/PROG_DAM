import java.util.Scanner;

public class Bol2_Ejer18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número para calcular su factorial");
        double contador = 1;
        for (double i = sc.nextDouble(); i > 1; i--) {
            contador = contador * i;
        }
        System.out.println(contador);

        System.out.println("introduce otro");
        double a = sc.nextDouble();
        contador = 1;
        double factorial = 1;
        do{
            factorial = factorial * contador;
            contador++;
        } while (contador <= a);
        System.out.println(factorial);

        System.out.println("introduce otro");
        double b = sc.nextDouble();
        contador = 1;

        while (b > 1) {
            contador = contador * b;
            b--;
        }
        System.out.println(contador);

    }
}
