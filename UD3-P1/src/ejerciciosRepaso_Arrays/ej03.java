package ejerciciosRepaso_Arrays;

import java.util.Scanner;

public class ej03 {

	static Scanner s = new Scanner(System.in);

	public static void recorrerArray(int[] n) {
		System.out.println("Introduce 10 numeros por teclado: ");
		for (int i = 0; i < n.length; i++) {
			System.out.print("Elemento " + i + ": ");
			n[i] = s.nextInt();
		}
		System.out.println("\nEl array contiene: ");
		for (int c : n) {
			System.out.println(c);
		}
	}

	public static int mediaPositivo(int[] n) {
		int pos = 0;
		for (int i = 0; i < n.length; i++) {
			if (n[i] > 0) {
				pos = pos + n[i];
			}
		}
		return pos / n.length;
	}

	public static int mediaNegativo(int[] n) {
		int neg = 0;
		for (int i = 0; i < n.length; i++) {
			if (n[i] < 0) {
				neg = neg + n[i];
			}
		}
		return neg / n.length;

	}

	public static void main(String[] args) {
		int[] numeros = new int[10];
		recorrerArray(numeros);
		System.out.println("La media de los numeros positivos es: " + mediaPositivo(numeros));
		System.out.println("La media de los numeros negativos es: " + mediaNegativo(numeros));

	}

}
