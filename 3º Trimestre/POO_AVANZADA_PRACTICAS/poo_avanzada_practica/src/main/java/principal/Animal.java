package principal;

public class Animal extends Object {
    public String nombreCientifico;
    private int edad;

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void muestraDatos() {
        System.out.printf("Tengo %d años", this.edad);
    }
}
