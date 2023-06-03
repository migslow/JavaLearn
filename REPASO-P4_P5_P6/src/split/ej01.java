package split;

import java.util.Arrays;

public class ej01 {

	public static void main(String[] args) {
		String frase = "Hola que tal";
		String [] partes = frase.split(" ");
		System.out.println(Arrays.asList(partes));

	}

}
