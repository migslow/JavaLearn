package Interfaces;

import java.awt.Color;
import java.awt.Container;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class ej05 extends JFrame implements ChangeListener {
	Container panel;
	JCheckBox jcb_1, jcb_2, jcb_3;
	JLabel lb_1, lb_2;

	public ej05() {
		super("Idiomas");

		// CONTAINER
		panel = getContentPane();
		panel.setLayout(null);
		setSize(500, 500);
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		// JCHECKBOX
		jcb_1 = new JCheckBox("Ingles");
		jcb_2 = new JCheckBox("Frances");
		jcb_3 = new JCheckBox("Aleman");
		jcb_1.setBounds(10, 10, 150, 30);
		jcb_2.setBounds(10, 50, 150, 30);
		jcb_3.setBounds(10, 90, 150, 30);
		jcb_1.addChangeListener(this);
		jcb_2.addChangeListener(this);
		jcb_3.addChangeListener(this);
		panel.add(jcb_1);
		panel.add(jcb_2);
		panel.add(jcb_3);

		// JLABEL
		lb_1 = new JLabel("Idiomas seleccionados: ");
		lb_2 = new JLabel();
		lb_1.setBounds(10, 120, 200, 30);
		lb_2.setBounds(150, 120, 200, 30);
		lb_2.setForeground(Color.blue);
		panel.add(lb_1);
		panel.add(lb_2);
	}

	public static void main(String[] args) {
		ej05 ventana = new ej05();

	}

	@Override
	public void stateChanged(ChangeEvent e) {
		String cadena = "";
		if (jcb_1.isSelected()) {
			cadena = cadena + "Ingles-";
		}
		if (jcb_2.isSelected()) {
			cadena = cadena + "Frances-";
		}
		if (jcb_3.isSelected()) {
			cadena = cadena + "Aleman";
		}
		lb_2.setText(cadena);

	}

}
