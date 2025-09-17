package principal.Ej2.Principal;

import java.util.ArrayList;
import principal.Ej2.Geometría.*;
import principal.Ej2.Interfaz.Libreria;

public class App {
    public static void main(String[] args) {
        ArrayList<Figura> figuras = new ArrayList<Figura>();
        int opcion;
        Punto punto = new Punto(0, 0);
        do {
            System.out.println("\nIntroduce una opción del menú");
            System.out.println("1: Insertar una figura");
            System.out.println("2: Mostrar elementos de la coleccion");
            System.out.println("3: Mostrar datos de un elemento de la coleccion");
            System.out.println("4: Borrar elementos de un tipo");
            System.out.println("5: Salir del programa");
            opcion = Libreria.pedirEntero();
            switch (opcion) {
                case 1:
                    // Código opcion 1
                    int añadir;
                    System.out.println("Que figura quieres");
                    System.out.println("1- Linea");
                    System.out.println("2- Triángulo");
                    System.out.println("3- Cuadrado");
                    System.out.println("4- Circunferencia");
                    añadir = Libreria.pedirEntero();
                    while (añadir < 1 || añadir > 4) {
                        System.out.println("Introduce un numero entre 1 y 4 porfavor");
                        añadir = Libreria.pedirEntero();
                    }
                    switch (añadir) {
                        case 1:
                            figuras.add(new Linea(punto, punto));
                            break;
                        case 2:
                            figuras.add(new Poligono());
                            break;
                        case 3:
                            figuras.add(new Poligono("Cuadrado", punto, 4));
                            break;
                        case 4:
                            figuras.add(new Circunferencia(punto, 0));
                            break;

                        default:
                            System.out.println("Opción no válida");
                            break;
                    }
                    break;
                case 2:
                    // Código opcion 2
                    if (figuras.size() == 0) {
                        System.out.println("No hay datos para mostrar");
                    } else {
                        for (int i = 0; i < figuras.size(); i++) {
                            System.out.println("Nombre: " + figuras.get(i).getNombre());
                            if (figuras.get(i).getClass() == Circunferencia.class) {
                                System.out.printf("y radio: %.1f\n", (((Circunferencia) figuras.get(i)).getRadio()));
                            }
                        }
                    }

                    break;
                case 3:
                    // Código opcion 3
                    int elemento;
                    System.out.println("Que elemento de la coleccion quieres");
                    elemento = Libreria.pedirEntero();
                    while (elemento <= 0 || elemento > figuras.size()) {
                        System.out.println("No existe dicho elemento, elige uno valido");
                        elemento = Libreria.pedirEntero();
                    }
                    figuras.get(elemento - 1).muestraDatos();

                    break;
                case 4:
                    // Código opcion 4
                    int eliminar;
                    System.out.println("Que quieres eliminar?");
                    System.out.println("1.-Linea");
                    System.out.println("2.-Poligono");
                    System.out.println("3.-Circunferencia");
                    eliminar = Libreria.pedirEntero();
                    while (eliminar < 1 || eliminar > 3) {
                        System.out.println("Introduce un numero entre 1 y 3 porfavor");
                        eliminar = Libreria.pedirEntero();
                    }
                    switch (eliminar) {
                        case 1:
                            // Código opcion 1
                            for (int i = figuras.size() - 1; i >= 0; i--) {
                                if (figuras.get(i).getClass() == Linea.class) {
                                    figuras.remove(i);
                                }
                            }
                            break;
                        case 2:
                            // Código opcion 2
                            for (int i = figuras.size() - 1; i >= 0; i--) {
                                if (figuras.get(i).getClass() == Poligono.class) {
                                    figuras.remove(i);
                                }
                            }
                            break;
                        case 3:
                            // Código opcion 3
                            for (int i = figuras.size() - 1; i >= 0; i--) {
                                if (figuras.get(i).getClass() == Circunferencia.class) {
                                    figuras.remove(i);
                                }
                            }
                            break;
                        default:
                            System.out.println("Opcion no valida");
                    }

                    break;
                case 5:
                    // Código opcion 5
                    System.out.println("Hasta otra! :)");

                    break;
                default:
                    System.out.println("Opcion no valida :(");
            }
        } while (opcion != 5);
    }
}
