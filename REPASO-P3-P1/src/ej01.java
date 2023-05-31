import java.util.Scanner;

public class ej01 {

	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		int[] numeros = new int[10];
		rellenarArray(numeros);
		max(numeros);
		min(numeros);
		pos(numeros);
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

	public static int max(int v[]) {
		int max = 0;
		for (int i = 0; i < v.length; i++) {
			if (v[i] > max)
				max = v[i];
		}
		return max;
	}

	public static int min(int v[]) {
		int min = 100;
		for (int i = 0; i < v.length; i++) {
			if (v[i] < min)
				min = v[i];
		}
		return min;
	}

	public static void pos(int v[]) {
		System.out.print("\nEl minimo aparece en la posicion: ");
		for (int i = 0; i < v.length; i++) {
			if (v[i] == min(v))
				System.out.print((i + 1));
		}
		System.out.print("\nEl maximo aparece en la posicion: ");
		for (int i = 0; i < v.length; i++) {
			if (v[i] == max(v))
				System.out.print((i + 1));
		}
	}

}
