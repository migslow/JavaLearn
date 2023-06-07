import java.util.Scanner;

public class ej10 {

	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		int[] numeros = new int[10];
		rellenarArray(numeros);
		visualizar(numeros);

	}

	public static void rellenarArray(int[] v) {
		for (int i = 0; i < v.length; i++) {
			System.out.print("Introduce el numero en la posicion: [" + i + "]");
			v[i] = s.nextInt();
		}
	}

	public static int maximo(int[] v) {
		int max = 0;
		for (int i = 0; i < v.length; i++) {
			if (v[i] > max) {
				max = v[i];
			}
		}
		return max;
	}

	public static int minimo(int[] v) {
		int min = 100;
		for (int i = 0; i < v.length; i++) {
			if (v[i] < min) {
				min = v[i];
			}
		}
		return min;
	}

	public static void visualizar(int[] v) {
		for (int i = 0; i < v.length; i++) {
			System.out.print(v[i] + " - ");
			if (v[i] == minimo(v)) {
				System.out.print("minimo ");
			}
			if (v[i] == maximo(v)) {
				System.out.print("maximo ");
			}
			System.out.println();
		}
	}

}
