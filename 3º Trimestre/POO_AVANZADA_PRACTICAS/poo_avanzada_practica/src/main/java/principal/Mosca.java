package principal;

public class Mosca extends Animal {
    public Mosca() {
        this.nombreCientifico = "Drosophila Melanogaster";
    }

    @Override
    public void muestraDatos() {
        System.out.printf("Las moscas no tienen edad\n");
    }
}
