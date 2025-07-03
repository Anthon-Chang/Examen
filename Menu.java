package grafica.examen;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu extends JFrame{
    private JPanel panel11;
    private JButton btnRegistro;
    private JButton btnVentas;
    private JButton vbtnProductos;

    public Menu() {
        setTitle("Menu");
        setSize(400, 200);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(panel11);
        setLocationRelativeTo(null);
        btnRegistro.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Productos v = new Productos();
                v.setVisible(true);
                setVisible(false);
            }
        });
        btnVentas.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Factura v = new Factura();
                v.setVisible(true);
                setVisible(false);
            }
        });
        vbtnProductos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Visualizar v = new Visualizar();
                v.setVisible(true);
                setVisible(false);
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new Menu().setVisible(true);
        });
    }
}

