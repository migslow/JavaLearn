import java.util.Scanner;

public class ej24 {

	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		int[] numeros = new int[10];
		rellenarArray(numeros);
		System.out.println(elementoRepetido(numeros));
	}

	public static void rellenarArray(int[] v) {
		for (int i = 0; i < v.length; i++) {
			System.out.println("Introduce el numero en la posicion: [" + i + "]");
			v[i] = s.nextInt();
		}

		for (int i = 0; i < v.length; i++) {
			System.out.print(v[i] + " - ");
		}
	}

	public static boolean elementoRepetido(int[] v) {
		for (int i = 0; i < v.length; i++) {
			for (int j = 0; j < v.length; j++) {
				if (i != j && v[i] == v[j]) {
					System.out.println("\nEs numero: " + v[i] + " - ");
					return true;
				}
			}
		}
		System.out.println("\nNo hay numeros repetidos en el vector");
		return false;
	}

}
