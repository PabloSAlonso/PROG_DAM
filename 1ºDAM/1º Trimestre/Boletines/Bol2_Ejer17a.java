import java.util.Scanner;
public class Bol2_Ejer17a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Este program muestra los multiplos de 5 entre 1 y 100");
        int n = 5;
        do {
            System.out.println(n);
            n += 5; // Incrementamos n en 5 cada vez

        }
        while (n <= 100);
        sc.close();
    }
}
