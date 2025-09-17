import java.util.Scanner;
public class Suma {
public static void main(String args[]) {
    System.out.println("Dime un numero");
    Scanner sc = new Scanner(System.in);
    int num1;
    num1 = sc.nextInt();
    System.out.println("Ahora dime otro");
    int num2;
    num2 = sc.nextInt();
    int num3;
    num3 = (num1 + num2);
    System.out.println("Tu numero es el " + num3);
    }
}