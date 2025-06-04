package principal.Ej3;

import java.util.ArrayList;

public class Cadena { 
    private ArrayList<Character> cadena;

    public void setCadena(String caracteres) {
        ArrayList<Character> cadenaTrim = new ArrayList<Character>();
        int inicio = 0;
        while (caracteres.charAt(inicio) == ' ') {
            inicio++;
        }
        int fin = caracteres.length() - 1;
        while (caracteres.charAt(fin) == ' ') {
            fin--;
        }
        for (int i = inicio; i <= fin; i++) {
            cadenaTrim.add(caracteres.charAt(i));
        }
        cadena = cadenaTrim;
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
        if (obj.getClass() == char[].class) {
            char[] arrayDeCadena = (char[]) obj;
            if (arrayDeCadena.length == cadena.size()) {
                for (int i = 0; i < arrayDeCadena.length; i++) {
                    if (arrayDeCadena[i] != cadena.get(i)) {
                        return false;
                    }
                }
                return true;
            }
        } else if (obj.getClass() == Cadena.class) {
            ArrayList<Character> cadena2 = (ArrayList<Character>) obj;
            if (cadena2.size() == cadena.size()) {
                for (int i = 0; i < cadena2.size(); i++) {
                    if (cadena.get(i) != cadena2.get(i)) {
                        return false;
                    }
                }
                return true;
            }
            return this.equals(obj);
        } else if (obj.getClass() == String.class) {
            String cadenaString = (String) obj;
            if (cadenaString.length() == cadena.size()) {
                for (int i = 0; i < cadenaString.length(); i++) {
                    if (cadenaString.charAt(i) != cadena.get(i)) {
                        return false;
                    }
                }
                return true;
            }
        } else {
            throw new IllegalArgumentException();
        }
        return false;
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
        Cadena cadena = new Cadena();
        // System.out.println("Introduce la 1º cadena");
        cadena.setCadena("        OOLLOGGOOGOOOG            ");
        String texto1 = "h";
        char texto2 = 'h';
        System.out.println(cadena);
        System.out.println(cadena.toString());
        System.out.println(cadena.eliminar('O'));
        System.out.println(cadena);
        System.out.println(texto1.equals(texto2));


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