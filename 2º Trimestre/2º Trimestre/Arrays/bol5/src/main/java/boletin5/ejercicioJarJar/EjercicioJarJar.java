package boletin5.ejercicioJarJar;
public class EjercicioJarJar {

    public static void main(String[] args) {
        String fraseEjercicio = "Jar-Jar is the Big Boss";
        //Longitud
        System.out.println(fraseEjercicio.length());
        
        //Muestra primer caracter
        System.out.println(fraseEjercicio.charAt(0));
        
        //Muestra el ultimo caracter
        System.out.println(fraseEjercicio.charAt(fraseEjercicio.length() - 1));
        
        //Muestra el resultado de ir a la posicion 100
        // frase.charAt(100); Excede el limite y da error
        
        //Cadena a mayusculas (solo enseña pero no cambia la variable)
        System.out.println(fraseEjercicio.toUpperCase());
        
        //Inicia un 2º String igualado a el 1º en mayusculas
        String fraseEjercicio2 = fraseEjercicio.toUpperCase();
        
        //Compara las dos cadenas de dos formas
        fraseEjercicio.equals(fraseEjercicio2); // Da false porque tiene en cuenta mayus
        fraseEjercicio.equalsIgnoreCase(fraseEjercicio2); // Da true al no tener en cuenta las mayus
        
        //Cadena a Minusculas (Solo muestra, no cambia la variable)
        System.out.println(fraseEjercicio.toLowerCase());
        
        //Comprobar si la cadena acaba en Jar y si acaba en Boss
        System.out.println(fraseEjercicio.endsWith("Jar"));
        System.out.println(fraseEjercicio.endsWith("Boss"));
        
        //Muestra la posicion de la primera y la ultima vez q aparece Jar
        System.out.println(fraseEjercicio.indexOf("Jar"));
        System.out.println(fraseEjercicio.lastIndexOf("Jar"));
        
        //Inicia una cadena a partir de la posicion y el numero de caracteres indicados
        String fraseEjercicio3 = fraseEjercicio2.substring(7, 15);
        System.out.println(fraseEjercicio3);
        
        //Quita los espacios de los extremos en la cadena 
        System.out.println(fraseEjercicio3.trim());
        
        //Crea un Array de Strings con las palabras de la primera cadena
        //Utiliza de separadores o el espacio o el guion
        String[] frase = fraseEjercicio.split("[ -]");
        
        //Muestra el array
        for (int i = 0; i < frase.length; i++) {
            System.out.printf("%3.3s\n", frase[i]);
        }
    }
}
// • Muestra la longitud de la cadena
// • Muestra el primer carácter, el último y comprueba lo que pasa al acceder
// al carácter de la posición 100.
// • Crea una segunda cadena a partir de la primera pasándola a mayúsculas
// y observa el resultado de equals y equalsIgnoreCase.
// • Muestra la cadena en minúsculas.
// • Comprueba si la cadena acaba por “Boss” y por “Jar”.
// • Muestra la posición de la primera y la última vez que aparece la palabra
// “Jar”.
// • Crea otra variable String a partir del fragmento de la cadena anterior
// que empieza en la posición 7 y acaba en la 14 (ambos incluidos).
// • Quita los espacios de los extremos de la anterior cadena creada y
// muéstrala.
// • Crea un array de Strings con las palabras de la primera cadena (los
// separadores son el espacio y el guion).
// • Muestra cada palabra del array anterior en una linea ocupando 3
// caracteres (cortala si es mayor). Esto no lo hagas con substring si no
// jugando con el formateo de printf.