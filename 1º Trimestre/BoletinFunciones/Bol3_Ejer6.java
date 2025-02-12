import java.util.Scanner;

public class Bol3_Ejer6 {

    /**
     * Calcula la potencia con la base (b) y el exponente (e) viendo si el exponente es positivo negativo o 0.
     * @param b parametro de la base
     * @param e parametro del exponente
     * @return devuelve el resultado de la potencia
     */
    public static double potencia(double b, int e) {
        double resultado = 1;
        int exp = Math.abs(e);

        for (int i = 0; i < exp; i++) {
            resultado *= b;
        }
        if (e < 0) {
            resultado = 1 / resultado;
        }
        return resultado;

    }
    /**
     * Muestra las potencias de la base con el exponente dado hasta n.
     * @param b parametro de la base
     * @param n parametro del exponente
     */
    public static void mostrarPotencias(double b, int n){
        for (int i = 0; i < n; i++){
            System.out.println("La potencia " + i + "  de " + b + " es: " + potencia(b, i));
        }
    }

    /**
     * Calcula la suma de las potencias de la base con el exponente dado hasta n.
     * @param valor parametro de la base
     * @param n parametro del exponente
     * @return devuelve el resultado de la suma
     */
    public static double sumaPotencias(double valor , int n){
        double suma = 0;
        for (int i = 0; i <= n; i++){
            suma += potencia(valor, i);
        }
        return suma;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("introduce la base en real y el exponente entero del número");
        double b = sc.nextDouble();
        int e = sc.nextInt();
        System.out.println(potencia(b, e));
        int n=10;
        mostrarPotencias(b,n);
        System.out.println("La suma de las potencias de " + b + " es: " + sumaPotencias(b, n));
        sc.close();
    }
}
// 6. a) Realizar una función que halle y devuelva la potencia de un número ( No se
// permite usar funciones de Math). La base puede ser real y el exponente entero
// puede ser negativo (recuerda que a-b = (1/a)b
// ). 
// Parámetros del método: la base y el exponente. Valor devuelto: la potencia
// b) Realiza un nuevo método (en la misma clase) que muestre en pantalla las n
// primeras potencias de un número a (n y a serán parámetros del método). 
// Por ejemplo, si los parámetros son a=2 y n=4 mostrará: 1, 2, 4, 8. 
// Para hacerlo deberás llamar al creado en el apartado anterior para calcular las
// potencias, no las puedes calcular de nuevo en este método.
// c) Escribe un método que sume la progresión geométrica (x puede ser real) y
// devuelva el resultado.
// 1+x+x2+ x3+ x4+... xn
// Se debe utilizar la función potencia (sin modificarla, sólo llamándola) programada
// anteriormente. 
// Por ejemplo si x=2 y n=4 mostrará 31 por ser el resultado de 1+2+4+8+16.
// Parámetros del método: x y n. Valor devuelto: resultado de la progresión.
