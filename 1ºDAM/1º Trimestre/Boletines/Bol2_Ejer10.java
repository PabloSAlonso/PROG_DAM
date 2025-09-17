import java.util.Scanner;
public class Bol2_Ejer10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce dos números enteros:");
        int num1 = sc.nextInt(); //mete los dos números
        int num2 = sc.nextInt();
        System.out.println("Tus números son: " + num1 + " y " + num2); //dice cuales son
        int temporal = num1;
        num1 = num2;    //mete en una nueva variable el valor de num1 e iguala el num1 al num2 y el num2 a esta nueva variable
        num2 = temporal;
        System.out.println("Los números invertidos son: " + num1 + " y " + num2);
        
  }
}