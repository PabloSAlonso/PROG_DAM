import java.util.Scanner;

public class Bol2_Ejer15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("Introduce un número según desees:");
            System.out.println("1. Pasar de euros a libras");
            System.out.println("2. Pasar de libras a euros");
            System.out.println("3. Salir");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Introduce la cantidad de euros:");

                    double euros = sc.nextDouble();
                    while (euros < 0) {
                        System.out.println(
                                "No se puede introducir un número negativo. Introduce un número de euros válido:");
                        euros = sc.nextDouble();

                    }
                    double libras = euros * 0.85;
                    System.out.printf("La cantidad de euros en libras es %.2f", libras);

                    break;

                case 2:
                    System.out.println("Introduce la cantidad de libras:");

                    double librasCalc = sc.nextDouble();
                    while (librasCalc < 0) {
                        System.out.println(
                                "No se puede introducir un número negativo. Introduce un número de libras válido:");
                        librasCalc = sc.nextDouble();

                    }
                    double eurosCalc = librasCalc / 0.85;
                    System.out.printf("La cantidad de libras en euros es %.2f", eurosCalc);

                    break;

                case 3:
                    System.out.println("Nos vemos!");

                    break;

                default:
                    System.out.println("Opción incorrecta. Por favor, introduce un número entre 1 y 3.");
            }

        } while (opcion != 3);
    }
}
