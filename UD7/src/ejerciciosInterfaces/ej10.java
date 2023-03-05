package ejerciciosInterfaces;

import java.awt.Container;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class ej10 extends JFrame implements ActionListener {

	Container panel;
	JLabel jl_n1, jl_n2, jl_resultado, jl_imagenCalculadora;
	JTextField jtf_n1, jtf_n2, jtf_resultado;
	JMenuBar jmb_principal;
	JMenu jm_operaciones, jm_aplicacion;
	JMenuItem jmi_suma, jmi_resta, jmi_multi, jmi_division, jmi_salir, jmi_about;

	public ej10() throws HeadlessException {
		super("Calculadora");
		panel = getContentPane();
		panel.setLayout(null);

		// MENU
		jmb_principal = new JMenuBar();
		setJMenuBar(jmb_principal);
		jm_operaciones = new JMenu("Operaciones");
		jm_aplicacion = new JMenu("Aplicacion");
		jmb_principal.add(jm_operaciones);
		jmb_principal.add(jm_aplicacion);
		jmi_suma = new JMenuItem("Suma");
		jmi_resta = new JMenuItem("Resta");
		jmi_multi = new JMenuItem("Multiplicacion");
		jmi_division = new JMenuItem("Division");
		jmi_salir = new JMenuItem("Salir");
		jmi_about = new JMenuItem("About");
		jm_operaciones.add(jmi_suma);
		jm_operaciones.add(jmi_resta);
		jm_operaciones.add(jmi_multi);
		jm_operaciones.add(jmi_division);
		jm_aplicacion.add(jmi_salir);
		jm_aplicacion.add(jmi_about);

		// JLABEL
		jl_n1 = new JLabel("Dato 1:");
		jl_n2 = new JLabel("Dato 2:");
		jl_resultado = new JLabel("Resultado:");
		jl_imagenCalculadora = new JLabel();
		jl_n1.setBounds(10, 100, 100, 20);
		jl_n2.setBounds(10, 150, 100, 20);
		jl_resultado.setBounds(10, 200, 100, 20);
		jl_imagenCalculadora.setBounds(100, 0, 100, 90);
		ImageIcon iconoCalculadora = new ImageIcon("Imagenes/calculadora.jpg");
		jl_imagenCalculadora.setIcon(iconoCalculadora);
		panel.add(jl_n1);
		panel.add(jl_n2);
		panel.add(jl_resultado);
		panel.add(jl_imagenCalculadora);

		// JTEXTFIELD
		jtf_n1 = new JTextField(5);
		jtf_n2 = new JTextField(5);
		jtf_resultado = new JTextField(6);
		jtf_n1.setBounds(100, 100, 100, 20);
		jtf_n2.setBounds(100, 150, 100, 20);
		jtf_resultado.setBounds(100, 200, 100, 20);
		jtf_resultado.setEditable(false);
		panel.add(jtf_n1);
		panel.add(jtf_n2);
		panel.add(jtf_resultado);

		// ActionListener
		jmi_suma.addActionListener(this);
		jmi_resta.addActionListener(this);
		jmi_multi.addActionListener(this);
		jmi_division.addActionListener(this);
		jmi_salir.addActionListener(this);
		jmi_about.addActionListener(this);

		setSize(500, 500);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		ej10 ventana = new ej10();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			if (e.getSource() == jmi_suma) {
				Double resultado = Double.parseDouble(jtf_n1.getText()) + Double.parseDouble(jtf_n2.getText());
				jtf_resultado.setText(resultado.toString());
			}
			if (e.getSource() == jmi_resta) {
				Double resultado = Double.parseDouble(jtf_n1.getText()) - Double.parseDouble(jtf_n2.getText());
				jtf_resultado.setText(resultado.toString());
			}
			if (e.getSource() == jmi_multi) {
				Double resultado = Double.parseDouble(jtf_n1.getText()) * Double.parseDouble(jtf_n2.getText());
				jtf_resultado.setText(resultado.toString());
			}
			if (e.getSource() == jmi_division) {
				Double resultado = Double.parseDouble(jtf_n1.getText()) / Double.parseDouble(jtf_n2.getText());
				jtf_resultado.setText(resultado.toString());
			}
		} catch (NumberFormatException nfe) {
			JOptionPane.showMessageDialog(null, "No has introducido un numero", "Error", JOptionPane.ERROR_MESSAGE);
		}

		if (e.getSource() == jmi_salir) {
			System.exit(-1);
		}
		if (e.getSource() == jmi_about) {
			JOptionPane.showMessageDialog(null, "Es una calculadora un poco mas elaborada", "About",
					JOptionPane.INFORMATION_MESSAGE);
		}

	}

}
