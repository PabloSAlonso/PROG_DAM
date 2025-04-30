package principal.Ejercicio3;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Colores extends JFrame implements ActionListener{
    private JButton botonAmarillo;
    private JButton botonAzul;
    private JButton botonAleatorio;
    public Colores(){
        //Propiedades básicas ventana
        super("Colores");
        setLayout(null);

        //Boton amarillo
        botonAmarillo = new JButton();
        this.add(botonAmarillo);
        botonAmarillo.addActionListener(this);

        //Boton azul
        botonAzul = new JButton();
        this.add(botonAzul);

        //Boton aleatorio
        botonAleatorio = new JButton();
        this.add(botonAleatorio);

    }
    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }
}
