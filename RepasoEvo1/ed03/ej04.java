import java.util.Scanner;

public class ej04 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("Introduce la longitud del vector: ");
		int longitud = s.nextInt();
		int numeros[] = new int[longitud];
		int n;
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Introduce el numero en la posicion: " + i);
			do {
				n = s.nextInt();
				if (!(n >= 0 && n <= 10)) {
					System.out.println("Inserte solo numero de entre 0 y 10");
				}
			} while (!(n >= 0 && n <= 10));
			numeros[i] = n;
		}
		System.out.println("Los numeros elegidos: ");
		for (int i = 0; i < numeros.length; i++) {
			System.out.println(numeros[i]);
		}

	}

}
