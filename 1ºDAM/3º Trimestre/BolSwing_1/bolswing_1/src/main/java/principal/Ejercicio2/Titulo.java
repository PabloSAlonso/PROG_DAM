package principal.Ejercicio2;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Titulo extends JFrame implements ActionListener, ItemListener {
    private JTextField texto;
    private JButton boton;
    private JCheckBox alReves;
    private JCheckBox habilitarCheck;

    public Titulo() {
        //Propiedades ventana
        this.setTitle("Titulooo");
        this.setLayout(new FlowLayout());

        //Etiqueta para nuevo titulo
        texto = new JTextField(10);
        this.add(texto);
        texto.addActionListener(this);

        //Boton para accionar el cambio de titulo
        boton = new JButton("Cambiar texto");
        this.add(boton);
        boton.addActionListener(this);

        //Mensaje de aceptar cambiar titulo --> No hace falta acceder asi, es estática
        //preguntaConfirmacion = new JOptionPane();

        //Check para devolver titulo al reves
        alReves = new JCheckBox("Dar la vuelta");
        this.add(alReves);

        //Check para deshabilitar el textfield
        habilitarCheck = new JCheckBox("Deshabilitar/habilitar textField");
        this.add(habilitarCheck);
        habilitarCheck.setSelected(true);
        habilitarCheck.addItemListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (JOptionPane.showConfirmDialog(this, String.format("¿Quieres poner el título \"%s\"?", texto.getText()),"CONFIRMACION",JOptionPane.YES_NO_OPTION) == JOptionPane.OK_OPTION) {
            this.setTitle(texto.getText());
        }
        if (alReves.isSelected()) {
            String aux = "";
            for (int i = texto.getText().length() - 1; i >= 0; i--) {
                aux += texto.getText().charAt(i);
            }
            this.setTitle(aux);
        }

    }
    @Override
    public void itemStateChanged(ItemEvent e) {
        texto.setEnabled(habilitarCheck.isSelected());
    }
    
}
