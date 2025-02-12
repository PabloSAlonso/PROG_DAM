package boletin5.ejercicio2;

public class MatrizAleatoria {

    public static char[][] crearMatriz(int n, int m) {
        char listaLetras[][] = new char[n][m];
        for (int i = 0; i < listaLetras.length; i++) {
            for (int j = 0; j < listaLetras[0].length; j++) {
                listaLetras[i][j] = (char) (Math.random() * 26 + 65);
            }
        }
        return listaLetras;
    }

    public static void mostrarMatriz(char[][] letras) {
        System.out.print("   ");
        for (int i = 0; i < letras[0].length; i++) {
            System.out.printf("%3d", i);
        }
        System.out.println();
        int numero = 0;
        for (char[] fila : letras) {
            System.out.printf("%3d", numero);
            numero++;
            for (char letra : fila) {
                System.out.printf("%3s", letra);
            }
            System.out.println();
        }
    }

    public static char numeroMayor(char[][] letras) {
        char auxiliar = letras[0][0];
        for (int i = 0; i < letras.length; i++) {
            for (int j = 0; j < letras[0].length; j++) {
                if (auxiliar < letras[i][j]) {
                    auxiliar = letras[i][j];
                }
            }
        }
        return auxiliar;
    }

    public static char numeroMenor(char[][] letras) {
        char auxiliar = letras[0][0];
        for (char[] fila : letras) {
            for (char letra : fila) {
                if (auxiliar > letra) {
                    auxiliar = letra;
                }
            }
        }
        return auxiliar;
    }

    public static boolean intercambiaPosiciones(char[][] letras, int n1, int n2, int n3, int n4) {
        char auxiliar;
        if (n1 >= letras.length || n3 >= letras.length || n1 < 0 || n3 < 0 || n2 >= letras.length || n4 >= letras.length
                || n2 < 0 || n4 < 0) {
            return false;
        } else {
            auxiliar = letras[n1][n2];
            letras[n1][n2] = letras[n3][n4];
            letras[n3][n4] = auxiliar;
            return true;
        }
    }

    public static void main(String[] args) {
        char[][] m1 = crearMatriz(3, 4);
        mostrarMatriz(m1);
        System.out.println();
        char[][] m2 = crearMatriz(4, 3);
        mostrarMatriz(m2);
        System.out.println();
        System.out.println(intercambiaPosiciones(m1, 0, 2, 0, 2));
        System.out.println();
        System.out.println(intercambiaPosiciones(m1, 1, 2, 0, 0));
        System.out.println();
        mostrarMatriz(m1);
    }
}
