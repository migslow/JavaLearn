package ejercicios;

public class ejer02 {
	public static void main(String[] args) {
		String texto = "La rana salto sobre el lago 123 veces";

		texto = texto.replace("123", "456");
		System.out.println("Texto1: " + texto);

		texto = texto.replaceAll("a", "9");
		System.out.println("Texto2: " + texto);

	}
}
