import java.util.Scanner;

public class Bol2_Ejer2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce dos números enteros: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        if (num1 > num2) {
            System.out.println("el número mayor es: " + num1);
        } else if (num1 < num2) {
            System.out.println("El número mayor es: " + num2);
        } else {
            System.out.println("Los números son iguales.");

        }
        if (num1 % num2 == 0 ){//|| num2 % num1 == 0)   {
            System.out.println("Los números son múltiplos");

        }
        else if (num2 % num1 == 0) {
            System.out.println("Los números son múltiplos");
        }
        else {
            System.out.println("Los números no son múltiplos");
        }
    }
}
