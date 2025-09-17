package practicos;
public class Unidimensionales {

    public static void cambio(double[] vector){
        vector[2] = 40;
    }

    public static void mostrarVector(double [] vector){
        for (int i = 0; i < vector.length; i++){
            System.out.printf("temperaturas[%d] = %7.2fºC\n",i,vector[i]);
        }
    }
    public static void main(String[] args) {
        double[] temperaturas = new double[5];

        // Rellena un array con valores aleatorios
        for (int i = 0; i < temperaturas.length; i++) {
            temperaturas[i] = Math.random() * 50 - 25;
        }
        // System.out.println(temperaturas[2]);
        System.out.println("Tamaño: "+temperaturas.length);
        for (int i = 0; i < temperaturas.length; i++) {
            System.out.printf("temperaturas[%d] = %7.2fºC\n",i,temperaturas[i]);
        }
        System.out.println();
        System.out.println();
        mostrarVector(temperaturas);

        
    }
}