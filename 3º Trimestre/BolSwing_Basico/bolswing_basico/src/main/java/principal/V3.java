package principal;

import java.awt.FlowLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import javax.swing.JButton;
import javax.swing.JFrame;

public class V3 extends JFrame {
    private JButton btnPulsar;

    public V3() {
        super("Ejercicio V3");
        setLayout(new FlowLayout());

        // boton que cambia posicion al pulsar
        btnPulsar = new JButton("Pulsame");
        btnPulsar.addMouseListener(new MouseHandler());
        btnPulsar.addKeyListener(new KeyHandler());
        this.add(btnPulsar);

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
