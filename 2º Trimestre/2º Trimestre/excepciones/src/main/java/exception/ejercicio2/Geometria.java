package exception.ejercicio2;

public class Geometria {
    //#region ATRIBUTOS
    private boolean figura;
    private double altura;
    private double base;
    //#endregion

    //#region GETS
    public boolean getFigura() {
        return figura;
    }

    public double getAltura() {
        return altura;
    }
    public double getBase() {
        return base;
    }

    //#endregion
    
    //#region SETS
    public void setAltura(double altura) {
        if (altura <= 0) {
            throw new IllegalArgumentException("Valor negativo no es válido");
        } 
            this.altura = altura;
    }
    
    public void setBase(double base) {
        if (base <= 0) {
            throw new IllegalArgumentException("Valor negativo no es válido");
        }
            this.base = base;
    }
    //#endregion
    
    //#region CONSTRUCTORES
    public Geometria() {
        this.figura = false;
        this.altura = 2;
        this.base = 2;
    }

    public Geometria(double base, double altura) {
        this.base = base;
        this.altura = altura;
        this.figura = false;
    }

    public Geometria(boolean figura,
            double base, double altura) {
        this.figura = figura;
        this.base = base;
        this.altura = altura;
    }
    //#endregion

    //#region MÉTODOS
    public double area() {
        double area;
        if (figura) {
            area = base * altura;
        }
        else {
            area = base * altura / 2;
        }
        return area;
    }
    
    public double perimetro() {
        double perimetro;
        if (figura){
            perimetro = 2 * (base + altura);
        } else{
            perimetro = base + altura + diagonal();
        }
        return perimetro;
    }
    public double diagonal(){
        double diagonal;
        diagonal = Math.sqrt((base*base) + (altura*altura));
        return diagonal;
    }
    public String tipo(){
        if (figura){
            return "Cuadrado";
        } else {
            return "Triángulo";
        }
    }
    //#endregion
}