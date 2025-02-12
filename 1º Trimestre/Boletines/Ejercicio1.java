import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {//Con plantilla menu 
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame una cantidad de grados en Celsius:");
        double celsius = sc.nextDouble();
        System.out.println("Pulsa uno para convertir a Fahrenheit, dos para convertir a Kelvin o tres para salir:");
        int opcion = sc.nextInt();
        
        //dependiendo de la opción elegida, hace la conversión correspondiente 
        
        if (opcion == 1) {
            double fahrenheit = (celsius * 9 / 5) + 32;
            System.out.printf("%.2f grados Celsius son %.2f grados Fahrenheit%n", celsius, fahrenheit);
        } else if (opcion == 2) {
            double kelvin = celsius + 273.15;
            System.out.printf("%.2f grados Celsius son %.2f grados Kelvin%n", celsius, kelvin);
        } else if (opcion == 3) {
            System.out.println("Nos vemos!");
        } else {
            System.out.println("Opción incorrecta. Por favor, introduce un número entre 1 y 3.");
        }
        sc.close();
    }
}