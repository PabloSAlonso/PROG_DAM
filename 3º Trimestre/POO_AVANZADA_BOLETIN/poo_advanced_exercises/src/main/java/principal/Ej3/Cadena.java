package principal.Ej3;

import java.util.ArrayList;
import java.util.Scanner;

public class Cadena implements Comparable {
    private ArrayList<Character> cadena;

    public void setCadena(String caracteres) {
        int inicio = 0;
        int fin = caracteres.length();
        while (caracteres.charAt(inicio) == ' ') {
            inicio++;
        }
        while (caracteres.charAt(fin) == ' ') {
            fin--;
        }
        for (int i = inicio; i < fin; i++) {
            cadena.add(caracteres.charAt(i));
        }
    }

    @Override
    public String toString() {
        String cadenaCompleta = "";
        for (int i = 0; i < cadena.size(); i++) {
            cadenaCompleta += cadena.get(i);
        }
        return cadenaCompleta;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj.getClass() == char[].class){
            char[] arrayDelObj = (char[]) obj;
        }
    }

    public int eliminar(char caracter) {
        int contador = 0;
        for (int i = cadena.size() - 1; i >= 0; i--) {
            if (caracter == cadena.get(i)) {
                cadena.remove(i);
                contador++;
            }
        }
        return contador;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cadena cadena = new Cadena();
        // System.out.println("Introduce la 1º cadena");
        cadena.setCadena("hola");
        String coleccionAString = cadena.toString();
        System.out.println("Coleccion a String:");
        System.out.println(coleccionAString);
        Cadena comparaCadena = new Cadena();
        comparaCadena.setCadena(cadena.toString());
        System.out.println("Comparación de cadenas:");
        cadena.equals(comparaCadena);

    }
}

// 3. Se desea simular una clase parecida a la String denominada Cadena pero
// teniendo en cuenta que sólo se pueden usar concatenaciones y los métodos
// charAt() y length, y tendrá las siguientes características:
// - Tiene una propiedad privada denominada cadena que es una colección
// (ArrayList) de caracteres.
// Tendrá sólo un set que admite un String como parámetro
// y colocará cada uno de los elementos del String en la colección. Si hay
// espacios en
// los extremos los elimina.
// - Sobreescribe toString() para que devuelva la colección de caracteres como
// una
// cadena.
// - Sobreescribe equals(Object) para que devuelva true si el objeto que se le
// pasa
// como parámetro cumple:
// • Es de tipo Cadena y contiene los mismos caracteres y en las mismas
// posiciones que la colección de la instancia.
// • Es un objeto tipo String y contiene los mismos caracteres y en las
// mismas posiciones que la colección de la instancia.
// • Es un vector de char y contiene los mismos caracteres y en las
// mismas posiciones que la colección de la instancia.
// Si se le pasa un objeto null o un par ámetro que no sea tipo Cadena, String o
// char[]
// lanzará la excepción IllegalArgumentException
// - Método eliminar(char): se le pasa un carácter y elimina todas las veces que
// aparece dicho carácter. Además devuelve la cantidad de caracteres que ha
// eliminado.
// (opcional) Implementa la interfaz Comparable<Cadena> de forma que indique
// orden alfabético. Mira el Apéndice III de los apuntes.