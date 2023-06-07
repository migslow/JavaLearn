package stringTokenizer;

import java.util.StringTokenizer;

public class ej06 {

	public static void main(String[] args) {
		String frase = "Escucho/musica|que|me/gusta";
		StringTokenizer cadena = new StringTokenizer(frase, "\\|");
		while (cadena.hasMoreElements()) {
			System.out.println(cadena.nextElement());
		}

	}

}
