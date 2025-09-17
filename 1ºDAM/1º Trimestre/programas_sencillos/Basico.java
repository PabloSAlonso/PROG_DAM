import java.util.Scanner;
public class Basico {
    public static void main (String[] args){
        System.out.println("Bienvenidos a mi super programa v1.0");
        System.out.println("Ahora unas preguntas");
        String nombre;
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime tu nombre");
        nombre = sc.nextLine();
        System.out.println("Dime tu direccion");
        String direccion;
        direccion = sc.nextLine();
        System.out.println("Dime tu edad");
        int edad;
        edad = sc.nextInt();
        System.out.println("Te llamas " + nombre + ", vives en " + direccion + " y tienes " + edad + " años");
    }
}