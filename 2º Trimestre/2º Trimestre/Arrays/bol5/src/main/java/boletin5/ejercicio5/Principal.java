package boletin5.ejercicio5;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws FileNotFoundException {
        int[] ventasFinales = new int[12];
        Ventas v = new Ventas(2020);
        File f = new File("ventas.txt");
        int añoActual = LocalDate.now().getYear();
        if (args.length != 0) {
            f = new File(args[0]);
        }
        if (f.exists()) {
            Scanner leer = new Scanner(f);
            String añoLeer = leer.nextLine();
            String[] valores = leer.nextLine().split(";");
            leer.close();
            for (int i = 0; i < valores.length; i++) {
                int ventas = Integer.parseInt(valores[i]);
                ventasFinales[i] = ventas;
            }
            int año = Integer.parseInt(añoLeer);
            Ventas ventasExiste = new Ventas(año, ventasFinales);
            
        }
    }
}

