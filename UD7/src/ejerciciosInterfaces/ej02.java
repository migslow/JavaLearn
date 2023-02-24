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

public class ej02 extends JFrame {

	Container panel;
	JButton botonCalcular;
	JTextField base, altura, calculo;
	JLabel etiqueta1, etiqueta2;

	public ej02() {
		super("Calculo area triangulo");
		panel = getContentPane();
		panel.setLayout((null));
		etiqueta1 = new JLabel("Base");
		etiqueta2 = new JLabel("Altura");
		etiqueta1.setBounds(10, 20, 60, 20);
		panel.add(etiqueta1);
		etiqueta2.setBounds(10, 50, 60, 20);
		panel.add(etiqueta2);
		base = new JTextField(5);
		base.setBounds(50, 20, 45, 20);
		panel.add(base);
		altura = new JTextField(6);
		altura.setBounds(50, 50, 45, 20);
		panel.add(altura);
		botonCalcular = new JButton("Area");
		botonCalcular.setBounds(40, 90, 75, 20);
		panel.add(botonCalcular);
		calculo = new JTextField(6);
		calculo.setBounds(120, 90, 45, 20);
		panel.add(calculo);
		calculo.setEditable(false);
		calculo.setForeground(Color.red);
		botonCalcular.addActionListener(new OyenteBoton());

		setSize(300, 200);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String args[]) {
		ej02 ventana = new ej02();
	}

	class OyenteBoton implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			// Faltar�a aqu� la comprobaci�n de datos reales de la base y de la altura
			// de forma similar a c�mo se ha hecho en el Ejercicio01.java
			if (!isDouble(base.getText()) || !isDouble(altura.getText())) {
				JOptionPane.showMessageDialog(panel, "Los valores de la base y la altura deben ser números reales.",
						"Error", JOptionPane.ERROR_MESSAGE);
				base.setText("");
				altura.setText("");
				return;
			}
			Double resultado = Double.parseDouble(base.getText()) * Double.parseDouble(altura.getText()) / 2;
			resultado = Math.rint(resultado * 100) / 100;
			calculo.setText(resultado.toString());
		}
	}

	private static boolean isDouble(String n) {
		try {
			Double.parseDouble(n);
			return true;
		} catch (NumberFormatException nfe) {
			return false;
		}
	}

}
