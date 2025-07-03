package grafica.examen;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Inicio extends JFrame {
    private JButton btnIniciar;
    private JPanel panel10;
    private JButton btnLimpiar;
    private JTextField txtUser;
    private JPasswordField txtPassword;

    public Inicio(){
        setTitle("Login");
        setSize(400,200);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(panel10);
        setLocationRelativeTo(null);


        btnIniciar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String user = txtUser.getText();
                String password = new String(txtPassword.getPassword());

                // Validación básica
                if (user.equals("admin") && password.equals("12345")) {
                    JOptionPane.showMessageDialog(Inicio.this, "¡Login exitoso!");

                    Menu v =new Menu();
                    v.setVisible(true);
                    setVisible(false);

                    // Aquí podrías abrir otra ventana o cerrar esta
                } else {
                    JOptionPane.showMessageDialog(Inicio.this, "Usuario o contraseña incorrectos.", "Error", JOptionPane.ERROR_MESSAGE);
                }

            }
        });

        btnLimpiar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Limpiar campos
                txtUser.setText("");
                txtPassword.setText("");

                // Enfocar en el campo de usuario
                txtUser.requestFocus();
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new Inicio().setVisible(true);
        });
    }
}
