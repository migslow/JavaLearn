package ejercicios;

import java.util.StringTokenizer;

public class ejer07 {

	public static void main(String[] args) {
		String lenguaje = "Java es un lenguaje de programacion... Genial";

		StringTokenizer particionesCadena = new StringTokenizer(lenguaje, " ");
		while (particionesCadena.hasMoreElements()) {
			System.out.println("Particion: " + particionesCadena.nextElement());
		}

		lenguaje = "Java 8, Java 9| Java 10; Java 11";

		particionesCadena = new StringTokenizer(lenguaje, ",|;");
		while (particionesCadena.hasMoreElements()) {
			System.out.println("Particion: " + particionesCadena.nextElement());
		}

	}

}
