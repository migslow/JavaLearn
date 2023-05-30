package Examen_5_Recuperacion;

import javax.swing.*;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

import java.awt.*;
import java.awt.event.*;

public class Pregunta5a extends JFrame {
	Container panel;
	JButton btnBuscar;
	JTextField txtFichero, txtCadena;
	JLabel lbl1, lbl2, lbl3;

	public Pregunta5a() {

		panel = getContentPane();
		panel.setLayout((null));
		lbl1 = new JLabel("Fichero");
		lbl1.setBounds(50, 20, 60, 20);
		panel.add(lbl1);
		lbl2 = new JLabel("Cadena");
		lbl2.setBounds(50, 50, 60, 20);
		panel.add(lbl2);
		lbl3 = new JLabel(".xml");
		lbl3.setBounds(195, 20, 40, 20);
		panel.add(lbl3);
		txtFichero = new JTextField(5);
		txtFichero.setBounds(120, 20, 75, 20);
		panel.add(txtFichero);

		txtCadena = new JTextField(5);
		txtCadena.setBounds(120, 50, 90, 20);
		panel.add(txtCadena);

		btnBuscar = new JButton("Buscar");
		btnBuscar.setBounds(110, 90, 110, 20);
		panel.add(btnBuscar);
		btnBuscar.addActionListener(new OyenteBoton());
		setSize(320, 175);
		setTitle("B�squeda en documento XML");
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String args[]) {
		Pregunta5a ventana = new Pregunta5a();

	}

	class OyenteBoton implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (txtFichero.getText().isEmpty() || txtCadena.getText().isEmpty()) {
				JOptionPane.showMessageDialog(null, "Los recuadros de texto no deben quedar vacios", "Entrada de datos",
						JOptionPane.INFORMATION_MESSAGE);
				System.exit(0);
			}

			// txtFichero.getText() != txtFichero.setText(getTitle())
			if (txtFichero.getText().contains(getTitle())) {
				JOptionPane.showMessageDialog(null, "El fichero " + txtFichero.getText() + " no existe",
						"Fichero no valido", JOptionPane.INFORMATION_MESSAGE);
				System.exit(0);
			}

		}

	}
}
