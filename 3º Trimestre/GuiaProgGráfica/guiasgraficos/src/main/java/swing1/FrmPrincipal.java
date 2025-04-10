package swing1;

import java.awt.*;
import javax.swing.*;

public class FrmPrincipal extends JFrame {
    // Inicializamos la interfaz de usuario en el constructor
    public FrmPrincipal() {
        setLayout(null);
        JLabel etiqueta1 = new JLabel("Etiqueta Uno");
        // etiqueta1.setLocation(0, 0);
        // etiqueta1.setSize(100, 20);
        etiqueta1.setBounds(0, 0, 100, 200); //Permite colocar y dimensaionar en una única linea
        this.add(etiqueta1, BorderLayout.NORTH);

        JLabel etiqueta2 = new JLabel("Etiqueta Dos");
        etiqueta2.setLocation(100, 0);
        etiqueta2.setSize(etiqueta2.getPreferredSize());
        this.add(etiqueta2, BorderLayout.SOUTH);

        JButton boton1 = new JButton("Aceptar");
        boton1.setPreferredSize(new Dimension(200, 110));
        boton1.setLocation(0, 100);
        boton1.setSize(boton1.getPreferredSize());
        this.add(boton1, BorderLayout.EAST);


        JButton boton2 = new JButton("Cancelar");
        boton2.setLocation(100, 100);
        boton2.setSize(100, 20);
        this.add(boton2, BorderLayout.WEST);

    }
}
