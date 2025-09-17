import java.util.Scanner;
public class Bol2_Ejer9 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Cuantos números quieres introducir?");
    int n = sc.nextInt();
    System.out.println("Introduce " + n + " números enteros:");
    int max = sc.nextInt(); //El máximo al principio será el primer num introducido
    int num=0;
    for (int i=1; i<n; i++) {
        num=sc.nextInt();
        if (num>max) {
            max=num;
        }
     } System.out.println("El número máximo es: " + max);
    }
}
