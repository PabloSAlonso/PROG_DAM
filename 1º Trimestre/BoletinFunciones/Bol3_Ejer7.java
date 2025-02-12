import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class Bol3_Ejer7 {
    /**
     * Funcion que inicializa una funcion para llamar a un archivo y devuelve el archivo entero en forma de String
     * @param archivo Las lineas que lee de un archivo
     * @return Devuelve todas las lineas en forma de String
     * @throws FileNotFoundException
     */
    public static String saveFile(String archivo) throws FileNotFoundException {
        //Crea el archivo para leerlo
        File file = new File(archivo);
        Scanner f = new Scanner(file);
        while (f.hasNextLine()) {
            archivo +=f.nextLine() + "\n";
        }
        f.close();
        return archivo;
    }
    /**
     * Funcion que lee el archivo usando la funcion anterior y le añade nuevas lineas de texto sin borrar las anteriores
     * @param archivo El archivo que lee de la funcion anterior
     * @param newText El nuevo texto añadido al archivo
     * @throws FileNotFoundException
     * @throws IOException
     */
    //Lee el archivo, concatena el nuevo texto y lo guarda de nuevo
    public static void appendFile(String archivo, String newText) throws FileNotFoundException, IOException {
        //Lee el archivo usando la anterior función
        String currentContent = saveFile(archivo);
        // Concatena el nuevo texto al contenido actual
        currentContent += newText;
        // Escribe el archivo con el contenido actualizado
        FileWriter writer = new FileWriter(archivo);
        writer.write(currentContent+"\n");
        writer.close();
    }
    /**
     * Funcion que Lee el archivo y concatena el nuevo texto sin sobreescribir lo anterior 
     * @param archivo El archivo que lee
     * @param newText El nuevo texto que añade al archivo
     * @throws IOException
     */
    //Lee el archivo, concatena el nuevo texto y lo guarda de nuevo
    public static void appendFile2(String archivo, String newText) throws IOException {
        // Abre el archivo en modo añadir (true) para que se escriba al final del archivo sin sobreescribir lo anterior
        FileWriter writer = new FileWriter(archivo, true);
        writer.write(newText+"\n");
        writer.close();
    }

    public static void main(String[] args) throws Exception {
        // Probar saveFile
        String archivoContenido = saveFile("BoletinFunciones/Ej1.txt");
        System.out.println("\nContenido del archivo:\n" + archivoContenido);
        // Probar appendFile2
        appendFile2("BoletinFunciones/Ej1.txt", "\nEste es el texto que se añadirá al final del archivo\n");
        System.out.println("Contenido del archivo después de agregar con appendFile2:\n" + saveFile("BoletinFunciones/Ej1.txt"));
        // Probar appendFile
        appendFile("BoletinFunciones/Ej1.txt", "\nTexto añadido al final\n");
        System.out.println("Contenido del archivo después de agregar con appendFile:\n" + saveFile("BoletinFunciones/Ej1.txt"));
    }
}
// **7. a) Haz una función llamada loadFile a la cual se le pasa una cadena que
// representa el nombre de un archivo. Dicha función debe leer un archivo completo y
// devolverlo como string.
// Para probarla en el main usa el archivo del ejercicio 2.
// b) Realiza una función denominada appendFile a la que se le pasan dos cadenas, la
// primera es el nombre de un archivo y la segunda es un texto que debe añadir al
// final del archivo. Para ello primero lee el archivo, concatena la nueva cadenas y lo
// guarda de nuevo. Utiliza la función creada en (a) para la lectura.
// c) Realiza una función denominada appendFile2 que hace lo mismo que la realizada
// en (b) pero usando el método explicado en el Apéndice II de los apuntes.