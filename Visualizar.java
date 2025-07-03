package grafica.examen;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Visualizar extends JFrame{
    private JPanel panel14;
    private JButton btnRegresar;
    private JTextField txtCodigo;
    private JTextField txtNombre;
    private JTextField txtDetalle;
    private JTextField txtStock;

    public Visualizar(){
        setTitle("Mostar");
        setSize(400,300);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(panel14);
        setLocationRelativeTo(null);


        btnRegresar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Menu v  = new Menu();
                v.setVisible(true);
                setVisible(false);
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new Visualizar().setVisible(true);
        });
    }
}

