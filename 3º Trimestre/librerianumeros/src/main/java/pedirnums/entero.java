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
package pedirnums;

import java.util.InputMismatchException;
import java.util.Scanner;

public class entero {
    public static void pedirRobusto(String mensaje, int minimo, int maximo) {
        Scanner sc = new Scanner(System.in);
        System.out.println(mensaje);
        int cantidad = 0;
        boolean isChecked;
        if (mensaje == null || maximo - minimo < 2 || minimo > maximo || mensaje.equals("")) { //minimo > maximo es innecesario porque maximo - minimo < 2 ya lo comprueba
            sc.close();
            throw new IllegalArgumentException("Parametros incorrectos");
        } else {
            System.out.println("Introduce un numero entero");
            do {
                isChecked = true;
                try {
                    cantidad = sc.nextInt();
                    while (cantidad < minimo || cantidad > maximo) {
                        System.out.println("Introduce un valor dentro del rango");
                        cantidad = sc.nextInt();
                    }
                } catch (InputMismatchException m) {
                    System.out.println("Introduce un caracter valido");
                    sc.nextLine();
                    isChecked = false;
                }
            } while (!isChecked);
            System.out.println("Listo, numero guardado correctamente: " + cantidad);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int minimo;
        do {
            try {
                System.out.println("Introduce el mensaje inicial");
                String mensaje = sc.nextLine();
                System.out.println("Introduce el valor minimo del rango");
                minimo = sc.nextInt();
                System.out.println("Introduce el valor maximo del rango");
                int maximo = sc.nextInt();
                System.out.println("Peticion Iniciada correctamente:");
                System.err.print("Mensaje inicial: ");
                pedirRobusto(mensaje, minimo, maximo);
            } catch (IllegalArgumentException i) {
                System.out.println("Parametro no válido");
                minimo = 0;
            } catch (InputMismatchException e) {
                System.out.println("Parametro no válido");
                minimo = 0;
            } 
        } while (minimo == 0);
        sc.close();
    }
}
