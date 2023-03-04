package ejerciciosInterfaces;

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

public class ej07 extends JFrame implements ActionListener, ChangeListener {
	Container panel;
	private JCheckBox jcb_check1;
	JLabel jl_texto1;
	JButton jb_continuar;

	public ej07() {
		super("Confirmar");
		panel = getContentPane();
		panel.setLayout(null);

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

		setSize(500, 500);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		ej07 ventana = new ej07();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == jb_continuar) {
			JOptionPane.showMessageDialog(null, "Usted ha aceptado las condicines", "Confirmacion",
					JOptionPane.INFORMATION_MESSAGE);
		}
	}

	@Override
	public void stateChanged(ChangeEvent e) {
		if (jcb_check1.isSelected() == true) {
			jb_continuar.setEnabled(true);
		} else {
			jb_continuar.setEnabled(false);
		}
	}

}
