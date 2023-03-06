package ejerciciosInterfaces;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;

public class ej11 extends JFrame implements ActionListener {

	Container panel1, panel2;
	JButton jb_anyadir, jb_aceptar, jb_cancelar;
	JTextArea jta_texto;
	JLabel jl_nombre, jl_apellidos, jl_numMatricula;
	JRadioButton jrb_manana, jrb_tarde;
	ButtonGroup bg;

	public ej11() {
		super("Lista Alumnos");

		// CONTAINER
		panel1 = getContentPane();
		panel1.setLayout(null);
		panel2 = getContentPane();
		panel2.setLayout(null);

		// JBUTTON
		jb_anyadir = new JButton("Añadir");
		jb_aceptar = new JButton("Añadir");
		jb_cancelar = new JButton("Añadir");
		jb_anyadir.setBounds(10, 100, 100, 30);
		panel1.add(jb_anyadir);
		
		// JTEXTAREA
		jta_texto = new JTextArea();
		jta_texto.setBounds(150, 20, 200, 300);
		jta_texto.setEditable(false);
		panel1.add(jta_texto);
		
		// ACTIONLISTENER
		jb_anyadir.addActionListener(this);

		setSize(500, 500);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

	}

	public static void main(String[] args) {
		ej11 ventana = new ej11();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == jb_anyadir) {
			
		}
	}

}
