import java.util.Scanner;

public class Bol2_Ejer6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("Elige una opción:");
            System.out.println("1.Cuadrado de un número real ");
            System.out.println("2. Inverso de un número, no se admite el 0 ");
            System.out.println("3. Raíz cuadrada de un número ");
            System.out.println("4. Operacion AND entre dos enteros ");
            System.out.println("5. Operación OR entre dos enteros ");
            System.out.println("6. Salir");
            opcion = sc.nextInt();

            // introduce múltiples opciones para elegir e introduce las variables cuando
            // eliges la opcion
            switch (opcion) {// printf decimales
                case 1:
                    System.out.println("Dame un numero real: ");
                    double num = sc.nextDouble();
                    double cuadrado = num * num;
                    System.out.printf("El cuadrado de tu número es %.2f", cuadrado);
                    break;
                case 2:// Bucle de comprobación
                    System.out.println("Dame un numero real: ");
                    double numDouble = sc.nextDouble();

                    while (numDouble == 0) { // Mientras que el número sea 0 no hará la cuenta por lo que no hace falta hacer un if.
                        System.out.println("No se puede calcular el inverso de 0. Introduce un número distinto de 0.");
                        numDouble = sc.nextDouble();
                    }

                    System.out.printf("El inverso de tu numero es %.4f", (1 / numDouble));

                    break;
                case 3:// Bucle de comprobación
                    System.out.println("Dame un numero positivo entero");
                    int numInt2 = sc.nextInt();

                    while (numInt2 < 0) {
                        System.out.println("No se puede calcular la raíz cuadrada de un número negativo.");
                        numInt2 = sc.nextInt();
                    }

                    System.out.printf("La raíz cuadrada de tu numero es %.3d", Math.sqrt(numInt2));

                    break;
                case 4:
                    System.out.println("Introduce dos números enteros:");
                    int num1 = sc.nextInt();
                    int num2 = sc.nextInt();
                    System.out.printf("El AND entre %x y %x es: %x", num1, num2, num1 & num2);
                    break;
                case 5:
                    System.out.println("Introduce dos números enteros:");
                    int num3 = sc.nextInt();
                    int num4 = sc.nextInt();
                    System.out.printf("El OR entre %x y %x es: %x", num3, num4, num3 | num4);
                    break;
                case 6:
                    System.out.println("Salir!");
                    break;
                default:
                    System.out.println("Opción incorrecta. Por favor, introduce un número entre 1 y 6.");

            }
        } while (opcion != 6);
    }

}
