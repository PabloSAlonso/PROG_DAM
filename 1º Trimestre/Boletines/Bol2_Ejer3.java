import java.util.Scanner;

public class Bol2_Ejer3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número:");
        int num = sc.nextInt();
        int sumatorio = 0;
        int i=1;
        if (num>0){
            while (i<=num) {
                sumatorio += i;
                i++;
            }
            System.out.println(sumatorio);
        }
            
        // else {
        //     System.out.println("");
        // }
    }
}
