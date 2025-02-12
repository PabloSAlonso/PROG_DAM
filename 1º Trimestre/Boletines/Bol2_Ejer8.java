import java.util.Scanner;
public class Bol2_Ejer8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce tres numeros para decir el mayor:");
        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();
        double num3 = sc.nextDouble();
        double max;
        if (num1 < num2 && num2 <= num3) {
            max= num3;
        }
        else if (num1   <= num2) {
            max = num2;
        }
        else {
            max = num1;
        }
        
        //
        System.out.println("El número mayor es: " + max);
    }
}
