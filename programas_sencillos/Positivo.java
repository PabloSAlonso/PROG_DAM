import java.util.*;
public class Positivo {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        System.out.println("Introduce un número");
        numero=sc.nextInt();
        if (numero>0) {
            System.out.println("Numero positivo");
            } else {
                if (numero==0) {
                    System.out.println("Numero igual a 0");
                    } else {
                        System.out.println("Numero negativo");
                        } // Fin del if (numero==0)
        }// Fin del if (numero>0)
        System.out.println("Esta línea siempre se ejecuta");
    }
}