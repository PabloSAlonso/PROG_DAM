package boletin5.ejercicio4;

public class ClasesCadenas {
    
    /**
     * Funcion a la que se le pasa una cadena y muestra cada caracter en una linea distinta
     * @param cadena la cadena que pintará en linea
     */
    public static void muestraEnLinea(String cadena) {
        for (int i = 0; i < cadena.length(); i++) {
            System.out.println(cadena.charAt(i));
        }
    }
    /**
     * Funcion que a partir de una cadena devuelve un fragmento de esta misma dependiendo de dos parametros.
     * @param cadena El string del que leerá caracteres
     * @param posicion La posicion desde la que empezará a leer
     * @param caracteres El número de caracteres que leerá
     * @return El fragmento de la cadena deseado
     */
    public static String subCadena(String cadena, int posicion, int caracteres) {
        String palabra = "";
        if (posicion < 0 || posicion > cadena.length() || (posicion + caracteres) > cadena.length()) {
            return "";
        } else {
            for (int i = posicion; i < caracteres + posicion; i++) {//No estaba teniendo en cuenta la posicion para empezar a pintar caracteres
                palabra = palabra + cadena.charAt(i);
            }
        }
        return palabra;
    }
    /**
     * Funcion a la que se le pasa una cadena y la muestra centrada en la consola 
     * @param cadena La cadena que muestra centrada
     */
    public static void muestraCentrado(String cadena) {
        int mitad = 40 - cadena.length() / 2;
        for (int i = 0; i < mitad; i++) {
            System.out.print(" ");
        }
        System.out.print(cadena);
    }
    /**
     * Funcion que a partir de una cadena crea un Array unidimensional con cada caracter de la cadena
     * @param cadena Contiene los caracteres que formarán el vector
     * @return El vector con los caracteres
     */
    public static char[] cadenaAVector(String cadena) {
        char[] letrasCadena = new char[cadena.length()]; 
        for (int i = 0; i < letrasCadena.length; i++) {
            letrasCadena[i] = cadena.charAt(i);
        }
        return letrasCadena;
    }
    /**
     * Funcion que devuelve una cadena que se le pasa en orden inverso
     * @param cadena La cadena que invierte
     * @return La cadena invertida
     */
    public static String alReves(String cadena) {
        String fraseAlReves = "";
        for (int i = cadena.length() - 1; i >= 0; i--) {
            fraseAlReves += cadena.charAt(i);
        }
        return fraseAlReves;
    }
    /**
     * Funcion que pasa varias cadenas de String mayúsculas y cambia las _ por espacios
     * @param cadenas Las cadenas que concatena
     * @return Las cadenas concatenadas
     */
    public static String pasoAMayusculas(String... cadenas) {
        String cadenasConcat = "";
        char letra;
        for(int i = 0; i < cadenas.length; i++){
            for (int j = 0; j < cadenas[i].length(); j++) {
                if (cadenas[i].charAt(j) == '_') {
                    cadenasConcat += " ";
                } else if (cadenas[i].charAt(j) >= 'a' && cadenas[i].charAt(j) <= 'z'){
                    letra = (char) (cadenas[i].charAt(j) - 32);
                    cadenasConcat += letra;
                } else {
                    cadenasConcat += cadenas[i].charAt(j);
                }
            }
        }
        return cadenasConcat;
    }

    public static void main(String[] args) {
        String frase = "Hola que tal estas";
        System.out.println();
        //Muestra la frase
        System.out.println(frase);
        System.out.println();
        //Enseña la frase hacia abajo
        muestraEnLinea(frase);
        System.out.println();
        //Enseña un fragmento de la cadena según los parametros
        System.out.println("subcadena: "+ subCadena(frase, 5, 6));
        System.out.println();
        //Enseña centrado en la consola
        muestraCentrado(frase);
        System.out.println();
        //Pasa la cadena a un vector
        cadenaAVector(frase);
        System.out.println();
        //Muestra la cadena al reves
        System.out.println(alReves(frase));
        System.out.println();
        //Pasa a Mayuscula a partir del codigo ASCII y cambia las "_" por espacios
        System.out.println(pasoAMayusculas(frase));
    }
}
