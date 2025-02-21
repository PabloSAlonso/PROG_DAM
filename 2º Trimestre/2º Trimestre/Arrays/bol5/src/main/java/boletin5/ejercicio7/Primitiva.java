package boletin5.ejercicio7;
import java.util.Scanner;
import java.util.ArrayList;

public class Primitiva {
    /**
     * Funcion que contiene una colección que vacía al inicio y la rellena con 6 valores aleatorios entre 1 y 49
     * @param coleccion la colección vacía que rellena
     * @return la colección rellenada
     */
    public static ArrayList<Integer> rellenaCol(ArrayList<Integer> coleccion){
        coleccion.clear(); 
        int numero;
        for (int i = 0; i < 6; i++){
            numero = (int) (Math.random() * 49 + 1);
            if (coleccion.contains(numero)){
                i--;
            } else {
                coleccion.add(numero);
            }
        }
        return coleccion;
    }
    public static int compara(ArrayList<Integer> numsUsuario, ArrayList<Integer> numsLoteria){
        int acumulador = 0;
        for (int i = 0; i < numsUsuario.size(); i++){
            for(int j = 0; j < numsLoteria.size(); j++){
                if (numsUsuario.get(i) == numsLoteria.get(j)){
                    acumulador ++;
                }
            }
        }
        return acumulador;
    }
    public static void comprobarNum(int n){
        Scanner sc = new Scanner(System.in);
        while (n < 1 || n > 49) {
            System.out.println("Introduce un caracter válido");
            sc.nextInt();
        }
        sc.close();
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numsUsuario = new ArrayList<>();
        ArrayList<Integer> numsLoteria = new ArrayList<>();
        int [] numAciertos = new int[7];
        
        int resultado;
        for (int i  = 0; i < 1000000; i++){
            
        }


        sc.close();
    }
}
