package principal.Ej5_Main;

import java.util.ArrayList;
import java.util.Scanner;

import principal.Ej5.Astro;
import principal.Ej5.Planeta;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Astro> Astros = new ArrayList<>();
        int opcion = 0;
        int gaseoso = 0;
        boolean checkGaseoso;
        String nombreAñadir;
        double radioAñadir;
        int cantidadLunas;
        Astro nuevoAstro;

        System.out.println("Bienvenido");
        do {
            checkGaseoso = true;
            nombreAñadir = "";
            radioAñadir = 0.0;
            cantidadLunas = 0;

            System.out.println("Elige una opcion del menú");
            System.out.println();
            System.out.println("1- Introducir Planeta");
            System.out.println("2- Introducir nuevo Astro");
            System.out.println("3- Mostrar datos");
            System.out.println("4- Elimina repetidos");
            System.out.println("5- Salir");
            System.out.println();
            opcion = Libreria.pedirEntero(1, 5);
            switch (opcion) {
                case 0:
                    System.out.println("Trata de introducir unicamente un numero entre 1 y 5");
                    break;
                case 1:
                    System.out.println("Tu planeta es gaeoso?");
                    System.out.println("1 = Si y 2 = No");
                    gaseoso = Libreria.pedirEntero(1, 2);
                    if (gaseoso == 1) {
                        checkGaseoso = true;
                    } else {
                        checkGaseoso = false;
                    }
                    System.out.println("Dame el nombre de tu planeta");
                    nombreAñadir = Libreria.pedirString(sc.nextLine());
                    System.out.println("Ahora dame el radio");
                    radioAñadir = Libreria.pedirReal();
                    Planeta nuevoPlaneta = new Planeta(nombreAñadir, radioAñadir, checkGaseoso);
                    System.out.println("Planeta determinado, ahora dame su cantidad de lunas porfavor: ");
                    cantidadLunas = Libreria.pedirEntero();
                    for (int i = 0; i < cantidadLunas; i++) {
                        nuevoAstro = new Astro();
                        System.out.printf("Dime el nombre de la luna numero %d \n", i + 1);
                        nuevoAstro.setNombre(Libreria.pedirString(sc.nextLine()));
                        System.out.printf("Dime el radio de la luna numero %d \n", i + 1);
                        nuevoAstro.setRadio(Libreria.pedirReal());
                        nuevoPlaneta.satelites.add(nuevoAstro);
                        System.out.println("Luna añadida con éxito");
                    }
                    System.out.println("Planeta añadido con exito");
                    Astros.add(nuevoPlaneta);
                    System.out.println("Planeta:");
                    System.err.println(Astros);
                    System.out.println("Lunas:");
                    System.err.println(nuevoPlaneta.satelites);

                    break;
                case 2:
                    System.out.println("Dime el nombre de tu nuevo Astro");
                    nombreAñadir = Libreria.pedirString(sc.nextLine());
                    System.out.println("Ahora el radio");
                    radioAñadir = Libreria.pedirReal();
                    nuevoAstro = new Astro(nombreAñadir, radioAñadir);
                    Astros.add(nuevoAstro);
                    System.out.println("Astro añadido con éxito\n" + Astros);
                    break;
                case 3:
                    System.out.println("Datos de la colección");
                    
                    break;
                case 4:
                    System.out.println("Que elemento quieres eliminar");
                    
                    break;

                case 5:
                    System.out.println("Has elegido finalizar el programa, nos vemos!");

                default:
                    break;
            }
        } while (opcion != 5);
        sc.close();
    }
}
