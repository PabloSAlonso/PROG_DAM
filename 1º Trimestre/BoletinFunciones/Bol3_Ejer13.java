import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class Bol3_Ejer13 {
    /**
     * Genera un número del 1 al numero de caras indicado por el usuario
     * @param numeroCarasDado Numero de caras del dado
     * @return un numero aleatorio entre 1 y el numero máximo de caras
     */
    public static double tirarDado(int numeroCarasDado) {
        double randomNumber = Math.random() * numeroCarasDado + 1;
        return randomNumber;
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String userName;
        int numeroCarasDado;
        int volverJugar = 1;
        int contadorNumerosAcertados = 0;
        int n1, n2, n3;
        double dado1, dado2;
        System.out.print("\nIntroduce tu nombre: ");
        userName = sc.nextLine();
        do {
            do {
                System.out.print("Introduce el número de caras del dado: ");
                numeroCarasDado = sc.nextInt();
            } while (numeroCarasDado < 1 || numeroCarasDado > 20);
            dado1 = (int) tirarDado(numeroCarasDado);
            dado2 = (int) tirarDado(numeroCarasDado);
            while (dado1 == dado2) {
                dado2 = (int) tirarDado(numeroCarasDado);
            }
            System.out.println("Tienes 3 intentos para adivinar\nIntroduce 3 numeros");
            n1 = sc.nextInt();
            n2 = sc.nextInt();
            n3 = sc.nextInt();
            do {
                do {
                    // if (n1 == n2 || n1 == n3) {
                    // do {
                    // System.out.println("No repitas número");
                    // n1 = sc.nextInt();
                    // } while (n1 == n2 || n1 == n3);
                    // }
                    if (n2 == n1 || n2 == n3) {
                        do {
                            System.out.println("El 2º valor ha sido introducido anteriormente, cambialo:");
                            n2 = sc.nextInt();
                        } while (n1 == n2 || n2 == n3);
                    }
                    if (n3 == n1 || n3 == n2) {
                        do {
                            System.out.println("El tercer valor ha sido introducido anteriormente, cambialo:");
                            n3 = sc.nextInt();
                        } while (n1 == n2 || n2 == n3 || n3 == n1);
                    }
                } while (n1 == n2 || n1 == n3 || n2 == n3);
            } while ((n1 > numeroCarasDado) || (n1 < 1) || (n2 > numeroCarasDado) || (n2 < 1) || (n3 > numeroCarasDado)
                    || (n3 < 1));
            if (n1 == dado1 || n1 == dado2 || n2 == dado1 || n2 == dado2 || n3 == dado1 || n3 == dado2) {
                contadorNumerosAcertados++;
            }

            System.out.printf("%s has acertado %d números \n", userName, contadorNumerosAcertados);
            System.out.println("los numeros eran " + dado1 + " y " + dado2);
            PrintWriter fwriter = new PrintWriter(new FileWriter("BoletinFunciones/Ej13.txt", true));
            fwriter.printf("\nNombre: %s,  Numero Caras Dado: %d, Numero Aciertos: %d\n", userName, numeroCarasDado,
                    contadorNumerosAcertados);
            fwriter.close();
            System.out.println("Quieres volver a jugar? (1/2)");
            volverJugar = sc.nextInt();
            while (volverJugar != 1 && volverJugar != 2){
                System.out.println("Introduce un carácter válido!");
                volverJugar = sc.nextInt();
            }

        } while (volverJugar == 1);
        Scanner fileScanner = new Scanner(new java.io.File("BoletinFunciones/Ej13.txt"));
        System.out.println("Contenido del archivo de récords");
        while (fileScanner.hasNextLine()) {
            String line = fileScanner.nextLine();
            System.out.println(line);
        }
        fileScanner.close();
        sc.close();
    }
}
//
/*
 * Dados d20. Realizar un programa que pida al usuario su nombre y 3
 * números distintos al usuario entre 1 y 20 (usar 3 variables) y luego que el
 * ordenador “tira” dos dados de 20 caras. Si el segundo dado sale repetido,
 * debe
 * volver a tirarse hasta que salga distinto.
 * Debe indicar los aciertos que ha tenido el usuario. Evita repetir código
 * haciendo
 * funciones. El usuario debe poder repetir el juego al finalizar.
 * b) Modifica el programa anterior para que el usuario pueda elegir la cantidad
 * de
 * caras de los dados antes de jugar.
 * Además en un archivo de récords debe añadirse en una nueva línea el nombre de
 * usuario, el número de caras del dado ocupando 4 posiciones y los aciertos
 * ocupando 4 posiciones (debes guardar usando printf todo en una nueva línea).
 * Cuando el usuario decida finalizar, antes de terminar el programa se mostrará
 * el
 * archivo de récords entero.
 */