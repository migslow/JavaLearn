package ejerciciosInterfaces;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class ej04 extends JFrame {
	Container panel;
	JButton validar;
	JTextField s1;
	private JPasswordField s2;
	JLabel usuario, contraseña;

	public ej04() {
		super("Iniciar Sesion");
		panel = getContentPane();
		panel.setLayout(null);
		usuario = new JLabel("Usuario");
		usuario.setBounds(10, 20, 100, 20);
		panel.add(usuario);
		contraseña = new JLabel("Contraseña");
		contraseña.setBounds(10, 50, 100, 20);
		panel.add(contraseña);
		s1 = new JTextField(5);
		s1.setBounds(120, 20, 150, 20);
		panel.add(s1);
		s2 = new JPasswordField(6);
		s2.setBounds(120, 50, 150, 20);
		panel.add(s2);
		validar = new JButton("Validar");
		validar.setBounds(120, 80, 150, 20);
		panel.add(validar);
		
		setSize(300, 200);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		ej04 ventana = new ej04();
	}
	
	public class oyenteBotonValidar implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
		}
		
	}

}
