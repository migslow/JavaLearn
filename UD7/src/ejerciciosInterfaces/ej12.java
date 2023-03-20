package ejerciciosInterfaces;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Color;

public class ej12 {

	private JFrame frame;
	private JTextField textFieldBase;
	private JTextField textFieldAltura;
	private JTextField textFieldResultado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ej12 window = new ej12();
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
	public ej12() {
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

		JLabel lblBase = new JLabel("Base");
		lblBase.setBounds(25, 44, 46, 14);
		frame.getContentPane().add(lblBase);

		JLabel lblAltura = new JLabel("Altura");
		lblAltura.setBounds(25, 72, 46, 14);
		frame.getContentPane().add(lblAltura);

		textFieldBase = new JTextField();
		textFieldBase.setBounds(79, 41, 86, 20);
		frame.getContentPane().add(textFieldBase);
		textFieldBase.setColumns(10);

		textFieldAltura = new JTextField();
		textFieldAltura.setColumns(10);
		textFieldAltura.setBounds(79, 69, 86, 20);
		frame.getContentPane().add(textFieldAltura);

		JButton btnArea = new JButton("Area");
		btnArea.setBounds(76, 116, 89, 23);
		frame.getContentPane().add(btnArea);
		btnArea.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (e.getSource().equals(btnArea)) {
					Double resultado = Double.parseDouble(textFieldBase.getText())
							* Double.parseDouble(textFieldAltura.getText()) / 2;
					textFieldResultado.setText(resultado.toString());
				}

			}

		});

		textFieldResultado = new JTextField();
		textFieldResultado.setForeground(new Color(255, 0, 0));
		textFieldResultado.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldResultado.setBounds(175, 117, 86, 20);
		frame.getContentPane().add(textFieldResultado);
		textFieldResultado.setColumns(10);
		textFieldResultado.setEditable(false);
	}
}
