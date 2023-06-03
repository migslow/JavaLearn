package split;

public class ej03 {

	public static void main(String[] args) {
		String frase = "me|llamo|Miguel";
		String[] cadena = frase.split("\\|");
		for (int i = 0; i < cadena.length; i++) {
			System.out.println(cadena[i]);
		}

	}

}
