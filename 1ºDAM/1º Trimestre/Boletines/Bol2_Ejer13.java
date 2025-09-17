import java.util.Scanner;
public class Bol2_Ejer13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número entero positivo:  ");
        int n = sc.nextInt();
        int suma = 0;
        for (int i = 0; i < n; i=i + 2) {
            suma = suma + i;
        } 
        System.out.println("suma de los pares entre 0 y tu num es " + suma);
        
        System.out.println("Introduce otro: ");
        int m = sc.nextInt();
        int sumaDos = 0;
        for (int a = 1; a < m; a=a + 2) {
            sumaDos = sumaDos + a;
        }
        System.out.println("suma de los impares entre 0 y tu num es " + sumaDos);

        System.out.println("Introduce un último numero: ");
        int p = sc.nextInt();
        int sumaPAR = 0;
        int sumaImpar = 0;
        for (int b=0; b <= p; b++) {
            if (b % 2 == 0) {
                sumaPAR = sumaPAR + b;
            } else {
                sumaImpar = sumaImpar + b;
            }
        }
        System.out.printf("Suma de los pares: %d, Suma de los impares: %d", sumaPAR, sumaImpar);

    }
    
}
