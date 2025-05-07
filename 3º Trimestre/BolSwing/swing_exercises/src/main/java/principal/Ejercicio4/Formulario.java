package principal.Ejercicio4;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
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
        etiquetaNombre.setLocation(0, 0);
        this.add(etiquetaNombre);

        txfNombre = new JTextField(10);
        txfNombre.setSize(100, 50);
        txfNombre.setLocation(105, 0);
        this.add(txfNombre);

        // Edad
        etiquetaEdad = new JLabel("Edad:");
        etiquetaEdad.setSize(100, 50);
        etiquetaEdad.setLocation(210, 0);
        this.add(etiquetaEdad);

        txfEdad = new JTextField(10);
        txfEdad.setSize(100, 50);
        txfEdad.setLocation(315, 0);
        this.add(txfEdad);

        // Dirección
        etiquetaDir = new JLabel("Direccion:");
        etiquetaDir.setSize(100, 50);
        etiquetaDir.setLocation(420, 0);
        this.add(etiquetaDir);

        txfDir = new JTextField(10);
        txfDir.setSize(100, 50);
        txfDir.setLocation(525, 0);
        this.add(txfDir);

        // Guardar
        btnGuardar = new JButton("Guardar");
        btnGuardar.setSize(100, 50);
        btnGuardar.setLocation(0, 55);
        btnGuardar.addActionListener(this);
        this.add(btnGuardar);

        // Cargar
        btnCargar = new JButton("Cargar");
        btnCargar.setSize(100, 50);
        btnCargar.setLocation(105, 55);
        btnCargar.addActionListener(this);
        this.add(btnCargar);

    }

    public boolean validarDatos(String nombre, String edad, String direccion) {
        String nom = nombre.trim();
        String dir = direccion.trim();
        int ed = Integer.parseInt(edad);
        if (nom == "" || dir == "" || ed < 0) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (validarDatos(txfNombre.getText(), txfEdad.getText(), txfDir.getText()) == false){
            JOptionPane.showMessageDialog(this,"DATOS NO VÁLIDOS","ERROR",JOptionPane.ERROR_MESSAGE);;
        } else {
            

        }

    }
}
