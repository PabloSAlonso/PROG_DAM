package principal.Ej5;

public class Astro {
    private String nombre;
    private double radio;

    public void setNombre(String nombre){
        this.nombre = nombre.toUpperCase().trim();
    }

    public String getNombre() {
        return nombre;
    }

    public String getNombre(char separador) {
        String nuevoString = "";
        for (int i = 0; i < nombre.length(); i++) {
            nuevoString += nombre.charAt(i) + separador;
        }
        return nuevoString;
    }
    
    public void setRadio(double radio){
        if (radio < 0){
            throw new RadioException();
        }
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public Astro(String nombre, double radio){
        setNombre(nombre);
        setRadio(radio);
    }
    public Astro(){
        this.nombre = "";
        this.radio = 0.0;
    }

    @Override
    public boolean equals(Object comparaAstro) { //TODO comparar nombre
        if (this.getClass() == comparaAstro.getClass()){
            return true;
        } else {
            return false;
        }
    }
    @Override
    public String toString() {
        return String.format("Nombre: %s, Radio: %.2f",getNombre(),getRadio());
    }
}
