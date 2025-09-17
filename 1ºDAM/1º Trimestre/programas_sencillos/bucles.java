import java.util.Scanner;

public class bucles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 int opcion;
 do {
    System.out.println("Menú de opciones");
    System.out.println("----------------");
    System.out.println("1.- Suma.");
    System.out.println("2.- Resta.");
    System.out.println("3.- Multiplicación.");
    System.out.println("4.- División.");
    System.out.println("5.- Salir del menú\n\n");
    System.out.println("Teclee opción (1-5)");
    opcion = sc.nextInt();
    switch (opcion) {
        case 1: // Algoritmo de suma
        break;
        case 2: // Algoritmo de resta
        break;
        case 3: // Algoritmo de multiplicación
        break;
        case 4: // Algoritmo de división
        break;
        case 5: // Salir del menú
        System.out.println("Hasta otra!");
        break;
        default:
        System.out.println("Opción no válida.");
        break;
        }
        } while (opcion != 5);

}
}
