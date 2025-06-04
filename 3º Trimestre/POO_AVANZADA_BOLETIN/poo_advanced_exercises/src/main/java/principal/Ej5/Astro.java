package principal.Ej5;

public class Astro {
    private String nombre;
    private double radio;

    public void setNombre(String nombre) {
        this.nombre = nombre.toUpperCase().trim();
    }

    public String getNombre() {
        return nombre;
    }

    public String getNombre(char separador) {
        String nuevoString = "";
        for (int i = 0; i < nombre.length(); i++) {
            if (i != nombre.length() - 1) {
                nuevoString += nombre.charAt(i) + separador;
            }
        }
        return nuevoString;
    }

    public void setRadio(double radio) {
        if (radio < 0) {
            throw new RadioException();
        }
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public Astro(String nombre, double radio) {
        setNombre(nombre);
        setRadio(radio);
    }

    public Astro() {
        nombre = "";
        radio = 0.0;
    }

    @Override
    public boolean equals(Object obj) { // TODO comparar nombre
        if (obj.getClass() == Astro.class) {
            Astro astro1 = (Astro) obj;
            if (astro1.getNombre() == Astro.class.getName() && astro1.getClass() == Astro.class) {
                return true;
            } else {
                return false;
            }
        } else if (obj.getClass() == Planeta.class) {
            Planeta planeta1 = (Planeta) obj;
            if (planeta1.getNombre() == Planeta.class.getName() && planeta1.getClass() == Planeta.class) {
                return true;
            } else {
                return false;
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @Override
    public String toString() {
        return String.format("Nombre: %s, Radio: %.2f", getNombre(), getRadio());
    }
}
