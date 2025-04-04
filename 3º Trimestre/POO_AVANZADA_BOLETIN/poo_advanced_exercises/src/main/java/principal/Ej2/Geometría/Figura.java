package principal.Ej2.Geometría;

import java.util.InputMismatchException;
import java.util.Scanner;

import principal.Ej2.Interfaz.InterfazUsuario;
import principal.Ej2.Interfaz.Libreria;

public class Figura implements InterfazUsuario{
    protected Punto origen;
    protected String nombre;
    //#region SET Y GET
    public void setNombre(String nombre) {
        this.nombre = nombre.toUpperCase().trim();
    }
    public void setOrigen(Punto origen) {
        this.origen = origen;
    }
    public String getNombre() {
        return nombre;
    }
    public Punto getOrigen() {
        return origen;
    }

    
    //#endregion

    //#region CONSTRUCTORES
    public Figura(Punto origen,String nombre){
        setOrigen(origen);
        setNombre(nombre);
    }
    public Figura(){
        this(new Punto(),"");
    }
    //#endregion
    //#region FUNCIONES
    @Override
    public void pedirDatos(){
        Scanner sc = new Scanner(System.in);
        double x;
        double y;
        try {
            nombre = sc.nextLine();
        } catch (IllegalArgumentException i){
            System.out.println("Introduce un nombre váido");
        } catch (InputMismatchException m){
            System.out.println("Introduce un caracter válido");
        }
        System.out.println("Introduce la X");
        x = Libreria.pedirReal();
        System.out.println("Introduce la Y");
        y = Libreria.pedirReal();
        origen = new Punto(x, y);
        sc.close();
    }
    @Override
    public void muestraDatos(){
        System.out.println(nombre);
        System.out.println(origen);
    }
    //#endregion
}
