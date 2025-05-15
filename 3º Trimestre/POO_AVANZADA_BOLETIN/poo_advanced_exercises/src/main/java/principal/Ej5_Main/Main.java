package principal.Ej5_Main;

import java.util.ArrayList;

import principal.Ej5.Astro;
import principal.Ej5.Planeta;

public class Main {
    public static void main(String[] args) {
        ArrayList<Astro> Astros = new ArrayList<>();
        int opcion = 0;
        int gaseoso = 0;
        boolean checkGaseoso;
        String nombreAñadir;
        double radioAñadir;
        int cantidadLunas;
        Astro nuevaLuna = new Astro();

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

            switch (opcion) {
                case 0:
                    System.out.println("Trata de introducir unicamente un numero entre 1 y 5");
                case 1:
                    System.out.println("Tu planeta es gaeoso?");
                    System.out.println("1 = Si y 2 = No");
                    gaseoso = Libreria.pedirEntero(2);
                    if (gaseoso == 1) {
                        checkGaseoso = true;
                    } else {
                        checkGaseoso = false;
                    }
                    System.out.println("Dame el nombre y radio de tu planeta");

                    System.out.println("Ahora dame el radio");

                    Planeta nuevoPlaneta = new Planeta(nombreAñadir, radioAñadir, checkGaseoso);

                    System.out.println("Planeta determinado, ahora dame su cantidad de lunas porfavor: ");
                    cantidadLunas = Libreria.pedirEntero();

                    for (int i = 0; i < cantidadLunas; i++) {
                        System.out.println("Dime el nombre y radio de dichas lunas");
                        
                        nuevoPlaneta.satelites.add(nuevaLuna);
                    }

                    System.out.println("Planeta añadido con exito");
                    Astros.add(nuevoPlaneta);

                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:

                    break;

                case 5:
                    System.out.println("Has elegido finalizar el programa, nos vemos!");

                default:
                    break;
            }

            opcion = Libreria.pedirEntero();
        } while (opcion != 5);
    }
}
