package ejerciciosInterfaces;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class ej03 extends JFrame {
	Container panel;
	JButton botonSuma, botonResta, botonMultiplicar, botonDivision;
	JTextField n1, n2, calculo;
	JLabel etiqueta1, etiqueta2;

	public ej03() {
		super("Sumar y restar reales");
		panel = getContentPane();
		panel.setLayout(null);
		etiqueta1 = new JLabel("Num1");
		etiqueta2 = new JLabel("Num2");
		etiqueta1.setBounds(10, 20, 60, 20);
		panel.add(etiqueta1);
		etiqueta2.setBounds(10, 50, 60, 20);
		panel.add(etiqueta2);
		n1 = new JTextField(5);
		n1.setBounds(50, 20, 45, 20);
		panel.add(n1);
		n2 = new JTextField(6);
		n2.setBounds(50, 50, 45, 20);
		panel.add(n2);
		botonSuma = new JButton("+");
		botonSuma.setBounds(40, 90, 75, 20);
		panel.add(botonSuma);
		botonResta = new JButton("-");
		botonResta.setBounds(120, 90, 75, 20);
		panel.add(botonResta);
		botonMultiplicar = new JButton("*");
		botonMultiplicar.setBounds(40, 120, 75, 20);
		panel.add(botonMultiplicar);
		botonDivision = new JButton("/");
		botonDivision.setBounds(120, 120, 75, 20);
		panel.add(botonDivision);
		calculo = new JTextField(6);
		calculo.setBounds(210, 90, 70, 20);
		panel.add(calculo);
		calculo.setEditable(false);
		calculo.setForeground(Color.red);
		botonSuma.addActionListener(new OyenteBoton());
		botonResta.addActionListener(new OyenteBoton());
		botonMultiplicar.addActionListener(new OyenteBoton());
		botonDivision.addActionListener(new OyenteBoton());

		setSize(300, 200);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		ej03 ventana = new ej03();
	}

	class OyenteBoton implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			try {
				if (e.getSource().equals(botonSuma) || e.getSource().equals(botonResta)
						|| e.getSource().equals(botonMultiplicar) || e.getSource().equals(botonDivision)) {
					if (e.getSource().equals(botonSuma)) {
						Double resultado = Double.parseDouble(n1.getText()) + Double.parseDouble(n2.getText());
						calculo.setText(resultado.toString());
					} else if (e.getSource().equals(botonResta)) {
						Double resultado = Double.parseDouble(n1.getText()) - Double.parseDouble(n2.getText());
						calculo.setText(resultado.toString());
					} else if (e.getSource().equals(botonMultiplicar)) {
						Double resultado = Double.parseDouble(n1.getText()) * Double.parseDouble(n2.getText());
						calculo.setText(resultado.toString());
					} else if (e.getSource().equals(botonDivision)) {
						Double resultado = Double.parseDouble(n1.getText()) / Double.parseDouble(n2.getText());
						calculo.setText(resultado.toString());
					}
				}
			} catch (NumberFormatException nfe) {
				JOptionPane.showMessageDialog(null,
						"No has introducido un numero entero o real. Vuelve a introducirlo bien", "Error",
						JOptionPane.INFORMATION_MESSAGE);
			}
		}
	}

}
