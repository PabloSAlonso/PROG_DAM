package swing1;
import javax.swing.*;

public class PruebaGUI {
    public static void main(String[] args) {
        FrmPrincipal frame = new FrmPrincipal();
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        
        FrmPrincipal frame2 = new FrmPrincipal();
        frame2.setSize(300, 300);
        frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame2.setVisible(true);
    }
}
