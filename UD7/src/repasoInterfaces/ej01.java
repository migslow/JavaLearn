package repasoInterfaces;

import java.awt.Container;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class ej01 extends JFrame {
	Container panel;
	JButton btnComprobar;
	JTextField txtExpresion;
	JLabel lbl1;


	public ej01() throws HeadlessException {
		super("Comprobar");
		panel = getContentPane();
		panel.setLayout(null);
		
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
				if(e.getSource().equals(btnComprobar)) {
					if(txtExpresion.getText().matches("^[0-7]{6}")) {
						JOptionPane.showMessageDialog(panel,  txtExpresion.getText() + " es un numero octal", "resultado", JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(panel,  txtExpresion.getText() + " no es un numero octal", "resultado", JOptionPane.INFORMATION_MESSAGE);
					}
				}
				
			}
		});
		
		setSize(320, 150);
		setTitle("Validador Octal");
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}



	public static void main(String[] args) {
		ej01 ventana = new ej01();

	}

}
