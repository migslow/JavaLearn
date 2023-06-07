package split;

import java.util.Arrays;

public class ej05 {

	public static void main(String[] args) {
		String frase = "Buenas(noches(miguel";
		String [] cadena = frase.split("\\(");
		for (int i = 0; i < cadena.length; i++) {
			System.out.println(cadena[i]);
		}
	}

}
