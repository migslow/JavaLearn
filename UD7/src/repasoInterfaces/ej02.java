package repasoInterfaces;

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
	JButton btnComprobar;
	JTextField txtExpresion;
	JLabel lbl1;

	public ej02() {

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
		btnComprobar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (e.getSource().equals(btnComprobar)) {
					if (txtExpresion.getText().matches("^@([A-Za-z0-9_-]){1,15}$")) {
						JOptionPane.showMessageDialog(null,
								txtExpresion.getText() + " es valido para un usuario de twitter", "Resultado",
								JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(null,
								txtExpresion.getText() + " no es valido para un usuario de twitter", "Resultado",
								JOptionPane.INFORMATION_MESSAGE);
					}
				}

			}
		});
		setSize(320, 150);
		setTitle("Validador Binario");
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		ej02 ventana = new ej02();

	}

}
