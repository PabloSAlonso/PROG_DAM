package principal.Ej2.Geometría;

import principal.Ej2.Interfaz.Libreria;

public class Circunferencia extends Figura {
    private double radio;

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        if (radio < 0) {
            throw new IllegalArgumentException("Has introducido un negativo");
        } else {
            this.radio = radio;
        }
    }

    public Circunferencia(Punto punto, double radio){
        super(punto, "Circunferencia");
        setRadio(radio);
    }

    public Circunferencia(){
        this(new Punto(0, 0), 1);
    }

    @Override
    public void pedirDatos() {
        super.pedirDatos();
        System.out.println("Cual es el radio de la circunferencia");
        setRadio(radio);
    }

    @Override
    public void muestraDatos() {
        super.muestraDatos();
        System.out.println("Radio: "+ radio);
    }
}
