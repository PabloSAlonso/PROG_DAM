import java.util.Scanner;
import java.io.PrintWriter;

public class Bol3_Ejer1 {

    /**
     * Muestra de n lineas en pantalla
     * @param n El numero de lineas que se mostrara
     */
    public static void lineasN(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println();
        }
    }
    /**
     * Comprueba si un numero es par o no
     * @param n El numero que se comprueba
     * @return La respuesta de si es par (true) o no (false)
     */
    public static boolean par(int n) {
        if (n % 2 != 0) {
            return false;
        } else {
            return true;
        }
    }
    /**
     * Comprueba si un numero es positivo o negativo
     * @param n numero que comprueba
     * @return la respuesta de si es positivo (P) o negativo (N)
     */
    public static char positivo(int n) {
        return n > 0 ? 'P' : 'N';

    }

    public static void main(String[] args) throws Exception {
        //Apertura
        PrintWriter f= new PrintWriter("Ej1.txt");
        
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime tu nombre:");
        String nombre=sc.nextLine();
        lineasN(10);
        System.out.println("Dime un número");
        int n = sc.nextInt();
        System.out.println("\n"+par(n));
        System.out.println("\n"+positivo(n));
        
        //Escritura archivo
        
        f.println(nombre+"\n");
        f.println(n +"\n");
        f.println(positivo(n));
        f.println(par(n));
        
        //Cierre
        
        f.close();
        sc.close();
        
    }
}

// 1. En el mismo archivo haz las siguientes funciones:
// a) Codifica un método que deje en pantalla n líneas en blanco ( es un parámetro).
// No devuelve nada.
// b) Escribe una función denominada par con un único parámetro entero. Devuelve
// true si el parámetro es número par y false si no lo es. No muestra nada. 
// c) Escribir una función que tenga un argumento (otra forma de llamar a un
// parámetro) de tipo entero y que devuelva la letra ‘P’ (devuelve char) si el número
// es positivo o cero y la letra ‘N’ si es negativo. Intenta hacerlo con el operador
// ternario (ver Apéndice I del Tema 2); si no te sale hazlo con if.
// RAMA: Informática CICLO: DAM
// MÓDULO Programación CURSO
// :
// 1º
// PROTOCOLO: Boletín de ejercicios AVAL: DATA:
// AUTOR Francisco Bellas Aláez (aka Curro)
// d) En el programa principal primero pides el nombre del usuario. A continuación
// dejas deja 10 líneas en blanco mediante la 1ª función. Luego pides un número
// entero al usuario e indicas si es par y positivo o negativo.
// **2. Amplia el programa anterior (directamente el main) para que guarde en un
// archivo los siguientes datos: el nombre en una línea, el número en la siguiente y si
// es par/impar y positivo/negativo.
// El archivo queda algo así:
// Minerva McGonagall 
// -5
// El n.º es impar in negativo.
