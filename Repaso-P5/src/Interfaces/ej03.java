package Interfaces;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class ej03 extends JFrame {
	Container panel;
	JButton jb_suma, jb_resta, jb_multiplicacion, jb_division, jb_imagenExit, jb_imagenAbout;
	JTextField jtf_n1, jtf_n2, jtf_resultado;
	JLabel jl_etiqueta1, jl_etiqueta2, jl_resultado, jl_imagenCalculadora;

	public ej03() {
		super();
		// Contenedor
		panel = getContentPane();
		panel.setLayout(null);
		setSize(500, 500);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		// JLABEL
		jl_etiqueta1 = new JLabel("Dato 1:");
		jl_etiqueta2 = new JLabel("Dato 2:");
		jl_resultado = new JLabel("Resultado:");
		jl_imagenCalculadora = new JLabel();
		jl_etiqueta1.setBounds(10, 120, 100, 20);
		jl_etiqueta2.setBounds(10, 150, 100, 20);
		jl_resultado.setBounds(10, 180, 100, 20);
		jl_imagenCalculadora.setBounds(102, 2, 200, 80);
		panel.add(jl_etiqueta1);
		panel.add(jl_etiqueta2);
		panel.add(jl_resultado);
		ImageIcon iconoCalculadora = new ImageIcon("imagenes/calculadora.jpg");
		jl_imagenCalculadora.setIcon(iconoCalculadora);
		panel.add(jl_imagenCalculadora);

		// JTEXTFIELD
		jtf_n1 = new JTextField();
		jtf_n2 = new JTextField();
		jtf_resultado = new JTextField();
		jtf_n1.setBounds(100, 120, 100, 20);
		jtf_n2.setBounds(100, 150, 100, 20);
		jtf_resultado.setBounds(100, 180, 100, 20);
		panel.add(jtf_n1);
		panel.add(jtf_n2);
		panel.add(jtf_resultado);
		jtf_resultado.setEditable(false);
		jtf_resultado.setForeground(Color.RED);

		// JBUTTON
		jb_suma = new JButton("+");
		jb_resta = new JButton("-");
		jb_multiplicacion = new JButton("*");
		jb_division = new JButton("/");
		jb_imagenExit = new JButton();
		jb_imagenAbout = new JButton();
		jb_suma.setBounds(220, 120, 50, 30);
		jb_resta.setBounds(220, 160, 50, 30);
		jb_multiplicacion.setBounds(220, 200, 50, 30);
		jb_division.setBounds(220, 240, 50, 30);
		jb_imagenExit.setBounds(100, 220, 80, 60);
		jb_imagenAbout.setBounds(100, 290, 100, 60);
		panel.add(jb_suma);
		panel.add(jb_resta);
		panel.add(jb_multiplicacion);
		panel.add(jb_division);
		ImageIcon iconoExit = new ImageIcon("imagenes/puerta.jpg");
		jb_imagenExit.setIcon(iconoExit);
		ImageIcon iconoAbout = new ImageIcon("imagenes/hombre.png");
		jb_imagenAbout.setIcon(iconoAbout);
		panel.add(jb_imagenExit);
		panel.add(jb_imagenAbout);

		// ACTIONLISTENER
		jb_suma.addActionListener(new oyenteBoton());
		jb_resta.addActionListener(new oyenteBoton());
		jb_multiplicacion.addActionListener(new oyenteBoton());
		jb_division.addActionListener(new oyenteBoton());
		jb_imagenExit.addActionListener(new oyenteBoton());
		jb_imagenAbout.addActionListener(new oyenteBoton());
	}

	class oyenteBoton implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			try {
				if (e.getSource().equals(jb_suma) || e.getSource().equals(jb_resta)
						|| e.getSource().equals(jb_multiplicacion) || e.getSource().equals(jb_division)
						|| e.getSource().equals(jb_imagenAbout) || e.getSource().equals(jb_imagenExit)) {
					if (e.getSource().equals(jb_suma)) {
						Double resultado = Double.parseDouble(jtf_n1.getText()) + Double.parseDouble(jtf_n2.getText());
						jtf_resultado.setText(resultado.toString());
					} else if (e.getSource().equals(jb_resta)) {
						Double resultado = Double.parseDouble(jtf_n1.getText()) - Double.parseDouble(jtf_n2.getText());
						jtf_resultado.setText(resultado.toString());
					} else if (e.getSource().equals(jb_multiplicacion)) {
						Double resultado = Double.parseDouble(jtf_n1.getText()) * Double.parseDouble(jtf_n2.getText());
						jtf_resultado.setText(resultado.toString());
					} else if (e.getSource().equals(jb_division)) {
						Double resultado = Double.parseDouble(jtf_n1.getText()) / Double.parseDouble(jtf_n2.getText());
						jtf_resultado.setText(resultado.toString());
					} else if (e.getSource().equals(jb_imagenExit)) {
						System.exit(0);
					} else if (e.getSource().equals(jb_imagenAbout)) {
						JOptionPane.showMessageDialog(null, "Es una calculadora con las 4 operaciones basicas" , "informacion", JOptionPane.INFORMATION_MESSAGE);
					}
				}
			} catch (NumberFormatException e2) {
				JOptionPane.showMessageDialog(null, "No has introducido un numero entero o real", "Error",
						JOptionPane.INFORMATION_MESSAGE);
			}

		}

	}

	public static void main(String[] args) {
		ej03 ventana = new ej03();

	}

}
