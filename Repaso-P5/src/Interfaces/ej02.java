package Interfaces;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;

public class ej02 {

	private JFrame frmIniciarSesion;
	private JTextField textField_usuario;
	private JPasswordField passwordField_contraseña;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ej02 window = new ej02();
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
	public ej02() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmIniciarSesion = new JFrame();
		frmIniciarSesion.setTitle("Iniciar Sesion");
		frmIniciarSesion.getContentPane().setLayout(null);

		JLabel lblNewLabel_usuario = new JLabel("Usuario:");
		lblNewLabel_usuario.setBounds(34, 44, 106, 14);
		frmIniciarSesion.getContentPane().add(lblNewLabel_usuario);

		JLabel lblContrasea = new JLabel("Contraseña:");
		lblContrasea.setBounds(34, 87, 106, 14);
		frmIniciarSesion.getContentPane().add(lblContrasea);

		textField_usuario = new JTextField();
		textField_usuario.setBounds(226, 41, 128, 20);
		frmIniciarSesion.getContentPane().add(textField_usuario);
		textField_usuario.setColumns(10);

		passwordField_contraseña = new JPasswordField();
		passwordField_contraseña.setBounds(226, 84, 128, 20);
		frmIniciarSesion.getContentPane().add(passwordField_contraseña);

		JButton btnNewButton_validar = new JButton("Validar");
		btnNewButton_validar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String usuario = "dam";
				String contraseña = "1234";
				if (textField_usuario.getText().equals(usuario)
						&& passwordField_contraseña.getText().equals(contraseña)) {
					frmIniciarSesion.setTitle("Validacion correcta");
				} else {
					frmIniciarSesion.setTitle("Validacion incorrecta");
				}

			}
		});
		btnNewButton_validar.setBounds(245, 153, 89, 23);
		frmIniciarSesion.getContentPane().add(btnNewButton_validar);
		frmIniciarSesion.setBounds(100, 100, 809, 408);
		frmIniciarSesion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
