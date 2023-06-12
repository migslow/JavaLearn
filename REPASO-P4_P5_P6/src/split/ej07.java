package split;

public class ej07 {

	public static void main(String[] args) {
		String cadena = "En|un|lugar|de|la|mancha";
		String[] frase = cadena.split("\\|");
		for (int i = 0; i < frase.length; i++) {
			System.out.println(frase[i]);
		}

	}

}
