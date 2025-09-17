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

    public double getTemperatura() {
        return temperatura;
    }

    @Override
    public boolean equals(Object o) {

        if (o != null && o.getClass() == Perro.class) {
            Perro p = (Perro) o;
            if (this.nombreHumano.equals(p.nombreHumano)
                    && this.raza.equals(p.raza)
                    && this.getEdad() == p.getEdad()) {
                return true;
            }
        }
        return false;
        
    }
}
