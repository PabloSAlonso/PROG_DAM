import java.io.File;
import java.util.Scanner;

public class LecturaArchivo {
    public static void main(String[] args) throws Exception {

        String linea;

        // Apertura
        Scanner f = new Scanner(new File("prueba.txt"));
        // Lectura de datos
        linea = f.nextLine(); // Prueba de archivos. Hola que tal.
        System.out.println(linea);
        f.nextLine(); // lee linea vacia
        f.nextLine(); // lee linea vacia
        // Para dejar en consola los dos retornos de carro del archivo
        System.out.println();
        System.out.println();
        linea = f.nextLine(); // 3,14
        System.out.println(linea);

        double numero = f.nextDouble();
        f.nextLine();
        System.out.println(numero);

        linea = f.nextLine(); // 10 11 12 13 14 15 16 17 18 19 20
        System.out.println(linea);
        // Cierre
        f.close();
    }
}