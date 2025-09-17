package principal.Ej2.Geometría;

import principal.Ej2.Interfaz.Libreria;

public class Linea extends Figura {
    private Punto puntoFinal;

    public void setPuntoFinal(Punto puntoFinal) {
        this.puntoFinal = puntoFinal;
    }

    public Punto getPuntoFinal() {
        return puntoFinal;
    }

    @Override
    public void pedirDatos() {
        super.pedirDatos();
        puntoFinal = new Punto(Libreria.pedirReal(), Libreria.pedirReal());
    }

    @Override
    public void muestraDatos() {
        super.muestraDatos();
        System.out.println(puntoFinal);
    }

    public Linea(Punto origen, Punto puntoFinal) {
        super(origen, "linea");
        setPuntoFinal(puntoFinal);
    }

    public Linea() {
        this(new Punto(0, 0), new Punto(1, 1));
    }
}
