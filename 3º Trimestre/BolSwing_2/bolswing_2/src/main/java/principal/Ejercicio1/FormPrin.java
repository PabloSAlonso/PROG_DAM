package principal.Ejercicio1;

import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseMotionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class FormPrin extends JFrame implements MouseMotionListener {
    private JButton boton1;
    private JButton boton2;
    private JLabel etiqueta1;

    public FormPrin() {
        super("Control de Ratón");
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

        JOptionPane formulario = new JOptionPane();
        // formulario.add();
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'mouseDragged'");
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        System.err.println("Raton movido");
        FormPrin.this.setTitle("getTitle()");
    }

}
