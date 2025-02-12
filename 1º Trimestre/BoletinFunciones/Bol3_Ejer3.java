import java.util.Scanner;

public class Bol3_Ejer3 {
    /**
     * Pide un número al usuario hasta que sea positivo
     * @param mensaje el mensaje que se muestra al pedir el dato
     * @return el número introducido por el usuario
     */
    public static double pedirDato(String mensaje) {
        Scanner sc = new Scanner(System.in);
        double n;
        System.out.println(mensaje);
        n = sc.nextDouble();
        while (n <= 0) {
            System.out.println("Debe introducir un número positivo.");
            n = sc.nextDouble();
        }
        return n;
    }
    /**
     * Pide un radio y una altura y devuelve la superficie de el cilindro con esos datos
     * @param r el radio del cilindro, 
     * @param h la altura del cilindro, 
     * @return el cálculo de la superficie del cilindro 
     */
    public static double superficieCilindro(double r, double h) {
        double superficie = 2 * Math.PI * r * h;
        return superficie;
    }
    /**
     * Muestra por pantalla el resultado de la superficie con un String antes y el valor viene con 3 decimales.
     * @param resultado Es el mensaje que sale antes del resultado
     * @param n Es el resultado de la superficie
     */
    public static void mostrarDato(String resultado, double n){
        System.out.printf("%s: %.3f5",resultado, n);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r= pedirDato("Introduce el radio");
        double h= pedirDato("Introduce la altura");
        double s=superficieCilindro(r,h);
        mostrarDato(("La superficie es"), s);
        sc.close();
    }
}
// 3. Realiza un programa que halle la superficie de un cilindro sabiendo que:
// Superficie=2*π*radio*altura
// Debe constar de 3 métodos:
// • pedirDato: pide un dato real usuario comprobando que sea un valor
// positivo. Al final devuelve dicho dato.
// • superficieCilindro: Se le pasa como parámetros el radio y la altura,
// hace el cálculo de la superficie y lo devuelve (sin nada de interfaz de
// usuario).
// • mostrarDato: Función que tiene un real como parámetro y un String.
// Muestra en la misma línea el String y a continuación el real con 3
// decimales. No devuelve nada. 
// Por tanto en el programa principal (main) solo debe llamarse a los tres métodos (y
// declarar variables auxiliares para recoger los datos). Dos veces al primero para
// pedir primero radio y después la altura, luego se llama al segundo para hacer el
// cálculo, y finalmente se llama al tercero para mostrar el resultado. Si lo necesitas
// usa variables intermedias para quedar con resultados de las funciones.
