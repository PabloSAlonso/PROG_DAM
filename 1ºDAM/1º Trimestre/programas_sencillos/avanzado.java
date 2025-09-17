import java.util.Scanner;

public class avanzado {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un numero real");
        double num1;
        num1 = sc.nextDouble();
        System.out.println("Dime otro numero real");
        double num2;
        num2 = sc.nextDouble();
        double division;
        division = (num1 / num2);
        if (num2 == 0) {
            System.out.println("Divisor no valido");

        } else {
            System.out.println("La division es " + division);
        }
        if (num1 > num2) {
            System.out.println(" \nEl numero mas grande es el primero");
        } else {
            System.out.print("El numero mas grande es el segundo");
        }

    }
}