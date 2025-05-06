package principal.Ejercicio4;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Formulario extends JFrame implements ActionListener {
    private JTextField txfNombre;
    private JLabel etiquetaNombre;
    private JTextField txfEdad;
    private JLabel etiquetaEdad;
    private JTextField txfDir;
    private JLabel etiquetaDir;
    private JButton btnGuardar;
    private JButton btnCargar;

    public Formulario() {
        super("validaciones");
        setLayout(null);

        // Nombre
        etiquetaNombre = new JLabel("Nombre:");
        etiquetaNombre.setSize(100, 50);
        etiquetaNombre.setLocation(0,0);
        this.add(etiquetaNombre);

        txfNombre = new JTextField(10);
        txfNombre.setSize(100, 50);
        txfNombre.setLocation(105,0);
        this.add(txfNombre);

        // Edad
        etiquetaEdad = new JLabel("Edad:");
        etiquetaEdad.setSize(100, 50);
        etiquetaEdad.setLocation(210,0);
        this.add(etiquetaEdad);

        txfEdad = new JTextField(10);
        txfEdad.setSize(100, 50);
        txfEdad.setLocation(315,0);
        this.add(txfEdad);

        // Dirección
        etiquetaDir = new JLabel("Direccion:");
        etiquetaDir.setSize(100,50);
        etiquetaDir.setLocation(420,0);
        this.add(etiquetaDir);
        
        txfDir = new JTextField(10);
        txfDir.setSize(100,50);
        txfDir.setLocation(525,0);
        this.add(txfDir);

        // Guardar
        btnGuardar = new JButton("Guardar");
        btnGuardar.setSize(100,50);
        btnGuardar.setLocation(0,55);
        this.add(btnGuardar);

        // Cargar
        btnCargar = new JButton("Cargar");
        btnCargar.setSize(100,50);
        btnCargar.setLocation(105,55);
        this.add(btnCargar);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
