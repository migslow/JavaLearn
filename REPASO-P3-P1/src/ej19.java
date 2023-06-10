import java.util.Arrays;
import java.util.Scanner;

public class ej19 {

	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		int[] numeros = new int[10];
		rellenarArray(numeros);
		System.out.println("\nOrden ascendente: ");
		ordenAscendente(numeros);
		System.out.println("\nOrden descendente: ");
		ordenDescendente(numeros);
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

	public static void ordenAscendente(int[] v) {
		for (int i = 0; i < v.length; i++) {
			Arrays.sort(v);
			System.out.print(v[i] + " - ");
		}
	}
	
	public static void ordenDescendente(int[] v) {
		for (int i = v.length - 1; i >= 0; i--) {
			Arrays.sort(v);
			System.out.print(v[i] + " - ");
		}
	}

}
