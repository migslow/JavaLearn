import java.util.Scanner;

public class ej17 {
	
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		int[] numeros = new int[10];
		rellenarArray(numeros);
		System.out.println();
		arrayInverso(numeros);
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
	
	public static void arrayInverso(int[]v) {
		for (int i = 9; i >= 0; i--) {
			System.out.print(v[i] + " - ");
		}
	}

}
