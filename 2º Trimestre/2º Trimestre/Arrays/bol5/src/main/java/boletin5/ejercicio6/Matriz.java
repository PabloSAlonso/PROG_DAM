package boletin5.ejercicio6;

public class Matriz {
    public int[][] bidimensional;

    // #region Constructor
    /**
     * Establece la propiedad de filas y columnas a n, inicializa los valores de la
     * matriz a numeros aleatorios entre 0 y 10
     * @param n dimension n*n de la matriz
     */
    public Matriz(int n) {
        // Asignamos en el constructor el numero de filas y columnas de la matriz, que
        // dependerá del parámetro introducido
        this.bidimensional = new int[n][n];
        // Asignamos valores aleatorios entre 0 y 10 a cada posición
        for (int i = 0; i < this.bidimensional.length; i++) {
            for (int j = 0; j < this.bidimensional[i].length; j++) {
                this.bidimensional[i][j] = (int) ((Math.random() * 10));
            }
        }
    }
    // #endregion

    // #region Métodos
    /**
     * Funcion que muestra una matriz en forma de tabla
     * @param matriz la matriz que mostrará
     */
    public static void muestraMatriz(int[][] matriz) {
        // Damos 4 espacios para cuadrar bien el encabezado y posteriormente escribimos
        // este mismo
        System.out.print("    ");
        for (int i = 0; i < matriz[0].length; i++) { 
            System.out.printf("%4d", i+1);
        }
        System.out.println();
        // Asignamos la cabecera de filas
        int k = 1;
        // Aqui iremos construyendo a la vez tanto el encabezado de las filas (k) como
        // las posiciones de la propia matriz(i j), teniendo en cuenta lo que ocupan
        // para que esté correctamente colocado (%4)
        for (int i = 0; i < matriz.length; i++) {
            System.out.printf("%4d", k);
            k++;
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf("%4d", matriz[i][j]);
            }
            System.out.println();
        }
    }

    /**
     * Función que suma los elementos de la matriz bidimensional
     * 
     * @return la suma de los elementos
     */
    public int suma() {
        int suma = 0;
        // recorre cada elemento y los va sumando en una variable acumulativa
        for (int i = 0; i < bidimensional.length; i++) {
            for (int j = 0; j < bidimensional.length; j++) {
                suma += bidimensional[i][j];
            }
        }
        return suma;
    }

    /**
     * Funcion que devuelve la suma de: o bien la diagonal de la matriz o bien la
     * suma del resto de elementos dependiendo de un booleano
     * 
     * @param flag el booleano que determina que opcion ejecutar
     * @return la suma ejecutada
     */
    public int suma(boolean flag) {
        int diagonal = 0;
        int suma = suma();
        for (int i = 0; i < this.bidimensional.length; i++) {
            diagonal += this.bidimensional[i][i];
        }
        if (flag) {
            return diagonal;
        } else {
            return suma - diagonal;
        }
    }

    /**
     * Funcion que suma los elementos de una fila, en caso de no existir la fila
     * devuelve -1
     * 
     * @param fila la fila que quieres sumar
     * @return la suma de la fila o -1 si no existe la fila
     */
    public int suma(int fila) {
        int suma = 0;
        if (fila >= 0 && fila < this.bidimensional.length) {
            for (int i = 0; i < this.bidimensional[fila].length; i++) {
                suma += this.bidimensional[fila][i];
            }
            return suma;
        } else {
            return -1;
        }
    }

    /**
     * funcion que crea una matriz a partir de otra a la que se le elimina una fila
     * @param filaBorrada la fila borrada de la matriz original
     * @return la nueva matriz con la fila borrada
     */
    public int[][] borraFila(int[][]mtriz,int filaBorrada) {
        int[][] nuevaMatriz = new int[bidimensional.length - 1][bidimensional[0].length];
        int k = 0;
        if (filaBorrada < 0 || filaBorrada >= bidimensional.length) {
            return bidimensional;
        } else {
            for (int i = 0; i < bidimensional.length; i++) {
                if (i != filaBorrada - 1) {
                    for (int j = 0; j < bidimensional[i].length; j++) {
                        nuevaMatriz[k][j] = bidimensional[i][j];
                    }
                    k++;
                } 
            }
            return nuevaMatriz;
        }
    }

    // #endregion
}
