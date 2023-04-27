package Examen_5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Pregunta6 extends JFrame {
	Container panel;
	JButton btnComprobar;
	JTextField txtExpresion;
	JLabel lbl1;

	public Pregunta6() {

		panel = getContentPane();
		panel.setLayout((null));
		lbl1 = new JLabel("Expresi�n");

		lbl1.setBounds(50, 20, 60, 20);
		panel.add(lbl1);

		txtExpresion = new JTextField(5);
		txtExpresion.setBounds(120, 20, 90, 20);
		panel.add(txtExpresion);

		btnComprobar = new JButton("Comprobar");
		btnComprobar.setBounds(110, 60, 110, 20);
		panel.add(btnComprobar);
		btnComprobar.addActionListener(new OyenteBoton());
		setSize(320, 150);
		setTitle("Validador Notaci�n Cient�fica");
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String args[]) {
		Pregunta6 ventana = new Pregunta6();

	}

	class OyenteBoton implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (txtExpresion.getText().matches("^[+-]?\\d+([.]\\d+)?([eE][+-]?\\d+)?$"))
				JOptionPane.showMessageDialog(rootPane, txtExpresion.getText() + " n�mero decimal correcto",
						"Resultado", JOptionPane.INFORMATION_MESSAGE);
			else
				JOptionPane.showMessageDialog(rootPane, txtExpresion.getText() + " no es un n�mero decimal correcto",
						"Resultado", JOptionPane.INFORMATION_MESSAGE);

		}
	}
}
