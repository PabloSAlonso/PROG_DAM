/*-
 * =====LICENSE-START=====
 * Java 11 Application
 * ------
 * Copyright (C) 2020 - 2025 Organization Name
 * ------
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 * =====LICENSE-END=====
 */
package boletin5.ejercicio1;

public class Aleatorios {
    public static int[] crearAleatorio(int n){
        int listaNums[] = new int [n];
        for (int i = 0; i < n; i++) {
            listaNums[i] = (int) (Math.random() * 4001 + 1000);
        }
        return listaNums;
    }
    public static void mostrarNumeros(int [] numeros){
        for (int numero : numeros) {
            System.out.println(numero);
        }
    }
    public static int numeroMayor(int[] numeros){
        int auxiliar = numeros[0];
        for (int i = 0; i < numeros.length; i++) {
            if (auxiliar < numeros[i]){
                auxiliar = numeros[i];
            }
        }
        return auxiliar;
    }

    public static int numeroMenor(int[] numeros){
        int auxiliar = numeros[0];
        for (int numero : numeros) {
            if(auxiliar > numero){
                auxiliar = numero;
            }
        }
        return auxiliar;
    }

    public static boolean intercambiarDatos(int[]numeros, int n1, int n2){
        int auxiliar;
        if(numeros.length <= n1 || numeros.length <= n2 || n1 < 0|| n2 < 0){
            return false;
        } else{
            auxiliar = numeros[n1];
            numeros[n1] = numeros[n2];
            numeros[n2] = auxiliar;
            return true;
        }
    }
    public static void main(String[] args) {
        int[] lista = crearAleatorio(10);
        mostrarNumeros(lista);
        System.out.println();
        System.out.println(numeroMayor(lista));
        System.out.println(numeroMenor(lista));
        System.out.println(intercambiarDatos(lista, 2, 11));
    }
}

// Ejercicios básicos: No es necesario comentarlos.
// 1. Realiza los métodos estáticos que se citan a continuación. Realiza en el
// programa principal una prueba de los mismos con un vector de tamaño 10 (Ojo, el
// tamaño 10 es solo en el principal, las funciones han de ser genéricas y válidas para
// vectores de cualquier tamaño).
// a) Función que crea y devuelva un vector con n números enteros con valores
// aleatorios entre 1000 y 5000 ambos incluidos ( n es un parámetros de la función).
// b) Función a la que se le pasa un vector cualquiera de números enteros y muestra
// sus elementos por pantalla. Debes usar un for mejorado mostrando elemento a
// elemento.
// c) Función a la que se le pasa un vector cualquiera de enteros (no tiene porque ser
// el del apartado a) y devuelve el valor máximo que contiene. Usa for clásico.
// d) Función a la que se le pasa un vector cualquiera de enteros y devuelve el valor
// mínimo que contiene. Usa for mejorado.
// e) Función a la que se le pasa como par ámetros un vector cualquiera de enteros y
// dos índices (son dos números enteros) e intercambia los datos que hay en las
// posiciones indicadas por los índices. Si hay un error de rango devuelve false si no
// devuelve true. Por ejemplo si se le pasa (v, 2, 5) debe intercambiar los datos v [2]
// con v[5] siempre que existan dichas posiciones.
