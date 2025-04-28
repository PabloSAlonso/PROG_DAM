import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Titulo extends JFrame implements ActionListener {
    private JTextField texto;
    private JButton boton;
    private JOptionPane pregunta;
    private JCheckBox alReves;
    private JCheckBox habilitar;

    public Titulo() {
        this.setTitle("Titulooo");

        texto = new JTextField(10);
        this.add(texto);
        texto.addActionListener(this);

        boton = new JButton("Cambiar texto");
        this.add(boton);
        boton.addActionListener(this);

        pregunta = new JOptionPane();

        alReves = new JCheckBox("Dar la vuelta");
        this.add(alReves);

        habilitar = new JCheckBox("Deshabilitar/habilitar textField");
        this.add(habilitar); //TODO acabar segundo textField
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (pregunta.showConfirmDialog(this,"¿Quieres cambiar el titulo?") == JOptionPane.OK_OPTION){
            this.setTitle(texto.getText());
        }
        
        if (alReves.isSelected()){
            String fraseReversa = "";
            for (int i = texto.getText().length() - 1; i >= 0; i--) {
                fraseReversa += texto.getText().charAt(i);
            }
            this.setTitle(fraseReversa);
        }
    }
}
