package ejerciciosInterfaces;

import java.awt.Color;
import java.awt.Container;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class ej08 extends JFrame implements ChangeListener {
	Container panel;
	JLabel jl_texto1, jl_texto2;
	private JCheckBox jcb_check1, jcb_check2, jcb_check3;

	public ej08() {
		super("Idiomas");
		panel = getContentPane();
		panel.setLayout(null);

		// JCHECKBOX
		jcb_check1 = new JCheckBox("Ingles");
		jcb_check1.setBounds(10, 10, 150, 30);
		jcb_check1.addChangeListener(this);
		panel.add(jcb_check1);
		jcb_check2 = new JCheckBox("Frances");
		jcb_check2.setBounds(10, 50, 150, 30);
		jcb_check2.addChangeListener(this);
		panel.add(jcb_check2);
		jcb_check3 = new JCheckBox("Aleman");
		jcb_check3.setBounds(10, 90, 150, 30);
		jcb_check3.addChangeListener(this);
		panel.add(jcb_check3);

		// JLABEL
		jl_texto1 = new JLabel("Idiomas seleccionados: ");
		jl_texto1.setBounds(10, 120, 200, 30);
		panel.add(jl_texto1);
		jl_texto2 = new JLabel();
		jl_texto2.setBounds(150, 120, 200, 30);
		jl_texto2.setForeground(Color.blue);
		panel.add(jl_texto2);

		setSize(500, 500);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

	}

	public static void main(String[] args) {
		ej08 ventana = new ej08();
	}

	@Override
	public void stateChanged(ChangeEvent e) {
		String cad = "";
		if (jcb_check1.isSelected() == true) {
			cad = cad + "Ingles-";
		}
		if (jcb_check2.isSelected() == true) {
			cad = cad + "Frances-";
		}
		if (jcb_check3.isSelected() == true) {
			cad = cad + "Aleman-";
		}
		jl_texto2.setText(cad);
	}

}
