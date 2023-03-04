package ejerciciosInterfaces;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ej06 extends JFrame implements ActionListener {
	private Container panel;
	private JComboBox jcb_combo1, jcb_combo2, jcb_combo3;
	JButton jb_colorFondo;
	JLabel lb_rojo, lb_verde, lb_azul;

	public ej06() {
		super("Practicando con combos");

		// CONTAINER
		panel = getContentPane();
		panel.setLayout(null);

		// JBUTTON
		jb_colorFondo = new JButton("Color de fondo");
		jb_colorFondo.setBounds(10, 130, 170, 30);
		panel.add(jb_colorFondo);
		jb_colorFondo.addActionListener(this);

		// JLABEL
		lb_rojo = new JLabel("Rojo: ");
		lb_verde = new JLabel("Verde: ");
		lb_azul = new JLabel("Azul: ");
		lb_rojo.setBounds(10, 10, 50, 30);
		lb_verde.setBounds(10, 50, 50, 30);
		lb_azul.setBounds(10, 90, 50, 30);
		panel.add(lb_rojo);
		panel.add(lb_verde);
		panel.add(lb_azul);

		// JCOMBOBOX
		jcb_combo1 = new JComboBox();
		jcb_combo2 = new JComboBox();
		jcb_combo3 = new JComboBox();
		jcb_combo1.setBounds(120, 10, 50, 30);
		jcb_combo2.setBounds(120, 50, 50, 30);
		jcb_combo3.setBounds(120, 90, 50, 30);
		panel.add(jcb_combo1);
		panel.add(jcb_combo2);
		panel.add(jcb_combo3);
		for (int i = 0; i <= 255; i++) {
			jcb_combo1.addItem(i);
			jcb_combo2.addItem(i);
			jcb_combo3.addItem(i);
		}
		jcb_combo1.addActionListener(this);
		jcb_combo2.addActionListener(this);
		jcb_combo3.addActionListener(this);

		setSize(500, 500);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

	}

	public static void main(String[] args) {
		ej06 ventana = new ej06();
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == jb_colorFondo) {
			String col1 = jcb_combo1.getSelectedItem().toString();
			String col2 = jcb_combo2.getSelectedItem().toString();
			String col3 = jcb_combo3.getSelectedItem().toString();

			int rojo = Integer.parseInt(col1);
			int verde = Integer.parseInt(col2);
			int azul = Integer.parseInt(col3);
			Color color1 = new Color(rojo, verde, azul);
			panel.setBackground(color1);
		}
	}

}
