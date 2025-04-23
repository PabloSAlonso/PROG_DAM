package principal.Ej2.Geometría;

import principal.Ej2.Interfaz.Libreria;

public class Poligono extends Figura {
    public Punto[] puntos;

    public Poligono(String nombre, Punto origen, int tamañoArray) {
        super(origen, nombre);
        puntos = new Punto[tamañoArray];
        for (int i = 0; i < puntos.length; i++) {
            puntos[i] = new Punto(Math.random(), Math.random());
        }
    }

    public Poligono() {
        this("Triangulo", new Punto(0, 0), 3);
        puntos[0] = new Punto(0, 0);
        puntos[1] = new Punto(1, 1);
        puntos[2] = new Punto(1, 0);
    }

    @Override
    public void pedirDatos() {
        super.pedirDatos();
        double x = 0;
        double y = 0;
        for (int i = 0; i < puntos.length; i++) {
            System.out.println("Dame la x del punto");
            x = Libreria.pedirReal();
            System.out.println("Dame la y del segundo");
            y = Libreria.pedirReal();
            puntos[i] = new Punto(x, y);
        }
    }

    @Override
    public void muestraDatos() {
        super.muestraDatos();
        for (int i = 0; i < puntos.length; i++) {
            System.out.println(puntos[i].toString());
            
        }
    }
}
