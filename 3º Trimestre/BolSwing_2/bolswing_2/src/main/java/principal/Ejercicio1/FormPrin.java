package principal.Ejercicio1;

import java.awt.FlowLayout;
import java.text.Normalizer.Form;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class FormPrin extends JFrame {
    private JButton boton1;
    private JButton boton2;
    private JLabel etiqueta1;

    public FormPrin(){
        super(" Control de Ratón");
        setLayout(null);

        // Dar valores
        boton1 = new JButton();
        boton1.setSize(100,50);
        this.add(boton1);
        
        boton2 = new JButton();
        boton2.setSize(100,50);
        this.add(boton2);
        
        etiqueta1 = new JLabel("Teclas");
        etiqueta1.setSize(100,50);
        this.add(etiqueta1);
    }
}
