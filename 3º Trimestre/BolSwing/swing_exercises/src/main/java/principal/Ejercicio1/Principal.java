package principal.Ejercicio1;

import java.awt.FlowLayout;
import javax.swing.JFrame;

public class Principal {
    public static void main(String[] args) {
        Dado dado = new Dado();
        
        //Propiedades dado
        dado.setVisible(true);
        dado.setSize(500, 500);
        dado.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        dado.setLayout(new FlowLayout());
    }
}
