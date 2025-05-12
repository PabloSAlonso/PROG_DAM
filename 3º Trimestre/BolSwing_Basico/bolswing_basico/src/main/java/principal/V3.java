package principal;

import java.awt.FlowLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import javax.swing.JButton;
import javax.swing.JFrame;
//TODO sin acabar

public class V3 extends JFrame implements KeyListener {
    private JButton btnPulsar;

    public V3() {
        super("Ejercicio V3");
        setLayout(new FlowLayout());

        // boton que cambia posicion al pulsar
        btnPulsar = new JButton("Pulsame");
        btnPulsar.addMouseListener(new MouseHandler());
        this.add(btnPulsar);
        addKeyListener(this);
        
    }

    // clase interna
    private class MouseHandler extends MouseAdapter {
        @Override
        public void mouseClicked(java.awt.event.MouseEvent e) {
            btnPulsar.setLocation((int) (Math.random() * 600) + 1, (int) (Math.random() * 400) + 1);
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'keyTyped'");
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            btnPulsar.setLocation((int) (Math.random() * 600) + 1, (int) (Math.random() * 400) + 1);
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'keyReleased'");
    }

}
