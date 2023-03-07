package ejerciciosInterfaces;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class ej09 extends JFrame implements ChangeListener {

	Container panel;
	private JRadioButton jrb_radio1, jrb_radio2, jrb_radio3;
	private ButtonGroup bg;

	public ej09() {
		super("Ejemplo grupos de opcion");
		panel = getContentPane();
		panel.setLayout(null);

		// BUTTONGROUP
		bg = new ButtonGroup();

		// JRADIOBUTTON
		jrb_radio1 = new JRadioButton("Linux");
		jrb_radio2 = new JRadioButton("Windows");
		jrb_radio3 = new JRadioButton("Macintosh");
		jrb_radio1.setBounds(100, 20, 90, 30);
		jrb_radio2.setBounds(200, 20, 90, 30);
		jrb_radio3.setBounds(300, 20, 90, 30);
		panel.add(jrb_radio1);
		panel.add(jrb_radio2);
		panel.add(jrb_radio3);
		jrb_radio1.addChangeListener(this);
		jrb_radio2.addChangeListener(this);
		jrb_radio3.addChangeListener(this);

		setSize(500, 500);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

	}

	public static void main(String[] args) {
		ej09 ventana = new ej09();
	}

	@Override
	public void stateChanged(ChangeEvent e) {
		if (jrb_radio1.isSelected()) {
			JOptionPane.showMessageDialog(null, "Elegiste: Linux", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
		}
		if (jrb_radio2.isSelected()) {
			JOptionPane.showMessageDialog(null, "Elegiste: Windows", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
		}
		if (jrb_radio3.isSelected()) {
			JOptionPane.showMessageDialog(null, "Elegiste: Macintosh", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
		}

	}

}
