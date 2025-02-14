package boletin5.ejercicio5;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws FileNotFoundException {
        //Iniciamos un Array de 12 posiciones
        int[] ventasFinales = new int[12];

        //Enlazamos el archivo ventas.txt
        File f = new File("ventas.txt");
        int añoActual = LocalDate.now().getYear();

        //Apartado C
        if (args.length != 0) {
            f = new File(args[0]);
        }

        //Existe Ventas.txt
        if (f.exists()) {

            //Iniciamos un scanner que lee el archivo (ventas.txt) 
            //y le pedimos que lo lea
            Scanner leer = new Scanner(f);
            String añoLeer = leer.nextLine();

            //Creamos un nuevo Array que estará formado por los valores del archivo
            String[] valoresLeer = leer.nextLine().split("; ");
            leer.close();

            //Le damos los valores del archivo al primer Array creado
            //que estaba aun formado por ceros
            for (int i = 0; i < valoresLeer.length; i++) {
                int ventas = Integer.parseInt(valoresLeer[i]);
                ventasFinales[i] = ventas;
            }

            //Asignamos el año, que 
            //estaba escrito en la primera linea de "ventas.txt"
            int año = Integer.parseInt(añoLeer);

            //Le asignamos al objeto ventasExiste 
            //los valores del archivo y el año del mismo
            Ventas ventasExiste = new Ventas(año, ventasFinales);

            //mostramos funciones para el objeto ventasExiste
            //(Refiriendose la palabra "existe" al archivo "ventas.txt")
            ventasExiste.grafica();
            System.out.println();
            System.out.printf("Media de ventas: %.2f", ventasExiste.media());

        //No existe Ventas.txt
        } else{

            //Iniciamos el año a el actual menos 1
            //Este es el año que usaremos en este nuevo archivo en caso de 
            //que "ventas.txt" no exista
            int año2 = añoActual - 1;

            //Creamos el objeto ventasNoExiste con el año anterior
            //al actual pasado como parámetro, al no tener 2º parametro usa
            //el constructor que inicia 12 valores al azar en cada Run del programa
            Ventas ventasNoExiste = new Ventas(año2);

            //Mostramos funciones para esta opcion
            ventasNoExiste.grafica();
            System.out.println();
            System.out.printf("Media de ventas: %.2f", ventasNoExiste.media());

            //Vamos a hacer que esta opción también tenga un archivo.
            //Pero en vez de estar ya escrito lo escribiremos al momento
            //de ejecutar el programa.
            File guardaArchivo = new File("ventas" + año2 + ".txt");
            PrintWriter guardar = new PrintWriter(guardaArchivo);

            //Pintamos los datos
            guardar.print(año2 + "\n");
            int[] datos = ventasNoExiste.ventasMes;

            //Lee los datos y los pinta concatenados en el archivo
            //separados por ; y espacio
            for (int i = 0; i < datos.length; i++){
                guardar.printf("%d; ", datos[i]);
            }
            
            //Cerramos 
            guardar.close();
        }
    }
}

