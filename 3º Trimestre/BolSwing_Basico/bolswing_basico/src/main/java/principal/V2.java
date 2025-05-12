package principal;

import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;
import javax.swing.JButton;
import javax.swing.JFrame;

public class V2 extends JFrame {
    private JButton btnPulsar;

    public V2() {
        super("Ejercicio V2");
        setLayout(new FlowLayout());

        //boton que cambia posicion al pulsar
        btnPulsar = new JButton("Pulsame");
        btnPulsar.addMouseListener(new MouseHandler());
        this.add(btnPulsar);
    }

    //clase interna
    private class MouseHandler extends MouseAdapter {
        @Override
        public void mouseClicked(java.awt.event.MouseEvent e) {
            btnPulsar.setLocation((int) (Math.random() * 600) +1 , (int) (Math.random() * 400) + 1);
        }
    }
}
