import java.util.Scanner;

public class ej15 {

	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Introduce el tamaño del array: ");
		int n = s.nextInt();
		int[] numeros = new int[n];
		rellenarArray(numeros);
		System.out.println("\nEl maximo es: " + maximo(numeros));
		System.out.println("El minimo es: " + minimo(numeros));
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
	
	public static int maximo(int[]v) {
		int max = v[0];
		for (int i = 0; i < v.length; i++) {
			if(v[i] > max) {
				max = v[i];
			}
		}
		return max;
	}
	
	public static int minimo(int[]v) {
		int min = v[0];
		for (int i = 0; i < v.length; i++) {
			if(v[i] < min) {
				min = v[i];
			}
		}
		return min;
	}

}
