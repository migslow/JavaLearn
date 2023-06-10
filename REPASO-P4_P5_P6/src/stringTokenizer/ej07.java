package stringTokenizer;

import java.util.StringTokenizer;

public class ej07 {

	public static void main(String[] args) {
		String frase = "Hoy\\.es\\.sabado";
		StringTokenizer cadena = new StringTokenizer(frase, "\\.");
		while (cadena.hasMoreElements()) {
			System.out.println(cadena.nextElement());
		}

	}

}
