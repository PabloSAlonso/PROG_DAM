package principal.Ejercicio4;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.Scanner;

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
        String ed = edad.trim();
        int edadNum = 0;
        try {
            edadNum = Integer.parseInt(ed);
        } catch (NumberFormatException n) {
            System.out.println("Introduce numeros");
        }

        if (nom.isEmpty() || dir.isEmpty() || edadNum < 0 || ed.isEmpty()) {
            return false;
        } else {
            return true;
        }
    }

    public void escribirArchivo(String nombre, String edad, String direccion) throws Exception {
        FileWriter fw = new FileWriter("archivoFormulario.txt");
        fw.write(nombre + ";" + edad + ";" + direccion);
        fw.close();
    }

    public String[] leerArchivo() throws FileNotFoundException {
        String cadena = "";
        try {
            Scanner sc = new Scanner(new File("ArchivoFormulario.txt"));
            while (sc.hasNext()) {
                String cadenaFinal = sc.nextLine();
                cadena += cadenaFinal.trim();
            }
            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("No existe el archivo");
        }
        return cadena.split(";");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnGuardar) {
            if (validarDatos(txfNombre.getText(), txfEdad.getText(), txfDir.getText()) == false) {
                JOptionPane.showMessageDialog(this, "DATOS NO VÁLIDOS", "ERROR", JOptionPane.ERROR_MESSAGE);
            } else {
                try {
                    escribirArchivo(txfNombre.getText(), txfEdad.getText(), txfDir.getText());
                } catch (Exception e1) {
                }
            }
        }

        if (e.getSource() == btnCargar) {
            try {
                int respuesta = 1;
                String[] lista = leerArchivo();
                if (lista.length != 3) {
                    throw new FileNotFoundException();
                } else if (txfNombre.getText().trim().equals("") || txfEdad.getText().trim().equals("")
                        || txfDir.getText().trim().equals("")) {
                    txfNombre.setText(lista[0]);
                    txfEdad.setText(lista[1]);
                    txfDir.setText(lista[2]);
                } else {
                    respuesta = JOptionPane.showConfirmDialog(this, "Desea borrar los datos anterior¿?", "ALERTA",
                            JOptionPane.YES_NO_OPTION);
                }
                if (respuesta == JOptionPane.YES_OPTION) {
                    txfNombre.setText(lista[0]);
                    txfEdad.setText(lista[1]);
                    txfDir.setText(lista[2]);
                }
            } catch (FileNotFoundException e2) {
            }
        }

    }
}
