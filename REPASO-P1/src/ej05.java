import java.util.Scanner;

public class ej05 {

	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Introduce un numero entero: ");
		int n = s.nextInt();

		if (esPrimo(n)) {
			System.out.println(n + " es un numero primo");
		} else {
			System.out.println(n + " no es un numero primo");
		}

	}

	public static boolean esPrimo(int numero) {
		for (int i = 2; i <= Math.sqrt(numero); i++) {
			if (numero % i == 0) {
				return false;
			}
		}
		return true;
	}

}
