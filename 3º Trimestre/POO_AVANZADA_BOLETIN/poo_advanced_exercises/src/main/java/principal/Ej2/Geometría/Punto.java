package principal.Ej2.Geometría;

public class Punto {
    public double x;
    public double y;

    public Punto(double x, double y){
        this.x = 0;
        this.y = 0;
    }
    public Punto(){
        this(0,0);
    }
    @Override
    public String toString() {
        return String.format("%f.1; %f.1", x, y);
    }
}
