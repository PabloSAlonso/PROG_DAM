package boletin5.ejercicio6;

public class Matriz {
    public int[][] bidimensional;

    //#region Constructor
    public Matriz(int n){
        this.bidimensional = new int[n][n];
        for (int i = 0; i < this.bidimensional.length; i++){
            for (int j = 0; j < this.bidimensional[i].length; j++) {
                this.bidimensional[i][j] = (int) (Math.random() * 9 + 1);
            }
        }
    }
    //#endregion

    //#region Métodos
    public static void muestraMatriz(int[][] matriz){
            System.out.print("    ");
            for(int i = 0; i < matriz.length; i++){
                System.out.printf("%4d", i+1);
            }
            System.out.println();
            int k = 1;
    }
}
