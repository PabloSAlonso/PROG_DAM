package boletin5.ejercicio7;

import java.util.Scanner;
import java.util.ArrayList;

public class Primitiva { 
    /**
     * Funcion que contiene una colección que vacía al inicio y la rellena con 6
     * valores aleatorios entre 1 y 49
     * @param coleccion la colección vacía que rellena
     * @return la colección rellenada
     */
    public static void rellenaCol(ArrayList<Integer> coleccion) {
        coleccion.clear();
        int numero;
        for (int i = 0; i < 6; i++) {
            numero = (int) (Math.random() * 49 + 1);
            if (coleccion.contains(numero)) {
                i--;
            } else {
                coleccion.add(numero);
            }
        }
    }

    /**
     * Funcion que compara los numeros de dos colecciones y va sumando en un
     * acumulador el numero de coincidencias
     * @param numsUsuario La coleccion de numeros introducida por el usuario
     * @param numsLoteria La coleccion de numeros de la loteria
     * @return el recuento de coincidencias
     */
    public static int compara(ArrayList<Integer> numsUsuario, ArrayList<Integer> numsLoteria) {
        int acumulador = 0;
        for (int i = 0; i < numsUsuario.size(); i++) {
            for (int j = 0; j < numsLoteria.size(); j++) {
                if (numsUsuario.get(i) == numsLoteria.get(j)) {
                    acumulador++;
                }
            }
        }
        return acumulador;
    }

    /**
     * Pide numeros al usuario y los almacena en una colección
     * @return la colección de numeros del usuario
     */
    public static ArrayList<Integer> pedirNums() {//TODO Falla si letra, si repetido, rango.
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numeroUsuario = new ArrayList<>();
        boolean comprobado = false;
        while (!comprobado) {
            numeroUsuario = new ArrayList<>();
            System.out.println("Introduce seis numeros separados por coma: ");
            String numeros = sc.nextLine();
            String[] numerosSeparados = numeros.split(",");
            try{
                for (String numero : numerosSeparados) {
                    numeroUsuario.add(Integer.parseInt(numero));
                }
                comprobado = validarNums(numeroUsuario);
                if (!comprobado) {
                    System.out.println("Los números no son validos");
                }
            } catch (Exception e){
                System.out.println("Introduce solo seis numeros separados por coma y entre 1 y 49");
            }
        }
        sc.close();
        return numeroUsuario;
    }

    /**
     * Funcion que comprueba si un numero introducido está 
     * en el rango deseado y sean 6 numeros
     * @param numeros colección que almacena numeros del usuario
     * @return booleano que indica si la lista de numeros es válida
     */
    public static boolean validarNums(ArrayList<Integer> numeros) {
        int num;
        if (numeros.size() != 6) {
            return false;
        }
        for (int i = 0; i < numeros.size(); i++) {
            num = numeros.get(i);
            
            if (num < 1 || num > 49) {
                return false;
            }

            for (int j = i + 1; j < numeros.size(); j++) {
                if (num == numeros.get(j)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numsUsuario = pedirNums();
        ArrayList<Integer> numsLoteria = new ArrayList<>();
        int[] numAciertos = new int[7];
        int resultado;
        for (int i = 0; i < 1000000; i++) {
            rellenaCol(numsLoteria);
            resultado = compara(numsUsuario, numsLoteria);
            numAciertos[resultado]++;
        }
        System.out.println("Resultados: ");
        for (int i = 0; i < numAciertos.length; i++) {
            System.out.printf("%d aciertos: %2d\n", i, numAciertos[i]);
        }
        sc.close();
    }
}
