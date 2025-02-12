import java.util.Scanner;

public class Bol2_Ejer16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeroIncognita;
        int numeroIntroducido;
        int contadorIntentos;
        boolean acertado;
        boolean seguirJugando = true;
        String opcionJugar;

        do {
            numeroIntroducido = 0;
            contadorIntentos = 5;
            acertado = false;
            System.out.println("___________________\n");
            System.out.println("Turno del Jugador 1");
            System.out.println("___________________\n");

            do { 
                System.out.print("Introduce el número incógnita del 1 al 100: ");
                numeroIncognita = sc.nextInt();
                if (numeroIncognita < 1 || numeroIncognita > 100) {
                    System.out.println(" Error, el número debe estar entre 1 y 100.");
                }
            } while (numeroIncognita < 1 || numeroIncognita > 100);

            for (int i = 0; i < 50; i++) { 
                System.out.println();
            }
            System.out.println("Turno del Jugador 2 (Tienes 5 intentos)");

            while (contadorIntentos > 0 && !acertado) { // Condiciones para ganar o no el juego.
                System.out.print("Adivina el número:");
                numeroIntroducido = sc.nextInt();
                if (numeroIncognita == numeroIntroducido) {
                    System.out.printf(" ¡Acertaste! ¡Enhorabuena!  El número era el %d! \n", numeroIncognita);
                    acertado = true;
                } else  {
                    if (numeroIntroducido <= 0 || numeroIntroducido > 100) {
                        System.out.println(" Error, el número debe estar entre 1 y 100;");
                    } else {
                        contadorIntentos--;
                        System.out.printf(" ¡Fallaste! Te quedan %d intentos. \n", contadorIntentos);
                        if (numeroIncognita > numeroIntroducido) {
                            System.out.printf(" El numero es MAYOR al que introduciste! \n");
                        } else if (numeroIncognita < numeroIntroducido) {
                            System.out.printf(" El numero es MENOR al que introduciste! \n");
                        }
                        if (contadorIntentos == 0) {
                            System.out.printf("¡Inténtalo de nuevo!\n");
                            System.out.printf("Perdiste te has quedado sin intentos! El número era: %d \n", numeroIncognita);
                        }
                    }
                }
            }
            System.out.print("Quieres seguir jungando (S/N): ");
            sc.nextLine();
            opcionJugar = sc.nextLine().toUpperCase();
            if (opcionJugar.equals("S")){
                seguirJugando = true;
            } else if(opcionJugar.equals("N")){
                seguirJugando = false;
                System.out.println("Gracias por jugar!");
            } else {
                System.out.println(" Introduce un carácter válido!");
                seguirJugando = false;
            }
        } while (seguirJugando);
    }
}
