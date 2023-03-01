package ejerciciosInterfaces;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ej05 extends JFrame {
	Container panel;
	JButton jb_suma, jb_resta, jb_multiplicacion, jb_division;
	JTextField jtf_n1, jtf_n2, jtf_calculo;
	JLabel jl_etiqueta1, jl_etiqueta2, jl_resultado, jl_imagenCalculadora;

	public ej05() {
		super("Calculadora");
		// CONTENEDOR
		panel = getContentPane();
		panel.setLayout(null);

		// JLABEL
		jl_etiqueta1 = new JLabel("Dato 1: ");
		jl_etiqueta2 = new JLabel("Dato 2: ");
		jl_resultado = new JLabel("Resultado: ");
		jl_imagenCalculadora = new JLabel();
		jl_etiqueta1.setBounds(10, 120, 100, 20);
		jl_etiqueta2.setBounds(10, 150, 100, 20);
		jl_resultado.setBounds(10, 180, 100, 20);
		jl_imagenCalculadora.setBounds(102, 2, 200, 80);
		panel.add(jl_etiqueta1);
		panel.add(jl_etiqueta2);
		panel.add(jl_resultado);
		ImageIcon iconoCalculadora = new ImageIcon("Imagenes/calculadora.jpg");
		jl_imagenCalculadora.setIcon(iconoCalculadora);
		panel.add(jl_imagenCalculadora);

		// JTEXTFIELD
		jtf_n1 = new JTextField();
		jtf_n2 = new JTextField();
		jtf_calculo = new JTextField();
		jtf_n1.setBounds(100, 120, 100, 20);
		jtf_n2.setBounds(100, 150, 100, 20);
		jtf_calculo.setBounds(100, 180, 100, 20);
		panel.add(jtf_n1);
		panel.add(jtf_n2);
		panel.add(jtf_calculo);

		// JBUTTON
		jb_suma = new JButton("+");
		jb_resta = new JButton("-");
		jb_multiplicacion = new JButton("*");
		jb_division = new JButton("/");
		jb_suma.setBounds(220, 120, 50, 30);
		jb_resta.setBounds(220, 160, 50, 30);
		jb_multiplicacion.setBounds(220, 200, 50, 30);
		jb_division.setBounds(220, 240, 50, 30);
		panel.add(jb_suma);
		panel.add(jb_resta);
		panel.add(jb_multiplicacion);
		panel.add(jb_division);

		// ActionListener

		setSize(500, 500);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		ej05 ventana = new ej05();

	}

	class oyenteBoton implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			try {
				if (e.getSource().equals(jb_suma) || e.getSource().equals(jb_resta)
						|| e.getSource().equals(jb_multiplicacion) || e.getSource().equals(jb_division)) {
					if(e.getSource().equals(jb_suma)) {
						Double resultado = Double.parseDouble(.getText()) + Double.parseDouble(n2.getText());
						calculo.setText(resultado.toString());
					}
				}
			} catch (Exception e2) {

			}

		}

	}

}
