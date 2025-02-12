package boletin5.ejercicio3;

import java.util.ArrayList;

public class ListaAleatoria {
    public static ArrayList<Integer> crearArrayNumeros(int n){
        ArrayList<Integer> numsAleatorios = new ArrayList<>();
        for (int i = 0; i < n; i++){
            numsAleatorios.add((int)(Math.random() * (4001)) + 1000);
        }
        return numsAleatorios;
    }
    public static void muestraArray(ArrayList<Integer> numeros){
        for (Integer numero : numeros){
            System.out.println(numero);
        }
    }
    public static int numeroMayor(ArrayList<Integer> numeros){
        int auxiliar = numeros.get(0);
        for (int i = 0; i < numeros.size(); i++) {
            if (numeros.get(i) >= auxiliar) {
                auxiliar = numeros.get(i);
            }
        }
        return auxiliar;
    }
    public static int numeroMenor(ArrayList<Integer> numeros){
        int auxiliar = numeros.get(0);
        for (Integer numero : numeros) {
            if (numero <= auxiliar) {
                auxiliar = numero;
            }
        }
        return auxiliar;
    }
    public static boolean cambiaPosiciones(ArrayList<Integer> numeros, int indice1, int indice2){
        if (indice1 < 0 || indice2 < 0 || indice1 >= numeros.size() || indice2 >= numeros.size()) {
            return false;
        } else {
            int auxiliar = numeros.get(indice1);
            numeros.set(indice1, numeros.get(indice2));
            numeros.set(indice2, auxiliar);
            return true;
        }
    }
    public static ArrayList<Integer> eliminaMayores(ArrayList<Integer> numeros, int limite){
        for (int i = numeros.size() - 1; i >= 0; i--){
            if (numeros.get(i) > limite) {
                numeros.remove(i);
            }
        }
        return numeros;
    }
    public static void main(String[] args){
        ArrayList<Integer> numeros = crearArrayNumeros(10);
        muestraArray(numeros);
        System.out.println("Mayor: "+ numeroMayor(numeros));
        System.out.println("Menor: "+ numeroMenor(numeros));
        System.out.println("Cambiar Posiciones: "+ cambiaPosiciones(numeros, 3, 8));
        System.out.println(eliminaMayores(numeros, 3250));
    }
}
// Ejercicio 3:
/*Repite el primer ejercicio adaptándolo a un ArrayList<Integer>. Pruébalo con
una colección de 10 elementos en el programa principal.
Añade una función que se le pase un valor como parámetro y elimine de la
colección todos los elementos mayores que dicho parámetro.*/