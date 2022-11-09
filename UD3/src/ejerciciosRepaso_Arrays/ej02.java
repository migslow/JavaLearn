package ejerciciosRepaso_Arrays;

import java.util.Scanner;

public class ej02 {

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

	public static int positivo(int[] n) {
		int pos = 0;
		for (int i = 0; i < n.length; i++) {
			if (n[i] > 0) {
				pos++;
			}
		}
		return pos;
	}

	public static int negativo(int[] n) {
		int neg = 0;
		for (int i = 0; i < n.length; i++) {
			if (n[i] < 0) {
				neg++;
			}
		}
		return neg;

	}

	public static int cero(int[] n) {
		int cero = 0;
		for (int i = 0; i < n.length; i++) {
			if (n[i] == 0) {
				cero++;
			}
		}
		return cero;

	}

	public static void main(String[] args) {
		int[] numeros = new int[10];
		recorrerArray(numeros);
		System.out.println("Hay " + positivo(numeros) + " numeros positivos");
		System.out.println("Hay " + negativo(numeros) + " numeros negativos");
		System.out.println("Hay " + cero(numeros) + " ceros");

	}

}
