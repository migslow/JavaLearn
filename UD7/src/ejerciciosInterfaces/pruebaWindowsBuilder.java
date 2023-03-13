package ejerciciosInterfaces;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import java.awt.BorderLayout;
import javax.swing.JTextField;

public class pruebaWindowsBuilder {

	private JFrame frame;
	private JTextField tf_nombre;
	private JTextField tf_apellido1;
	private JTextField tf_apellido2;
	private JTextField tf_nacionalidad;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					pruebaWindowsBuilder window = new pruebaWindowsBuilder();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public pruebaWindowsBuilder() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 872, 603);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lbl_nombre = new JLabel("Nombre");
		lbl_nombre.setBounds(61, 145, 84, 30);
		frame.getContentPane().add(lbl_nombre);
		
		JLabel lbl_apellido_1 = new JLabel("Apellido 1");
		lbl_apellido_1.setBounds(61, 186, 84, 30);
		frame.getContentPane().add(lbl_apellido_1);
		
		JLabel lbl_apellido_2 = new JLabel("Apellido 2");
		lbl_apellido_2.setBounds(61, 227, 84, 30);
		frame.getContentPane().add(lbl_apellido_2);
		
		JLabel lbl_nacionalidad = new JLabel("Nacionalidad");
		lbl_nacionalidad.setBounds(61, 268, 84, 30);
		frame.getContentPane().add(lbl_nacionalidad);
		
		tf_nombre = new JTextField();
		tf_nombre.setBounds(155, 150, 86, 20);
		frame.getContentPane().add(tf_nombre);
		tf_nombre.setColumns(10);
		
		tf_apellido1 = new JTextField();
		tf_apellido1.setColumns(10);
		tf_apellido1.setBounds(155, 191, 86, 20);
		frame.getContentPane().add(tf_apellido1);
		
		tf_apellido2 = new JTextField();
		tf_apellido2.setColumns(10);
		tf_apellido2.setBounds(155, 232, 86, 20);
		frame.getContentPane().add(tf_apellido2);
		
		tf_nacionalidad = new JTextField();
		tf_nacionalidad.setColumns(10);
		tf_nacionalidad.setBounds(155, 273, 86, 20);
		frame.getContentPane().add(tf_nacionalidad);
	}
}
