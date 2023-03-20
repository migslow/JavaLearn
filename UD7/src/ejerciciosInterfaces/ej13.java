package ejerciciosInterfaces;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class ej13 {

	private JFrame frame;
	private JTextField textFieldNum1;
	private JTextField textFieldNum2;
	private JTextField textFieldResultado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ej13 window = new ej13();
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
	public ej13() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblNewLabelNum1 = new JLabel("Num1");
		lblNewLabelNum1.setBounds(10, 47, 46, 14);
		frame.getContentPane().add(lblNewLabelNum1);

		JLabel lblNewLabelNum2 = new JLabel("Num2");
		lblNewLabelNum2.setBounds(10, 72, 46, 14);
		frame.getContentPane().add(lblNewLabelNum2);

		textFieldNum1 = new JTextField();
		textFieldNum1.setBounds(79, 44, 86, 20);
		frame.getContentPane().add(textFieldNum1);
		textFieldNum1.setColumns(10);

		textFieldNum2 = new JTextField();
		textFieldNum2.setColumns(10);
		textFieldNum2.setBounds(79, 69, 86, 20);
		frame.getContentPane().add(textFieldNum2);

		JButton btnNewButtonSuma = new JButton("+");
		btnNewButtonSuma.setBounds(24, 135, 89, 23);
		frame.getContentPane().add(btnNewButtonSuma);
		btnNewButtonSuma.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (e.getSource().equals(btnNewButtonSuma)) {
					Double resultado = Double
							.parseDouble(textFieldNum1.getText()) + Double.parseDouble(textFieldNum2.getText());
					textFieldResultado.setText(resultado.toString());
				}
			}

		});

		JButton btnNewButtonResta = new JButton("-");
		btnNewButtonResta.setBounds(120, 135, 89, 23);
		frame.getContentPane().add(btnNewButtonResta);
		btnNewButtonResta.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if (e.getSource().equals(btnNewButtonResta)) {
					Double resultado = Double.parseDouble(textFieldNum1.getText()) - Double.parseDouble(textFieldNum2.getText());
					textFieldResultado.setText(resultado.toString());
				}
				
			}
		});

		textFieldResultado = new JTextField();
		textFieldResultado.setEditable(false);
		textFieldResultado.setBounds(219, 136, 86, 20);
		frame.getContentPane().add(textFieldResultado);
		textFieldResultado.setColumns(10);
	}

}
