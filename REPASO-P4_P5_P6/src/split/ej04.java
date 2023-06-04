package split;

public class ej04 {

	public static void main(String[] args) {
		String frase = "Hay'es'domingo";
		String[] cadena = frase.split("\\'");
		for (int i = 0; i < cadena.length; i++) {
			System.out.println(cadena[i]);
		}

	}

}
