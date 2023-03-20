package ejerciciosInterfaces;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class ej14 {

	private JFrame frmIniciarSesion;
	private JTextField textFieldUsuario;
	private JTextField textFieldContraseña;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ej14 window = new ej14();
					window.frmIniciarSesion.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ej14() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmIniciarSesion = new JFrame();
		frmIniciarSesion.setTitle("Iniciar Sesion");
		frmIniciarSesion.setBounds(100, 100, 450, 300);
		frmIniciarSesion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmIniciarSesion.getContentPane().setLayout(null);

		JLabel lblNewLabelUsuario = new JLabel("Usuario");
		lblNewLabelUsuario.setBounds(10, 40, 70, 14);
		frmIniciarSesion.getContentPane().add(lblNewLabelUsuario);

		JLabel lblNewLabelContraseña = new JLabel("Contraseña");
		lblNewLabelContraseña.setBounds(10, 72, 70, 14);
		frmIniciarSesion.getContentPane().add(lblNewLabelContraseña);

		textFieldUsuario = new JTextField();
		textFieldUsuario.setBounds(99, 37, 86, 20);
		frmIniciarSesion.getContentPane().add(textFieldUsuario);
		textFieldUsuario.setColumns(10);

		textFieldContraseña = new JTextField();
		textFieldContraseña.setColumns(10);
		textFieldContraseña.setBounds(99, 69, 86, 20);
		frmIniciarSesion.getContentPane().add(textFieldContraseña);

		JButton btnNewButtonValidar = new JButton("Validar");
		btnNewButtonValidar.setBounds(99, 130, 89, 23);
		frmIniciarSesion.getContentPane().add(btnNewButtonValidar);
		btnNewButtonValidar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String usuario = "dam";
				String contraseña = "1234";
				if(textFieldUsuario.getText().equals(usuario) && textFieldContraseña.getText().equals(contraseña)) {
					setTitle("Validacion Correcta");
				} else {
					setTitle("Validacion Incorrecta");
				}

			}
		});
	}

}
