package stringTokenizer;

import java.util.StringTokenizer;

public class ej08 {

	public static void main(String[] args) {
		String cadena = "En|un|lugar|de|la|mancha";
		StringTokenizer frase = new StringTokenizer(cadena, "\\|");
		while (frase.hasMoreElements()) {
			System.out.println(frase.nextElement());
		}
	}

}
