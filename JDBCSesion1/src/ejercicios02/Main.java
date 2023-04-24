package ejercicios02;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
		super("Control de Acceso Curso 2022- 2023");
		panel = getContentPane();
		panel.setLayout(null);

		// JLabel
		// USUARIO
		jl_user = new JLabel("Usuario: ");
		jl_user.setBounds(20, 20, 80, 20);
		panel.add(jl_user);
		// CONTRASEÑA
		jl_password = new JLabel("Contraseña: ");
		jl_password.setBounds(20, 60, 80, 20);
		panel.add(jl_password);
		// IMAGEN CANDADO ABIERTO
		jl_candadoAbierto = new JLabel("");
		jl_candadoAbierto.setIcon(new ImageIcon("./imagenes/candado_abierto.png"));
		jl_candadoAbierto.setBounds(171, 119, 111, 131);
		panel.add(jl_candadoAbierto);
		jl_candadoAbierto.setVisible(false);
		// IGEN CANDADO CERRADO
		jl_candadoCerrado = new JLabel("");
		jl_candadoCerrado.setIcon(new ImageIcon("./imagenes/candado_cerrado.png"));
		jl_candadoCerrado.setBounds(171, 119, 111, 131);
		panel.add(jl_candadoCerrado);
		// COMENTARIO
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
		if (jtf_textuser.getText().isEmpty() || jpf_password.getText().isEmpty())
			JOptionPane.showMessageDialog(null, "DEBE COMPLETAR LOS DOS CAMPOS", "Mensaje", JOptionPane.ERROR_MESSAGE);
		else {
			try {
				jl_comentario.setText(bd.comprobarCredenciales(jtf_textuser.getText(), jpf_password.getText()));
			} catch (SQLException e1) {
				System.out.println("Usuario o contraseñas incorrectos");

			}
			;

			try {
				if (bd.res.getString(3)
						.equals(bd.comprobarCredenciales(jtf_textuser.getText(), jpf_password.getText()))) {
					jl_candadoAbierto.setIcon(new ImageIcon("./imagenes/candado_abierto.png"));
					jl_candadoAbierto.setVisible(true);
					jl_candadoCerrado.setVisible(false);
				}

			} catch (SQLException e1) {
				System.out.println("Usuario o contraseña incorrectos");
				jl_candadoCerrado.setIcon(new ImageIcon("./imagenes/candado_cerrado.png"));
			}
		}
	}

}
