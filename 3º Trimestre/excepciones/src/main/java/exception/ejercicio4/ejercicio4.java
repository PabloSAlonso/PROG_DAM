package exception.ejercicio4;

import java.util.Scanner;

public class ejercicio4 {
    /**
     * Funcion que a partir de una cadena devuelve un fragmento de esta misma
     * dependiendo de dos parametros.
     * @param cadena     El string del que leerá caracteres
     * @param posicion   La posicion desde la que empezará a leer
     * @param caracteres El número de caracteres que leerá
     * @return El fragmento de la cadena deseado
     */
    public static String subCadena(String cadena, int posicion, int caracteres) {
        String palabra = "";
        if (posicion < 0 || posicion > cadena.length() || (posicion + caracteres) > cadena.length()) {
            throw new IllegalArgumentException("Has introducido algún dato incorrecto");
        } else {
            for (int i = posicion; i < caracteres + posicion; i++) {// No estaba teniendo en cuenta la posicion para
                                                                    // empezar a pintar caracteres
                palabra = palabra + cadena.charAt(i);
            }
        }
        return palabra;
    }

    /**
     * Funcion a la que se le pasa una cadena y la muestra centrada en la consola
     * 
     * @param cadena La cadena que muestra centrada
     */
    public static void muestraCentrado(String cadena) {
        if (cadena.length() > 80) {
            throw new IllegalArgumentException("Has introducido mas de 80 caracteres");
        }
        int mitad = 40 - cadena.length() / 2;
        for (int i = 0; i < mitad; i++) {
            System.out.print(" ");
        }
        System.out.print(cadena);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String frase = "Holaaa";
        for (int i = 0; i < 80; i++) {
            frase = frase + "a";
        }
        try {
            // Enseña un fragmento de la cadena según los parametros
            System.out.println("subcadena: " + subCadena(frase, 81, 11));
            System.out.println();
        } catch (IllegalArgumentException e) {
            System.out.println("Has introducido algun dato incorrecto");
        }
        try {
            // Enseña centrado en la consola
            muestraCentrado(frase);
        } catch (IllegalArgumentException e) {
            System.out.println("Has introducido mas de 80 carateres");
        }
        System.out.println();
        sc.close();
    }
}
