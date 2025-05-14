package principal.Ej5;

public class Astro {
    private String nombre;
    private double radio;

    public void setNombre(){
        this.nombre = nombre.toUpperCase().trim();
    }
    public void setRadio(){
        if (radio < 0){
            throw new RadioException();
        } else {
            this.radio = radio;
        }
    }
}
