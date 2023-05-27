package Interfaces;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class ej04 extends JFrame implements ActionListener, ChangeListener {
	Container panel;
	JCheckBox jcb_check1;
	JLabel jl_texto1;
	JButton jb_continuar;

	public ej04() {
		super();

		// CONTAINER
		panel = getContentPane();
		panel.setLayout(null);
		setSize(500, 500);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		// JCHECKBOX
		jcb_check1 = new JCheckBox("Acepto");
		jcb_check1.setBounds(10, 50, 100, 30);
		panel.add(jcb_check1);
		jcb_check1.addChangeListener(this);

		// JLABEL
		jl_texto1 = new JLabel("He leido el documento y estoy de acuerdo con las condicines");
		jl_texto1.setBounds(10, 20, 500, 30);
		panel.add(jl_texto1);

		// JBUTTON
		jb_continuar = new JButton("Continuar");
		jb_continuar.setBounds(10, 80, 100, 30);
		panel.add(jb_continuar);
		jb_continuar.addActionListener(this);
		jb_continuar.setEnabled(false);
	}

	public static void main(String[] args) {
		ej04 ventana = new ej04();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource().equals(jb_continuar)) {
			JOptionPane.showMessageDialog(null, "Usted ha aceptado las condicines", "Confirmacion",
					JOptionPane.INFORMATION_MESSAGE);
		}

	}

	@Override
	public void stateChanged(ChangeEvent e) {
		if(jcb_check1.isSelected() == true) {
			jb_continuar.setEnabled(true);
		} else {
			jb_continuar.setEnabled(false);
		}

	}

}
