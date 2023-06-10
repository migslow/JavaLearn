package split;

public class ej06 {

	public static void main(String[] args) {
		String frase = "Hoy|es\\sabado";
		String [] cadena = frase.split("\\|");
		for (int i = 0; i < cadena.length; i++) {
			System.out.println(cadena[i]);
		}

	}

}
