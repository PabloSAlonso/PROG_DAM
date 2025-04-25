import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.InputMismatchException;

import javax.swing.*;

public class Dado extends JFrame implements ActionListener {
    private JButton boton;
    private JLabel etiqueta;
    private JTextField limite;

    public Dado() {

        // Propiedades Ventana
        this.setTitle("Dados");

        // propiedades boton
        boton = new JButton("Tirar dados");
        this.add(boton);
        boton.addActionListener(this);

        // propiedades etiqueta
        etiqueta = new JLabel();
        this.add(etiqueta);

        // propiedades JTextFieldl
        limite = new JTextField(15);
        this.add(limite);
        limite.addActionListener(this);

    }

    // Metodos
    public int tirarDado(String limite) {
        int num = 0;
        try {
            num = Integer.parseInt(limite);
        } catch (IllegalArgumentException e) {

        } catch (InputMismatchException i) {

        }

        if (num <= 1) {
            return (int) ((Math.random() * 6) + 1);
        } else {
            return (int) ((Math.random() * num) + 1);
        }

    }

    public void actionPerformed(ActionEvent e) {
        etiqueta.setText(String.format("%d", tirarDado(limite.getText())));
    }

}
