import java.util.Scanner;

public class ej20 {

	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		int[] numeros = new int[10];
		rellenarArray(numeros);
		comprobar(numeros);
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

	public static void comprobar(int[] v) {
		boolean iguales = true;
		for (int i = 1; i < v.length; i++) {
			if (v[i] != v[i - 1]) {
				iguales = false;
				break;
			}
		}
		if (iguales) {
			System.out.println("Todos los elementos son iguales");
		} else {
			System.out.println("Todos los elementos no son iguales");
		}
	}
}
