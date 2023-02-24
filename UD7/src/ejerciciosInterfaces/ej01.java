package ejerciciosInterfaces;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ej01 extends JFrame {
	public static void main(String[] args) {
		String n1 = JOptionPane.showInputDialog("Introduce la base: ");
		while (!isDouble(n1)) {
			n1 = JOptionPane.showInputDialog(null, "Numero invalido para la base. Intentelo otra vez");
		}
		Double numero1 = Double.parseDouble(n1);

		String n2 = JOptionPane.showInputDialog("Introduce la altura: ");
		while (!isDouble(n2)) {
			n2 = JOptionPane.showInputDialog(null, "Numero invalido para la altura. Intentelo otra vez");
		}
		Double numero2 = Double.parseDouble(n2);

		double calculo = (numero1 * numero2) / 2;

		JOptionPane.showMessageDialog(null, "El area de la base " + n1 + " por la altura " + n2 + " es " + calculo,
				"Resultado", JOptionPane.INFORMATION_MESSAGE);

	}

	private static boolean isDouble(String n) {
		try {
			Double.parseDouble(n);
			return true;
		} catch (NumberFormatException nfe) {
			return false;
		}
	}

}
