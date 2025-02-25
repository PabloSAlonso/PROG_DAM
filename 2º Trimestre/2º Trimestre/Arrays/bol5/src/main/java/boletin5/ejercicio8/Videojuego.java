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
