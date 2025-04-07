package swing1;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class FrmPrincipal extends JFrame {
    // Inicializamos la interfaz de usuario en el constructor
    public FrmPrincipal() {
        // Llamando a super podemos inicializar el título de la ventana
        super("The Sultans of Swing");
        // Creamos una “Etiqueta de texto” y especificamos su toolTip
        JLabel label = new JLabel("La aplicación perfecta");
        label.setToolTipText("Esto es un componente JLabel");
        // Incluímos la JLabel en la colección de componentes de la ventana
        this.add(label);
    }
}

