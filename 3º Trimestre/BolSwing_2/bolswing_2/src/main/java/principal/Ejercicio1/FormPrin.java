package principal.Ejercicio1;

import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.MouseAdapter;
import java.text.Normalizer.Form;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class FormPrin extends JFrame {
    // Instauramos componentes
    private JButton boton1;
    private JButton boton2;
    private JLabel etiqueta1;

    public FormPrin() {
        // Propiedades básicas del formulario
        super("Control de Ratón");
        setLayout(null);

        // Añadimos el evento de mover el raton sin incluir los bordes de
        // la ventana.
        this.getContentPane().addMouseMotionListener(new MouseEvent());
        this.getContentPane().addMouseListener(new MouseEvent());
        this.addKeyListener(new KeyEvent());
        this.setFocusable(true);

        // Inicializamos componentes
        boton1 = new JButton("boton izquierdo");
        boton1.setSize(100, 50);
        boton1.setLocation(50, 0);
        boton1.addMouseMotionListener(new MouseEvent());
        boton1.addMouseListener(new MouseEvent());
        boton1.addKeyListener(new KeyEvent());
        this.add(boton1);

        boton2 = new JButton("boton derecho");
        boton2.setSize(100, 50);
        boton2.setLocation(155, 0);
        boton2.addMouseMotionListener(new MouseEvent());
        boton2.addMouseListener(new MouseEvent());
        boton2.addKeyListener(new KeyEvent());
        this.add(boton2);

        etiqueta1 = new JLabel("Teclas");
        etiqueta1.setSize(200, 50);
        etiqueta1.setLocation(265, 0);
        this.add(etiqueta1);
    }

    private class MouseEvent extends MouseAdapter {
        @Override
        public void mouseMoved(java.awt.event.MouseEvent e) {
            FormPrin.this.setTitle("Control de Ratón - X: " + e.getX() + " Y:" + e.getY());
        }

        @Override
        public void mouseExited(java.awt.event.MouseEvent e) {
            FormPrin.this.setTitle("Sin cordenadas");
            System.err.println("Fuera de elemento");
        }

        @Override
        public void mouseEntered(java.awt.event.MouseEvent e) {
            FormPrin.this.setTitle("Control de Ratón");
            System.err.println("Dentro de elemento");
        }

        @Override
        public void mousePressed(java.awt.event.MouseEvent e) {
            if (e.getButton() == java.awt.event.MouseEvent.BUTTON1) {
                boton1.setBackground(Color.GREEN);
            }
            if (e.getButton() == java.awt.event.MouseEvent.BUTTON3) {
                boton2.setBackground(Color.YELLOW);
            }
        }

        @Override
        public void mouseReleased(java.awt.event.MouseEvent e) {
            if (e.getButton() == java.awt.event.MouseEvent.BUTTON1) {
                boton1.setBackground(null);
            }
            if (e.getButton() == java.awt.event.MouseEvent.BUTTON3) {
                boton2.setBackground(null);
            }
        }
    }

    private class KeyEvent extends KeyAdapter {
        @Override
        public void keyPressed(java.awt.event.KeyEvent e) {
            etiqueta1.setText(String.format("Letra: %c y Unicode: %d", e.getKeyChar(), e.getKeyCode()));
            if(e.isControlDown() && e.getKeyCode() == java.awt.event.KeyEvent.VK_C){
                //TODO meter formulario secundario
            }
        }

        @Override
        public void keyReleased(java.awt.event.KeyEvent e) {
            etiqueta1.setText("Teclas:");
        }
    }
}
