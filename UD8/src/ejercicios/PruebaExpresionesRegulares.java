package ejercicios;

public class PruebaExpresionesRegulares {

	public static void main(String[] args) {
		String cadena1 = "Pepe";
		if (cadena1.matches(cadena1)) {
			System.out.println("Si");
		} else {
			System.out.println("No");
		}

		String cadena2 = "a";
		if (cadena2.matches("[abc]")) {
			System.out.println("Si");
		} else {
			System.out.println("No");
		}

		String cadena3 = "a";
		if (cadena3.matches("[^abc]")) {
			System.out.println("Si");
		} else {
			System.out.println("No");
		}

	}

}
