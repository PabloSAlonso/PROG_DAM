import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Titulo extends JFrame implements ActionListener {
    private JTextField texto;
    private JButton boton;
    private JOptionPane pregunta;

    public Titulo() {
        this.setTitle("Titulooo");

        texto = new JTextField(10);
        this.add(texto);
        texto.addActionListener(this);

        boton = new JButton("Cambiar texto");
        this.add(boton);
        boton.addActionListener(this);

        pregunta = new JOptionPane();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (pregunta.showConfirmDialog(this,"¿Quieres cambiar el titulo?") == JOptionPane.OK_OPTION){
            this.setTitle(texto.getText());
        }
        
    }
}
