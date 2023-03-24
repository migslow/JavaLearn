package repasoInterfaces;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class InterfazGraficaPersona extends JFrame {
	Container panel;
	JButton btnComprobar;
	JTextField txtExpresion;
	JLabel lbl1;

	public InterfazGraficaPersona() {

		panel = getContentPane();
		panel.setLayout((null));
		lbl1 = new JLabel("Expresión");

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
		setTitle("Validador Binario");
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String args[]) {
		InterfazGraficaPersona ventana = new InterfazGraficaPersona();

	}

//	class OyenteBoton implements ActionListener {
//		public void actionPerformed(ActionEvent e) {
//			String exp = txtExpresion.getText();
//			if (e.getSource() == btnComprobar) {
//				if (exp.matches("[0-1]{8}")) {
//					JOptionPane.showMessageDialog(panel, exp + " es un número binario de 8 bits", "resultado",
//							JOptionPane.INFORMATION_MESSAGE);
//				} else {
//					JOptionPane.showMessageDialog(panel, exp + " no es un número binario de 8 bits", "resultado",
//							JOptionPane.INFORMATION_MESSAGE);
//				}
//			}
//
//		}
//	}
	// solucion Albreto
	class OyenteBoton implements ActionListener {
		public void actionPerformed(ActionEvent e) {

			if (txtExpresion.getText().matches("[0|1]{8}")) {
				JOptionPane.showMessageDialog(panel, txtExpresion.getText() + " es un número binario de 8 bits",
						"resultado", JOptionPane.INFORMATION_MESSAGE);
			} else {
				JOptionPane.showMessageDialog(panel, txtExpresion.getText() + " no es un número binario de 8 bits",
						"resultado", JOptionPane.INFORMATION_MESSAGE);
			}
		}

	}
}
