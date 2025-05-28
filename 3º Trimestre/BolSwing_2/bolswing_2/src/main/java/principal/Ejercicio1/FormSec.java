package principal.Ejercicio1;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.File;

import javax.swing.Action;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class FormSec extends JDialog implements ActionListener, ItemListener {
    private JComboBox<String> cboArchivos;
    private JTextArea txtArea1;

    public FormSec(FormPrin f) {
        // Propiedades básicas del Form
        super(f, true);
        setLayout(new FlowLayout());
        setTitle("Formulario Secundario");

        // directorio usuario
        String directorio = System.getProperty("user.home");
        File archivos = new File(directorio);
        String[] conjuntoDirectorios = archivos.list();
        long tamañoArchivos = archivos.length();

        cboArchivos = new JComboBox<String>(conjuntoDirectorios);
        cboArchivos.setLocation(20, 20);
        cboArchivos.setSize(200, 30);
        add(cboArchivos);
        cboArchivos.addActionListener(this);
        cboArchivos.addItemListener(this);

        // txtfield
        txtArea1 = new JTextArea();
        txtArea1.setLocation(240, 20);
        txtArea1.setSize(150, 30);
        add(txtArea1);

    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        txtArea1.setText(String.format("Tamaño: %d", cboArchivos));
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (!txtArea1.getText().trim().equals("")) {
            cboArchivos.addItem(txtArea1.getText());
        }
    }
}
