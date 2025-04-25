package principal.Ej3;

import java.util.ArrayList;
import java.util.Scanner;

public class Cadena implements Comparable {
    private ArrayList<Character> cadena;

    //TODO SOLO charAt y Lenght y está mal
    public void setCadena(String caracteres) {
        String caracteresDevueltos = caracteres.trim();
        for (int i = 0; i < caracteresDevueltos.length(); i++) {
            cadena.add(caracteresDevueltos.charAt(i));
        }
    }

    @Override
    public String toString() {
        String cadenaDevuelta = "";
        for (int i = 0; i < cadena.size(); i++) {
            cadenaDevuelta += cadena.get(i);
        }
        return cadenaDevuelta;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj.equals(cadena) && obj != null && obj.getClass() == Cadena.class || obj.getClass() == String.class
                || obj.getClass() == char[].class) {
            return true;
        } else {
            throw new IllegalArgumentException("Parámetro inválido");
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