package Examen_5;

import java.awt.EventQueue;

import javax.swing.JFrame;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.awt.event.ActionEvent;

public class Pregunta5 implements ActionListener {

	private JFrame frame;
	private JTextField txtSocio;
	private JTextField txtNombre;
	private JTextField txtEstatura;
	private JTextField txtEdad;
	private JTextField txtLocalidad;
	private JTextField txtBuscar;
	private JButton btnBuscar;

	private JLabel lblAos;
	private JLabel lblCm;
	//

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Pregunta5 window = new Pregunta5();
					window.frame.setVisible(true);

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	} //

	/**
	 * Create the application.
	 */
	public Pregunta5() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 491, 259);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setTitle("B�squeda de Socios por c�digo");

		JLabel lblSocio = new JLabel("Socio");
		lblSocio.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblSocio.setBounds(51, 42, 46, 14);
		frame.getContentPane().add(lblSocio);

		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNombre.setBounds(51, 67, 60, 14);
		frame.getContentPane().add(lblNombre);

		JLabel lblEstatura = new JLabel("Estatura");
		lblEstatura.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblEstatura.setBounds(51, 92, 60, 14);
		frame.getContentPane().add(lblEstatura);

		JLabel lblEdad = new JLabel("Edad");
		lblEdad.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblEdad.setBounds(51, 117, 46, 14);
		frame.getContentPane().add(lblEdad);

		JLabel lblLocalidad = new JLabel("Localidad");
		lblLocalidad.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblLocalidad.setBounds(51, 142, 60, 14);
		frame.getContentPane().add(lblLocalidad);

		txtSocio = new JTextField();
		txtSocio.setBounds(119, 41, 46, 20);
		frame.getContentPane().add(txtSocio);
		txtSocio.setColumns(10);
		txtSocio.setEditable(false);

		txtNombre = new JTextField();
		txtNombre.setBounds(119, 66, 207, 20);
		frame.getContentPane().add(txtNombre);
		txtNombre.setColumns(10);
		txtNombre.setEditable(false);

		txtEstatura = new JTextField();
		txtEstatura.setBounds(119, 91, 35, 20);
		frame.getContentPane().add(txtEstatura);
		txtEstatura.setColumns(10);
		txtEstatura.setEditable(false);

		txtEdad = new JTextField();
		txtEdad.setBounds(119, 116, 26, 20);
		frame.getContentPane().add(txtEdad);
		txtEdad.setColumns(10);
		txtEdad.setEditable(false);

		txtLocalidad = new JTextField();
		txtLocalidad.setBounds(119, 139, 65, 20);
		frame.getContentPane().add(txtLocalidad);
		txtLocalidad.setEditable(false);
		txtLocalidad.setColumns(10);

		txtBuscar = new JTextField();
		txtBuscar.setBounds(365, 29, 45, 20);
		frame.getContentPane().add(txtBuscar);
		txtBuscar.setColumns(5);

		btnBuscar = new JButton("Buscar");
		btnBuscar.addActionListener(this);
		btnBuscar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnBuscar.setBounds(365, 61, 89, 23);
		frame.getContentPane().add(btnBuscar);

		lblAos = new JLabel("a\u00F1os");
		lblAos.setBounds(155, 119, 35, 14);
		frame.getContentPane().add(lblAos);

		lblCm = new JLabel("cm.");
		lblCm.setBounds(158, 94, 26, 14);
		frame.getContentPane().add(lblCm);
	} // del m�todo initialize

	@Override
	public void actionPerformed(ActionEvent arg0) {

		if (arg0.getSource() == btnBuscar) {
			// comprubar si tengo algo en espacio de busqueda
			if (txtBuscar.getText().equals("")) {
				JOptionPane.showMessageDialog(null, "No hay nada que buscar ", "Recuadro buscar vacío ",
						JOptionPane.ERROR_MESSAGE);
				return;
			}

			try {

				ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Ficheros/socios.dat"));

				Socio socio = null;
				boolean encontrado = false;
// comprobar si el socio existe o no 
				while (!encontrado && (socio = (Socio) ois.readObject()) != null) {
					if (socio.getSocioId() == Integer.parseInt(txtBuscar.getText())) {
						encontrado = true;

						txtSocio.setText(Integer.toString(socio.getSocioId()));
						txtNombre.setText(socio.getNombre());
						txtEstatura.setText(Integer.toString(socio.getEstatura()));
						txtEdad.setText(Integer.toString(socio.getEdad()));
						txtLocalidad.setText(socio.getLocalidad());

						break;
					}
				}

				ois.close();
// errores 
				if (!encontrado) {
					JOptionPane.showMessageDialog(null, "Socio " + txtBuscar.getText() + " no encontrado", "Error",
							JOptionPane.ERROR_MESSAGE);
				}
			} catch (FileNotFoundException e) {
				JOptionPane.showMessageDialog(null, "No se encontró el archivo socios.dat", "Error",
						JOptionPane.ERROR_MESSAGE);
			} catch (EOFException e) {

				JOptionPane.showMessageDialog(null, "Socio " + txtBuscar.getText() + " no encontrado",
						"Fallo en la busqueda", JOptionPane.ERROR_MESSAGE);
			} catch (IOException e) {
				JOptionPane.showMessageDialog(null, "Error al leer el archivo socios.dat", "Error",
						JOptionPane.ERROR_MESSAGE);
			} catch (ClassNotFoundException e) {
				JOptionPane.showMessageDialog(null, "Error al leer el archivo socios.dat", "Error",
						JOptionPane.ERROR_MESSAGE);
			}
		}

	} // del m�todo actionPerformed()
} // de Pregunta5