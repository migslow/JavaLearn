import java.util.Scanner;

public class ej21 {

	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		int[] numeros = new int[10];
		rellenarArray(numeros);
		sumaVector(numeros);
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

	public static void sumaVector(int[] v) {
		int sumaPar = 0, sumaImpar = 0;
		for (int i = 0; i < v.length; i++) {
			if (i % 2 == 0) {
				sumaPar = sumaPar + v[i];
			} else {
				sumaImpar = sumaImpar + v[i];
			}
		}

		System.out.println("\nLa suma de las posiciones pares es: " + sumaPar);
		System.out.println("\nLa suma de las posiciones impares es: " + sumaImpar);
	}

}
