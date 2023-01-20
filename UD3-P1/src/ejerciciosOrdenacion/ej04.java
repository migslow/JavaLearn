package ejerciciosOrdenacion;

import java.util.Arrays;
import java.util.Scanner;

public class ej04 {

	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		int[] numeros = new int[1000];
		int min = 100;
		for (int i = 0; i < numeros.length; i++) {
			int x = (int) (Math.random() * (min));
		}
		Arrays.sort(numeros);
		System.out.print(numeros + " - ");
	}
}
