import java.util.Scanner;
import java.io.PrintWriter;
import java.io.File;

public class Bol3_Ejer8 {
    /**
     * Funcion que a partir de un numero determinado devuelve true en caso de que sea primo y false en caso de que no lo sea
     * @param n el numero a partir del cual se hace la comprobacion
     * @return true si es primo o false si no lo es
     */
    public static boolean Primo(int n) {
        if (n <= 1) {
            return false;
        }
        if (n == 2 || n == 3 || n ==5 || n ==7 ) {
            return true;
        }
        if (n % 2 == 0 || n % 3 == 0 || n % 5 == 0 || n % 7 == 0) {
            return false;
        } 
        else {
            return true;
        }
    }
    // Forma mas corta y optima que el IF abajo (No cuadraría con los comentarios de la funcion)
        // for (int i = 2; i < n; i++) {
        //     if (n % i == 0) {
        //         return false;
        //     }
        // }
        // return true; 
    

    public static void main(String[] args) throws Exception {
        System.out.println("Dime un numero mayor que 2");
        Scanner sc = new Scanner(System.in);
        int num;
        int opcion;
        System.out.println("\nElige una opción");
        do {
            System.out.println("1.- Mostrar primos menores que uno dado");
            System.out.println("2.- Primos en archivo");
            System.out.println("3.- Archivo con primos");
            System.out.println("4.- Salir");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                // Código opcion 1
                System.out.println("Dame un número para enseñar todos los primos menores que el");
                num = sc.nextInt();
                while (num < 1) {
                    System.out.println("Dime un numero mayor que 1");
                    num = sc.nextInt();
                }
                // Apertura
                PrintWriter f = new PrintWriter("BoletinFunciones/Ej8.txt");
                // Escritura
                    for (int i = num; i > 1; i--) {
                        if (Primo(i)) {
                            System.out.print(i + "\n");
                            f.print(i + " \n");
                        }
                    }
                    //Cierre
                    f.close();
                    break;
                case 2:
                // Apertura del archivo Ej9.txt en modo escritura y escritura de los numeros del 2 al 100
                    PrintWriter w = new PrintWriter("BoletinFunciones/Ej9.txt");
                    // Código opcion 2
                    //Escritura
                    System.out.println("Esta opción lee los numeros del archivo y dice si son primos o no");
                    for (int i = 2; i <= 100; i++) {
                        w.print(i + "\n");
                    }
                    //Cierre
                    w.close();
                    //Apertura del Archivo en modo lectura y lectura de los numeros anteriormente escritos para comprobar si son primos o no
                    Scanner l = new Scanner(new File("BoletinFunciones/Ej9.txt"));
                        int n;
                        //Lectura
                        while (l.hasNextInt()) {
                            n = l.nextInt();
                            if (Primo(n)) {
                                System.out.println(n + " es primo");
                            } else {
                                System.out.println(n + " no es primo");
                            }
                        }
                        //Cierre
                    l.close();
                    break;
                case 3:
                // Apertura del archivo Ej8.txt en modo escritura y escritura de los numeros primos
                    PrintWriter p = new PrintWriter("Ej8.txt");
                    // Código opcion 3
                    System.out.println("Introduce el numero tope hasta el que quieres calcular los primos");
                    System.out.println("Dame un número");
                    num = sc.nextInt();
                    while (num < 2) {
                        System.out.println("Dime un numero mayor que 2");
                        num = sc.nextInt();
                    }
                    //Escritura
                    for (int i = 2; i <= num; i++) {
                        if (Primo(i)) {
                            p.print(i + ";");
                        }
                    }
                    //Cierre
                    p.close();
                    break;
                case 4:
                    // Código opcion 4
                    System.out.println("Hasta otra!");

                    break;
                default:
                    System.out.println("Opcion no valida");
            }
        } while (opcion != 4);
        // Cierre
        sc.close();

    }
}
// 8. a) Escribir una función que se le pase un número y que devuelva true o false
// dependiendo de si dicho número es o no es primo. 
// b) Para probarla haz un programa principal que pida un n.º mayor que 2 al usuario
// y muestra los números primos menores que dicho número.
// Nota: Un número es primo si y sólo si es divisible únicamente por 1 y por él mismo.
// Por tanto para saber si un número es primo se debe dividir por todos los números
// menores que él y mayores que 1, y si alguna de esas divisiones exacta entonces el
// número NO es primo. Existen métodos de optimizar lo anterior, piensa a ver si se te
// ocurre alguno. El 1 actualmente no se considera primo.
// **9. Modifica el ejercicio anterior de los números primos (solo el main) de forma
// que hagas un menú clásico con estas opciones:
// 1. Mostrar primos menores que uno dado: Esto es lo que ya estaba del
// ejercicio previo.
// 2. Primos en archivo: Pide el nombre de un archivo que debe contener
// números, cada uno en una línea. Lee dicho archivo y muestra dichos números
// en pantalla diciendo si son o no primos.
// 3. Archivo con primos: Similar a 1, se le pide un número mayor que 2 al
// usuario y guarda en un archivo todos los primos desde 2 hasta el que meta el
// usuario. Estarán todos en la misma línea separados por punto y coma (;).
// 4 Salir: El programa solo finaliza si se selecciona esta opción. 