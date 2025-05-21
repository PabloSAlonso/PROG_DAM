/*-
 * =====LICENSE-START=====
 * Proyecto de cálculo de Áreas
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
package areas.app.app;

//con "InterfazUsuario" se crea el import que nos indica que vamos a utilizar la carpeta milibreria y el proyecto interfaz...
// import milibreria.InterfazUsuario;
// import milibreria.Areas;
//Con el asterisco indicamos que vamos a utilizar todos los proyectos de la carpeta "milibreria"
import areas.app.milibreria.*;

public class Principal {
  public static void main(String[] args) {
    InterfazUsuario iu = new InterfazUsuario();
    double lado;
    double area;

    System.out.println("Vamos a calcular el área de un pentágono");
    lado = iu.pideRealPositivo("Introduce el lado (debe serpositivo)");

    area = Areas.pentagonoRegular(lado);
    iu.muestraArea(area);
  }
}
