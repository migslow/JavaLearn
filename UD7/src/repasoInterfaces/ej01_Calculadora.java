package repasoInterfaces;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class ej01_Calculadora extends JFrame implements ActionListener {

	Container panel;
	JButton jb_resultado, jb_sumar, jb_restar, jb_multiplicar, jb_dividir, jb_borrar, jb_reset, jb_coma, jb_uno, jb_dos,
			jb_tres, jb_cuatro, jb_cinco, jb_seis, jb_siete, jb_ocho, jb_nueve, jb_cero;
	JTextField jtf_texto;

	public ej01_Calculadora() throws HeadlessException {
		super("Calculadora");

		// CONTAINER
		panel = getContentPane();
		panel.setLayout(null);

		// JBUTTON
		jb_resultado = new JButton("=");
		jb_sumar = new JButton("+");
		jb_restar = new JButton("-");
		jb_multiplicar = new JButton("x");
		jb_dividir = new JButton("÷");
		jb_borrar = new JButton("DEL");
		jb_reset = new JButton("RESET");
		jb_coma = new JButton(",");
		jb_uno = new JButton("1");
		jb_dos = new JButton("2");
		jb_tres = new JButton("3");
		jb_cuatro = new JButton("4");
		jb_cinco = new JButton("5");
		jb_seis = new JButton("6");
		jb_siete = new JButton("7");
		jb_ocho = new JButton("8");
		jb_nueve = new JButton("9");
		jb_cero = new JButton("0");
		jb_resultado.setBounds(400, 400, 90, 30);
		jb_coma.setBounds(300, 400, 90, 30);
		jb_cero.setBounds(200, 400, 90, 30);
		jb_sumar.setBounds(400, 350, 90, 30);
		jb_tres.setBounds(300, 350, 90, 30);
		jb_dos.setBounds(200, 350, 90, 30);
		jb_uno.setBounds(100, 350, 90, 30);
		jb_restar.setBounds(400, 300, 90, 30);
		jb_seis.setBounds(300, 300, 90, 30);
		jb_cinco.setBounds(200, 300, 90, 30);
		jb_cuatro.setBounds(100, 300, 90, 30);
		jb_multiplicar.setBounds(400, 250, 90, 30);
		jb_nueve.setBounds(300, 250, 90, 30);
		jb_ocho.setBounds(200, 250, 90, 30);
		jb_siete.setBounds(100, 250, 90, 30);
		jb_dividir.setBounds(400, 200, 90, 30);
		jb_borrar.setBounds(300, 200, 90, 30);
		jb_reset.setBounds(200, 200, 90, 30);
		jb_resultado.setForeground(Color.white);
		jb_resultado.setBackground(Color.blue);
		panel.add(jb_resultado);
		panel.add(jb_coma);
		panel.add(jb_cero);
		panel.add(jb_sumar);
		panel.add(jb_tres);
		panel.add(jb_dos);
		panel.add(jb_uno);
		panel.add(jb_restar);
		panel.add(jb_seis);
		panel.add(jb_cinco);
		panel.add(jb_cuatro);
		panel.add(jb_multiplicar);
		panel.add(jb_nueve);
		panel.add(jb_ocho);
		panel.add(jb_siete);
		panel.add(jb_dividir);
		panel.add(jb_borrar);
		panel.add(jb_reset);

		// JTEXTFIELD
		jtf_texto = new JTextField();
		jtf_texto.setBounds(100, 150, 400, 30);
		jtf_texto.isEditable();
		panel.add(jtf_texto);

		// ACTIONLISTENER
		jb_uno.addActionListener(this);
		jb_dos.addActionListener(this);
		jb_tres.addActionListener(this);
		jb_cuatro.addActionListener(this);
		jb_cinco.addActionListener(this);
		jb_seis.addActionListener(this);
		jb_siete.addActionListener(this);
		jb_ocho.addActionListener(this);
		jb_nueve.addActionListener(this);
		jb_cero.addActionListener(this);

		setSize(700, 700);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		ej01_Calculadora ventana = new ej01_Calculadora();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// NUMEROS Y COMA
		if (e.getSource() == jb_uno) {
			jtf_texto.setText(jtf_texto.getText() + 1);
		}
		if (e.getSource() == jb_dos) {
			jtf_texto.setText(jtf_texto.getText() + 2);
		}
		if (e.getSource() == jb_tres) {
			jtf_texto.setText(jtf_texto.getText() + 3);
		}
		if (e.getSource() == jb_cuatro) {
			jtf_texto.setText(jtf_texto.getText() + 4);
		}
		if (e.getSource() == jb_cinco) {
			jtf_texto.setText(jtf_texto.getText() + 5);
		}
		if (e.getSource() == jb_seis) {
			jtf_texto.setText(jtf_texto.getText() + 6);
		}
		if (e.getSource() == jb_siete) {
			jtf_texto.setText(jtf_texto.getText() + 7);
		}
		if (e.getSource() == jb_ocho) {
			jtf_texto.setText(jtf_texto.getText() + 8);
		}
		if (e.getSource() == jb_nueve) {
			jtf_texto.setText(jtf_texto.getText() + 9);
		}
		if (e.getSource() == jb_cero) {
			jtf_texto.setText(jtf_texto.getText() + 0);
		}
		
		// OPERADORES
		
		
		// BORRAR Y RESET
		
	}

}
