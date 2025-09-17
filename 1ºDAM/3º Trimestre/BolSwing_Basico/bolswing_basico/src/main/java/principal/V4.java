package principal;

import java.awt.FlowLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class V4 extends JFrame {
    private JButton btnPulsar;

    public V4() {
        super("Ejercicio V3");
        setLayout(new FlowLayout());

        // boton que cambia posicion al pulsar
        btnPulsar = new JButton("Pulsame");
        btnPulsar.addMouseListener(new MouseHandler());
        btnPulsar.addKeyListener(new KeyHandler());
        this.add(btnPulsar);

        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                int respuesta = JOptionPane.showConfirmDialog(null, "Desea cerrar el programa", "Ejercicio V4", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                if (respuesta == JOptionPane.OK_OPTION) {
                    e.getWindow().dispose();
                    //tmb se podria usar:
                    // System.exit(0);
                }
            }
        });
    }

    // clase interna
    private class MouseHandler extends MouseAdapter {
        @Override
        public void mouseClicked(java.awt.event.MouseEvent e) {
            btnPulsar.setLocation((int) (Math.random() * 600) + 1, (int) (Math.random() * 400) + 1);
        }
    }

    private class KeyHandler extends KeyAdapter {
        @Override
        public void keyPressed(KeyEvent e) {
            if (e.getKeyCode() == KeyEvent.VK_A) {
                btnPulsar.setLocation((int) (Math.random() * 600) + 1, (int) (Math.random() * 400) + 1);
                System.err.println("A pulsada");
            }
        }
    }
}
