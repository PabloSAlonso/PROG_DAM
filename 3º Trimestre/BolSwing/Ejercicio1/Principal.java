import java.awt.FlowLayout;
import java.swing.*;

import javax.swing.JFrame;

import org.xml.sax.SAXException;
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
