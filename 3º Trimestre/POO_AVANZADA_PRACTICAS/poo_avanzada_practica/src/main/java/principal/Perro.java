package principal;

class Perro extends Animal {
    public String raza;
    public String nombreHumano;

    public Perro() {
        this.nombreCientifico = "Canis Familiaris";
    }

    public Perro(int edad, String raza, String nombreHumano) {
        this.setEdad(edad);
        this.raza = raza;
        this.nombreHumano = nombreHumano;
        this.nombreCientifico = "Canis Familiaris";
    }

    public void ladrar() {
        System.out.println("GUAU!!!");
    }

    @Override
    public String toString() {
        return nombreHumano + " " + getEdad();
    }

    private double temperatura;

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
        if (temperatura > 39.0) {
            throw new FiebreException();
        }
    }
    
    public double getTemperatura(){
        return temperatura;
    }
}
