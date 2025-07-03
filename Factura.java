package grafica.examen;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Factura extends JFrame{
    private JPanel panel13;
    private JTextField txtcodigo;
    private JTextField txtProducto;
    private JTextField txtCantidad;
    private JTextField txtPrecio;
    private JTextField txtSubtotal;
    private JTextField txtTotal;
    private JButton btnCalcular;
    private JButton btnRegresar;

    public Factura(){
        setTitle("Factura");
        setSize(400,400);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(panel13);
        setLocationRelativeTo(null);


        btnCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String codigo = txtcodigo.getText();
                String producto = txtProducto.getText();
                int cantidad = Integer.parseInt(txtCantidad.getText());
                double precio = Double.parseDouble(txtPrecio.getText());
                double sub = cantidad*precio;
                double total = sub*1.15;
                txtSubtotal.setText(String.valueOf(sub));
                txtTotal.setText(String.valueOf(total));
            }
        });
        btnRegresar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Menu v = new Menu();
                v.setVisible(true);
                setVisible(false);
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new Factura().setVisible(true);
        });
    }
}
