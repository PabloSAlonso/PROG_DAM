package principal;

import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class V1 extends JFrame {
    private JButton btnPulsar;
    
    public V1(){
        super("Ejercicio V1");
        setLayout(new FlowLayout());

        btnPulsar = new JButton("Pulsame");
        btnPulsar.addMouseListener(new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent e) {
                btnPulsar.setLocation((int) (Math.random() * 600) +1 , (int) (Math.random() * 400) + 1);
            }

            @Override
            public void mousePressed(MouseEvent e) {
                
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                
            }

            @Override
            public void mouseExited(MouseEvent e) {
            
            }
            
        });
        this.add(btnPulsar);
    }
}
