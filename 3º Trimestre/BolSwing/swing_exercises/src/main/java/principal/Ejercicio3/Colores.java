package principal.Ejercicio3;
import java.awt.Color;
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
        botonAmarillo = new JButton("Amarillo");
        botonAmarillo.setSize(200, 100);
        botonAmarillo.setLocation(0,0);
        this.add(botonAmarillo);
        botonAmarillo.addActionListener(this);

        //Boton azul
        botonAzul = new JButton("Azul");
        botonAzul.setSize(200,100);
        botonAzul.setLocation(205,0);
        this.add(botonAzul);
        botonAzul.addActionListener(this);

        //Boton aleatorio
        botonAleatorio = new JButton("Aleatorio");
        botonAleatorio.setSize(200,100);
        botonAleatorio.setLocation(410,0);
        this.add(botonAleatorio);
        botonAleatorio.addActionListener(this);

    }
    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == botonAmarillo){
            this.getContentPane().setBackground(Color.YELLOW);

        } else if (e.getSource() == botonAzul){
            this.getContentPane().setBackground(Color.BLUE);

        } else if (e.getSource() == botonAleatorio && (e.getModifiers() & e.SHIFT_MASK) == e.SHIFT_MASK){
            botonAleatorio.setLocation(((int)(Math.random() * 480) + 1),(int)(Math.random() * 600 + 1));
        }
        else if (e.getSource() == botonAleatorio){
            this.setLocation(((int)(Math.random() * 480) + 1),(int)(Math.random() * 600 + 1));
        }

    }
}
