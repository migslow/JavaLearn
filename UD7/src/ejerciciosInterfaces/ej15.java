package ejerciciosInterfaces;

import java.awt.EventQueue;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class ej15 {

	private JFrame frmCalculadora;
	private JTextField textFieldDato1;
	private JTextField textFieldDato2;
	private JTextField textFieldResultado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ej15 window = new ej15();
					window.frmCalculadora.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ej15() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCalculadora = new JFrame();
		frmCalculadora.setTitle("Calculadora");
		frmCalculadora.setBounds(100, 100, 502, 588);
		frmCalculadora.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCalculadora.getContentPane().setLayout(null);

		JLabel lblNewLabelDato1 = new JLabel("Dato1:");
		lblNewLabelDato1.setBounds(29, 129, 76, 14);
		frmCalculadora.getContentPane().add(lblNewLabelDato1);

		JLabel lblNewLabelDato2 = new JLabel("Dato2:");
		lblNewLabelDato2.setBounds(29, 155, 90, 14);
		frmCalculadora.getContentPane().add(lblNewLabelDato2);

		JLabel lblNewLabelResultado = new JLabel("Resultado");
		lblNewLabelResultado.setBounds(29, 180, 76, 14);
		frmCalculadora.getContentPane().add(lblNewLabelResultado);

		textFieldDato1 = new JTextField();
		textFieldDato1.setBounds(99, 126, 86, 20);
		frmCalculadora.getContentPane().add(textFieldDato1);
		textFieldDato1.setColumns(10);

		textFieldDato2 = new JTextField();
		textFieldDato2.setColumns(10);
		textFieldDato2.setBounds(99, 152, 86, 20);
		frmCalculadora.getContentPane().add(textFieldDato2);

		textFieldResultado = new JTextField();
		textFieldResultado.setEditable(false);
		textFieldResultado.setColumns(10);
		textFieldResultado.setBounds(99, 177, 86, 20);
		frmCalculadora.getContentPane().add(textFieldResultado);

		JButton btnNewButtonSuma = new JButton("+");
		btnNewButtonSuma.setBounds(195, 125, 89, 23);
		frmCalculadora.getContentPane().add(btnNewButtonSuma);
		btnNewButtonSuma.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (e.getSource().equals(btnNewButtonSuma)) {
					Double resultado = Double.parseDouble(textFieldDato1.getText())
							+ Double.parseDouble(textFieldDato2.getText());
					textFieldResultado.setText(resultado.toString());
				}

			}
		});

		JButton btnNewButtonResta = new JButton("-");
		btnNewButtonResta.setBounds(195, 151, 89, 23);
		frmCalculadora.getContentPane().add(btnNewButtonResta);
		btnNewButtonResta.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (e.getSource().equals(btnNewButtonResta)) {
					Double resultado = Double.parseDouble(textFieldDato1.getText())
							- Double.parseDouble(textFieldDato2.getText());
					textFieldResultado.setText(resultado.toString());
				}

			}
		});

		JButton btnNewButtonMulti = new JButton("*");
		btnNewButtonMulti.setBounds(195, 176, 89, 23);
		frmCalculadora.getContentPane().add(btnNewButtonMulti);
		btnNewButtonMulti.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (e.getSource().equals(btnNewButtonMulti)) {
					Double resultado = Double.parseDouble(textFieldDato1.getText())
							* Double.parseDouble(textFieldDato2.getText());
					textFieldResultado.setText(resultado.toString());
				}

			}
		});

		JButton btnNewButtonDiv = new JButton("/");
		btnNewButtonDiv.setBounds(195, 201, 89, 23);
		frmCalculadora.getContentPane().add(btnNewButtonDiv);
		btnNewButtonDiv.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (e.getSource().equals(btnNewButtonDiv)) {
					Double resultado = Double.parseDouble(textFieldDato1.getText())
							/ Double.parseDouble(textFieldDato2.getText());
					textFieldResultado.setText(resultado.toString());
				}

			}
		});

		JLabel imagenCalculadora = new JLabel();
		imagenCalculadora.setBounds(84, 22, 200, 80);
		frmCalculadora.getContentPane().add(imagenCalculadora);
		ImageIcon iconoCalculadora = new ImageIcon("Imagenes/calculadora.jpg");
		imagenCalculadora.setIcon(iconoCalculadora);

	}
}
