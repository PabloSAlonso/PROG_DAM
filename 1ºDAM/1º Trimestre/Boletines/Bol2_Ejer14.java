import java.util.Scanner;

public class Bol2_Ejer14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out
                .println("Introduce una series de números para contar cuantos de ellos son negativos (0 para acabar):");
        int num = sc.nextInt();
        int contador = 0;
        int negativos = 0;
        while (num != 0) {
            if (num < 0) {
                negativos = negativos + 1;
            }
            contador = contador + 1;
            System.out.println("Otro num o 0 para acabar:");
            num = sc.nextInt();
            
        }

        System.out.printf("Hay %d números en total, de los cuales %d son negativos.", contador, negativos);
    }
}
