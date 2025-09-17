import java.util.Scanner;
public class Bol2_Ejer4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un número entero:");
        int numEntero = sc.nextInt();
        System.out.println("Ahora uno real");
        double numReal = sc.nextDouble();
        System.out.printf("El entero en decimal es %d, en octal es %05o y en hexadecimal es %X" , numEntero, numEntero, numEntero);
        System.out.printf("\nEl real es %7.3f", numReal);
    }
}
