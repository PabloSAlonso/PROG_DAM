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

import java.time.LocalDate;

public class Videojuego {
    String titulo;
    String fabricante;
    int año;
    //#region GET
    public String getTitulo(){
        return this.titulo;
    }
    public String getFabricante(){
        return this.fabricante;
    }
    public int getAño(){
        return this.año;
    }
    //#endregion

    //#region SET
    public void setTitulo(){
        this.titulo = titulo.toUpperCase();
    }
    public void setFabricante(){
        this.fabricante = fabricante.toUpperCase();   
    }
    public void setAño(){
        if (año < 1950){
            this.año = LocalDate.now().getYear();
        } else {
            this.año = año;
        }
    }
    //#endregion
}
