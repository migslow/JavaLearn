package Interfaces;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class ej01 {

	private JFrame frame;
	private JTextField textField_base;
	private JTextField textField_altura;
	private JTextField textField_resultado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ej01 window = new ej01();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ej01() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 672, 398);
		frame.getContentPane().setLayout(null);

		JLabel lblNewLabel_base = new JLabel("Base:");
		lblNewLabel_base.setBounds(25, 57, 90, 14);
		frame.getContentPane().add(lblNewLabel_base);

		JLabel lblNewLabel_altura = new JLabel("Altura:");
		lblNewLabel_altura.setBounds(25, 82, 90, 14);
		frame.getContentPane().add(lblNewLabel_altura);

		textField_base = new JTextField();
		textField_base.setBounds(167, 54, 178, 20);
		frame.getContentPane().add(textField_base);
		textField_base.setColumns(10);

		textField_altura = new JTextField();
		textField_altura.setColumns(10);
		textField_altura.setBounds(167, 79, 178, 20);
		frame.getContentPane().add(textField_altura);

		textField_resultado = new JTextField();
		textField_resultado.setEditable(false);
		textField_resultado.setBounds(167, 110, 182, 20);
		frame.getContentPane().add(textField_resultado);
		textField_resultado.setColumns(10);

		JButton btnNewButton_calcular = new JButton("Calcular");
		btnNewButton_calcular.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					if (e.getSource().equals(btnNewButton_calcular)) {
						Double resultado = Double.parseDouble(textField_base.getText())
								* Double.parseDouble(textField_altura.getText()) / 2;
						textField_resultado.setText(resultado.toString());
					}
				} catch (NumberFormatException e2) {
					JOptionPane.showMessageDialog(null,
							"No has introducido un numero entero o real. Vuelve a introducirlo bien", "Error",
							JOptionPane.INFORMATION_MESSAGE);
				}

			}
		});
		btnNewButton_calcular.setBounds(25, 122, 89, 23);
		frame.getContentPane().add(btnNewButton_calcular);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
