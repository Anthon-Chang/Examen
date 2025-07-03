package grafica.examen;

import ficheros.clases.Escritura;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Productos extends JFrame{
    private JButton btnGuardar;
    private JPanel panel12;
    private JButton btnLimpiar;
    private JTextField txtCodigo;
    private JTextField txtNombre;
    private JTextField txtDetalle;
    private JTextField txtPrecio;
    private JTextField txtStock;

    private String codigo;
    private String nombre;
    private String detalle;
    private double precio;
    private int stock;
/*
    class datos{
        String codigo;
        String nombre;
        String detalle;
        String precio;
        String stock;

        public datos(String codigo, String nombre, String detalle, String precio, String stock) {
            this.codigo = codigo;
            this.nombre = nombre;
            this.detalle = detalle;
            this.precio = precio;
            this.stock = stock;
        }
    }
 */

    @Override
    public String toString() {
        return codigo + '\'' +
                nombre + '\'' +
                detalle + '\'' +
                precio +
                stock
                ;
    }

    public Productos() {
        setTitle("Producto");
        setSize(400, 300);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(panel12);
        setLocationRelativeTo(null);
        btnGuardar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String codigo = txtCodigo.getText();
                String nombre = txtNombre.getText();
                String detalle = txtDetalle.getText();
                String precio = txtPrecio.getText();
                String stock = txtStock.getText();


                JFileChooser fileChooser = new JFileChooser();
                fileChooser.setDialogTitle("Guardar producto como:");

                int seleccion = fileChooser.showSaveDialog(Productos.this);
                if (seleccion == JFileChooser.APPROVE_OPTION) {
                    String ruta = fileChooser.getSelectedFile().getAbsolutePath();

                    Escritura es = new Escritura();
                    es.escribirFichero(toString(), ruta);
                    JOptionPane.showMessageDialog(Productos.this, "Archivo guardado en:\n" + ruta);
                }
            }
        });
        btnLimpiar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtCodigo.setText("");
                txtNombre.setText("");
                txtPrecio.setText("");
                txtDetalle.setText("");
                txtStock.setText("");
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new Productos().setVisible(true);
        });
    }
}
