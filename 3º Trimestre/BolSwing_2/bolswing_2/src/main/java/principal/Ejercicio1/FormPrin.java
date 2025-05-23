package principal.Ejercicio1;

import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseMotionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class FormPrin extends JFrame {
    private JButton boton1;
    private JButton boton2;
    private JLabel etiqueta1;

    public FormPrin() {
        super("Control de Ratón");
        setLayout(null);
        this.getContentPane().addMouseMotionListener(new MouseEvent());

        // Dar valores
        boton1 = new JButton();
        boton1.setSize(100,50);
        boton1.setLocation(0,0);
        this.add(boton1);
        
        boton2 = new JButton();
        boton2.setSize(100,50);
        boton2.setLocation(105,0);
        this.add(boton2);
        
        etiqueta1 = new JLabel("Teclas");
        etiqueta1.setSize(100,50);
        etiqueta1.setLocation(210,0);
        this.add(etiqueta1);
    }
    private class MouseEvent extends MouseAdapter{
        @Override
        public void mouseMoved(java.awt.event.MouseEvent e) {
            
        }
    }


}
