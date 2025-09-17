public class Pelota {
    public String tipo;
    private double radio;

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        if (radio > 0) {
            this.radio = radio;
        } else {
            this.radio = 0;
        }
    }
    public Pelota() {
        this.tipo = "Playa";
        this.radio = 40;
    }
    public Pelota(String tipo, double radio) {
        this.tipo = tipo;
        this.radio = radio;
    }
    public void inflar() {
        this.radio += 1;
    }
    public void inflar(int incremento) {
        this.radio += incremento;
    }
}
