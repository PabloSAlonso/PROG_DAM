import java.util.Scanner;
public class Bol2_Ejer11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int contador = 0;
        int sumatorio = 0;
        int num = 0;
        while (sumatorio < 10000) {
            num+=1;
            sumatorio = num;
            contador++;
            
        }
        System.out.println("La suma de los primeros " + contador + " números es: " + sumatorio);    
    }
}
