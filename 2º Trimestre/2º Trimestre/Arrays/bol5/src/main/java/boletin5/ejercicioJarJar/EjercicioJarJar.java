package boletin5.ejercicioJarJar;
public class EjercicioJarJar {

    public static void main(String[] args) {
        String fraseEjercicio = "Jar-Jar is the Big Boss";
        fraseEjercicio.length();
        fraseEjercicio.charAt(0);
        fraseEjercicio.charAt(fraseEjercicio.length() - 1);
        // frase.charAt(100); Excede el limite y da error
        fraseEjercicio.toUpperCase();
        String fraseEjercicio2 = fraseEjercicio.toUpperCase();
        fraseEjercicio.equals(fraseEjercicio2); // Da false porque tiene en cuenta mayus
        fraseEjercicio.equalsIgnoreCase(fraseEjercicio2); // Da true al no tener en cuenta las mayus
        System.out.println(fraseEjercicio.toLowerCase());
        System.out.println(fraseEjercicio.endsWith("Jar"));
        System.out.println(fraseEjercicio.endsWith("Boss"));
        System.out.println(fraseEjercicio.indexOf("Jar"));
        System.out.println(fraseEjercicio.lastIndexOf("Jar"));
        String fraseEjercicio3 = fraseEjercicio2.substring(7, 15);
        System.out.println(fraseEjercicio3);
        System.out.println(fraseEjercicio3.trim());

        String[] frase = fraseEjercicio.split("[ -]");

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