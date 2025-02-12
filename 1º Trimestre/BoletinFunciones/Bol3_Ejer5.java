import java.util.Scanner;
import java.io.PrintWriter;
import java.io.File;

public class Bol3_Ejer5 {
    public static void main(String[] args) throws Exception {   
        Scanner sc = new Scanner(System.in);

        // Apertura
        PrintWriter f = new PrintWriter("Ej5.txt");

        System.out.println("Dime un año");

        // Escritura

        int año = sc.nextInt();
        if (Bol3_Ejer4.bisiesto(año)) {
            f.println(año + " Es bisiesto");
        } else {
            f.println(año + " No es bisiesto");
        }

        for (int i = año+1; i <= 2024; i++) {
            if (Bol3_Ejer4.bisiesto(i)) {
                System.out.println(i);
                f.print(i+" ");
                // f.println(" Es bisiesto");
            }
        }
        // Cierre
        f.close();

        Scanner l = new Scanner(new File("Ej5.txt"));
        String linea;
        if (l.hasNextLine()) {
            l.nextLine();
        }
        
        while (l.hasNextInt()) {
            linea = l.nextLine();
            System.out.printf("%6s ,",linea);
        }
        l.close();
        sc.close();


    }
}
// **5. Haz un programa que realice las siguientes tareas:
// Pide un año al usuario y guarda en un archivo dicho año en la primera línea
// indicando si es o no bisiesto y a continuación todos los bisiestos desde ese año
// hasta el año actual (cada uno en una línea).
// Un ejemplo de como puede quedar el archivo:
// 2015 No es bisiesto.
// 2016
// 2020
// 2024
// A continuación lee el archivo y muestra en pantalla todos los años menos el
// primero. Debe estar separados por comas en la misma linea y ocupando 6
// caracteres.
// Si este programa lo tienes en la misma carpeta que el de bisiesto no es necesario
// que copies la función, puedes acceder a ella poniendo NombreClase.nombreFuncion.
// Por ejemplo:
// Bol3Ejer4.bisiesto(2024);

