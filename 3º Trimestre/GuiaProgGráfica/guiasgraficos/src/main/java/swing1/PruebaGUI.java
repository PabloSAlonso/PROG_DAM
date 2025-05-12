package swing1;
import javax.swing.*;

public class PruebaGUI {
    public static void main(String[] args) {
        // FrmPrincipal frame = new FrmPrincipal();
        EventosTeclado frame = new EventosTeclado();
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        
    }
}
