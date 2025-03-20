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
package boletin5.ejercicio8;

import java.util.ArrayList;
import java.util.Scanner;

public class Coleccion {
    private ArrayList<Videojuego>videojuegos;

    public void insertarVideojuego(){
        
    }

    public void menu(){
        Scanner sc = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("1- Insertar un nuevo videojuego: ");
            System.out.println("2- Visualizar lista de videojuegos: ");
            System.out.println("3- Buscar videojuegos: ");
            System.out.println("4- Eliminar videojuegos por posiciones: ");
            System.out.println("5- Borrar videojuegos de un año determinado: ");
            System.out.println("6- Salir del programa");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    
                    break;
                case 2:
                    
                    break;
                case 3:
                    
                    break;
                case 4:
                    
                    break;
                case 5:
                    
                    break;
                case 6:
                    
                    break;
            
                default:
                    System.out.println("Opcion Invalida");
            }

        } while (opcion != 6);
    }
}
