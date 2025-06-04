package principal.Ej5;
import java.util.ArrayList;

public class Planeta extends Astro {
    private boolean gaseoso;
    public ArrayList <Astro> satelites;

    public void setGaseoso(boolean gaseoso) {
        this.gaseoso = gaseoso;
    }
    
    public boolean getGaseoso(){
        return this.gaseoso;
    }

    public Planeta(String nombre, double radio,boolean gaseoso){
        // setNombre(nombre);
        // setRadio(radio);
        super(nombre,radio);
        setGaseoso(gaseoso);
        satelites = new ArrayList<>();
    }
    public Planeta(){
        this("",0.0,false);
    }

}
