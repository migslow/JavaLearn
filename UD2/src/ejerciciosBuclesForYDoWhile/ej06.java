package ejerciciosBuclesForYDoWhile;

public class ej06 {

	public static void main(String[] args) {
		int n = 8, factorial = 1;

		for (int i = n; i > 0; i--) {
			factorial = factorial * i;
		}
		System.out.println("El factorial de " + n + " es: " + factorial);

	}

}
