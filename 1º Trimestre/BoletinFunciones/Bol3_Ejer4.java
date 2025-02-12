import java.util.Scanner;

public class Bol3_Ejer4 {

    /**
     * Comprueba si un año es bisiesto
     * 
     * @param año el año que se quiere comprobar
     * @return (true) si es bisiesto, (false) en caso contrario
     */
    public static boolean bisiesto(int año) {
        if (año % 4 == 0) {
            if (año % 100 == 0) {
                return año % 400 == 0;
            }
            return true; // Es divisible por 4 pero no por 100
        }
        return false; // No es bisiesto si es divisible por 4
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int año;
        do {
            System.out.println("Programa que comprueba si un año es bisiesto");
            año = sc.nextInt();
            if (año != 0) {
            if (bisiesto(año)) {
                System.out.println("El año " + año + " es bisiesto");

            } else {
                System.out.println("El año " + año + " no es bisiesto");
            }
        }
        } while (año != 0);
        System.out.println("Saliendo del programa");
        sc.close();
    }
}
// 4. a) Función año bisiesto. Realizar una función denominada bisiesto a la cual se le
// pasa un año como parámetro y devuelve true si dicho año es bisiesto y false en
// caso contrario.
// Un año es bisiesto cuando:
// • Es múltiplo de 4 (P. ej 1984)
// • Pero los múltiplos de 100 no lo son (Por ejemplo 1800) 
// • Salvo si a su vez son múltiplos de 400 que caso sí lo son (p. ej. 2000)
// b) En el programa principal se hará un bucle que pida continuamente años al
// usuario hasta que introduzca el año 0 momento en el cual el programa termina. Por
// cada año introducido debe indicar si es o no bisiesto utilizando la función previa
