package boletin5.ejercicio7;
import java.util.Scanner;
import java.util.ArrayList;

public class Primitiva {
    /**
     * Funcion que contiene una colección que vacía al inicio y la rellena con 6 valores aleatorios entre 1 y 49
     * @param coleccion la colección vacía que rellena
     * @return la colección rellenada
     */
    public static void rellenaCol(ArrayList<Integer> coleccion){
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
    }
    /**
     * Funcion que compara los numeros de dos colecciones y va sumando en un acumulador el numero de coincidencias
     * @param numsUsuario La coleccion de numeros introducida por el usuario
     * @param numsLoteria La coleccion de numeros de la loteria
     * @return el recuento de coincidencias
     */
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
    /**
     * 
     * @return
     */
    public static ArrayList<Integer> pedirNums(){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numeroUsuario = new ArrayList<>();
        String lista;
        boolean comprobado = false;
        while (!comprobado){
            numeroUsuario = new ArrayList<>();
            System.out.println("Introduce seis numeros separados por coma: ");
            lista = sc.nextLine();
            String[] listaSeparacion = lista.split(",");

            for (String numero : listaSeparacion){
                numeroUsuario.add(Integer.parseInt(numero));
            }
            comprobado = validarNums(numeroUsuario);
            if (!comprobado) {
                System.out.println("Los números no son validos");
            }
        }
        return numeroUsuario;
    }
    /**
     * Función que comprueba si un numero está entre 1 y 49, en caso de no estarlo lo pide hasta que lo este
     * @param n el numero que se comprueba
     * @return true si es valido en el rango, false si no lo es
     */
    public static boolean comprobarNum(int n){
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        while (n < 1 || n > 49) {
            flag = false;
            System.out.println("Introduce un caracter válido");
            sc.nextInt();
        }
        flag = true;
        sc.close();
        return flag;
    }
    /**
     * 
     * @param numeros
     * @return
     */
    public static boolean validarNums(ArrayList<Integer> numeros){
        int num;
        if (numeros.size() != 6){
            return false;
        }
        for (int i = 0; i < numeros.size(); i++){
            num = numeros.get(i);
            if (comprobarNum(num) == false){
                return false;
            }
            for (int j = i + 1; j < numeros.size(); j++){
                if (num == numeros.get(j)){
                    return false;
                }
            }
        }
        return true;
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
