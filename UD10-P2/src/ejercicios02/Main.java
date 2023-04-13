package ejercicios02;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.SQLException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Main extends JFrame implements ActionListener {

	static ControlAcceso bd = new ControlAcceso();

	Container panel;
	JLabel jl_user, jl_password, jl_candadoAbierto, jl_candadoCerrado, jl_comentario;
	JPasswordField jpf_password;
	JTextField jtf_textuser;
	JButton jb_aceptar;

	public Main() {
		panel = getContentPane();
		panel.setLayout(null);

		// JLabel
		jl_user = new JLabel("Usuario: ");
		jl_user.setBounds(20, 20, 80, 20);
		panel.add(jl_user);
		jl_password = new JLabel("Contraseña: ");
		jl_password.setBounds(20, 60, 80, 20);
		panel.add(jl_password);

		// Imagen 1
		jl_candadoAbierto = new JLabel();
		jl_candadoAbierto.setBounds(140, 110, 95, 130);
		ImageIcon iconoCandado1 = new ImageIcon("Imagenes/candado_abierto.png");
		jl_candadoAbierto.setIcon(iconoCandado1);
		jl_candadoAbierto.setVisible(false);
		panel.add(jl_candadoAbierto);

		// Imagen 2
		jl_candadoCerrado = new JLabel();
		jl_candadoCerrado.setBounds(140, 110, 95, 130);
		ImageIcon iconoCandado2 = new ImageIcon("Imagenes/candado_cerrado.png");
		jl_candadoCerrado.setIcon(iconoCandado2);
		jl_candadoCerrado.setVisible(true);
		panel.add(jl_candadoCerrado);

		// Comentario
		jl_comentario = new JLabel();
		jl_comentario.setBounds(20, 280, 200, 20);
		panel.add(jl_comentario);

		// JPasswordField
		jpf_password = new JPasswordField();
		jpf_password.setBounds(100, 60, 100, 20);
		panel.add(jpf_password);

		// JTextField
		jtf_textuser = new JTextField();
		jtf_textuser.setBounds(100, 20, 100, 20);
		panel.add(jtf_textuser);

		// JButton
		jb_aceptar = new JButton("Aceptar");
		jb_aceptar.setBounds(250, 40, 80, 20);
		panel.add(jb_aceptar);
		jb_aceptar.addActionListener(this);

		setSize(500, 500);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

	}

	public static void main(String[] args) {
		Main ventana = new Main();
		try {
			bd.conectar();
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println("No se pudo conectar a la base de datos.");
			System.exit(-1);
		}

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource().equals(jb_aceptar)) {
			if (jtf_textuser.getText().isEmpty() || jpf_password.getText().isEmpty()) {
				JOptionPane.showMessageDialog(null, "Debe completar los dos campos", "Mensaje",
						JOptionPane.INFORMATION_MESSAGE);

			}
			try {
				if (bd.equals(bd.comprobarCredenciales(jtf_textuser.getText(), jl_password.getText()))) {
					jl_comentario.setText("Bienvenido/a " + jtf_textuser.getText());
				}
			} catch (SQLException e1) {
				e1.printStackTrace();
			}

		}
	}

}
