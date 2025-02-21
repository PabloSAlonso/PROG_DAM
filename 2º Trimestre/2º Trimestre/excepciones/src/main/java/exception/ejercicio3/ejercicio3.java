package exception.ejercicio3;
import java.util.Scanner;
public class ejercicio3 {
    public static void pedirRobusto(String mensaje, int minimo, int maximo){
        Scanner sc = new Scanner(System.in);
        System.out.println(mensaje);
        int cantidad;
        if (mensaje == "" || mensaje == null || maximo - minimo < 2 || minimo > maximo){
            throw new IllegalArgumentException("Parametros incorrectos");
        } else {
            System.out.println("Introduce un numero entero");
            cantidad = sc.nextInt();
            while (cantidad < minimo || cantidad > maximo) {
                System.out.println("Introduce un valor dentro del rango");
                cantidad = sc.nextInt();
            }
        }
        sc.close();
    }
    public static void main(String[] args) {
        try{
            pedirRobusto("Holaaa", 2, 5);
            pedirRobusto(null, 1, 5);
        } catch (IllegalArgumentException i)  {
            System.out.println("Parametro no válido");
        } try {
            pedirRobusto("Hola", 1, 2);
        } catch (IllegalArgumentException i)  {
            System.out.println("Parametro no válido");
        } try {
            pedirRobusto("Holaa", 5, 2);
        } catch (IllegalArgumentException i)  {
            System.out.println("Parametro no válido");
        }
    }
}
