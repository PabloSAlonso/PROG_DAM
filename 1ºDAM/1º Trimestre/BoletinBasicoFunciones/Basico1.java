import java.util.Scanner;
public class Basico1 {

    public static void saludo() {
        System.out.println("HOLA");

    }

    public static void saludo10() {
        for (int i = 0; i < 10; i++) {
            System.out.println("HOLA");
        }
    }

    public static void variosSaludos(int n) {

        for (int i = 0; i < n; i++) {
            System.out.println("HOLA");
        }
    }

    public static void pintaMensaje(String msg){
        System.out.println(msg);
    }
    public static void pintaMensaje10(String msg){
        for (int i = 0; i < 10; i++) {
            System.out.println(msg);
        }
    }
    public static void pintaVariosMensajes(String msg, int n){
        for (int i = 0; i < n; i++) {
            System.out.println(msg);
        }
    }
    public static int suma20(){
        int suma = 0;
        for (int i = 0; i <= 20; i++) {
            suma += i;
        }
        return suma;
    }
    public static int sumaN(int n){
        int suma = 0;
        for (int i = 0; i <= n; i++) {
            suma += i;
        }
        return suma;
    }
    public static int pideNumero(String msg){
        Scanner sc = new Scanner(System.in);
        System.out.println(msg);
        int n = sc.nextInt();
        return n;
    }
    public static void main(String[] args) {
        saludo();
        saludo10();
        variosSaludos(5);
        variosSaludos(2);
        pintaMensaje("Adios");
        pintaMensaje10("Adios");
        pintaVariosMensajes("Adios", 5);
        System.out.println(suma20());
        System.out.println(sumaN(5));
        int n = (pideNumero("Dime un numero y te dire el doble"));
        System.out.println("El doble de " + n + " es: " + (n*2));
    }

}