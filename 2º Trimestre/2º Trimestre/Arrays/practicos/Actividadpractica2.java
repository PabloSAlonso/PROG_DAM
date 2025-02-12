package practicos;
public class Actividadpractica2 {
    public static double[][] bidimensional(int filas, int columnas){
        double[][] tabla = new double[filas][columnas];
        System.out.println("Nº de filas"+tabla.length);
        System.out.println("Nº de columnas"+ tabla[0].length);
        System.out.println();
        for(int i = 0; i < tabla[0].length; i++){
            System.out.printf("%6d",i);
        }
        System.out.println();
        for (int i = 0; i < tabla.length; i++) {
            System.out.printf("%6d",i);
            for (int j = 0; j < tabla[0].length; j++) {
                tabla[i][j] = Math.random() * 10 + 20;
                System.out.printf("%7.2f",tabla[i][j]);
            }
            System.out.println();
        }
        return tabla;
    }
    // public static void mostrar(double[][] tabla){
    //     for(double[] fila : tabla){
    //         for (double[] fila2 : tabla) {
    //             System.out.printf("%s",fila);
    //             System.out.printf("%s",fila2);
    //         }
    //         System.out.println();
    //     }
    // }
    public static void main(String[] args) {
        bidimensional(4, 3);
        // mostrar(bidimensional(4, 3));
        System.out.println();
        System.out.println();
        bidimensional(3, 4);
        // mostrar(bidimensional(4, 3));
    }
}
/*Actividad: Realiza una función a la cual se le pasan dos parámetros enteros
(nº de filas y nº de columnas) y cree un array bidimensional de números
reales (aleatorios entre 20 y 30) del tamaño indicado por los parámetros y lo
devuelva. 
Realiza también otra función a la que se le pasa un array bidimensional de
doubles y la muestra por pantalla indicando el número de fila y el de columna
como cabeceras. Los datos muestralos con 2 decimales. Trata de hacerla con
for mejorado.
En el main crea dos arrays mediante la primera función (de 4x3 y de 3x4).
Luego muéstralos mediante la segunda función.
*/
