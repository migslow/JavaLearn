package ej03;

import java.util.Scanner;

public class ej40 {

	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		int[] binario = new int[8];
		rellenarArray(binario);
		conversorBinario(binario);

	}

	public static void rellenarArray(int[] v) {
		for (int i = 0; i < v.length; i++) {
			System.out.println("Introduce los bits: ");
			v[i] = s.nextInt();
		}
	}

	public static void conversorBinario(int[]v) {
		for (int i = 0; i < v.length; i++) {
			int suma = 0;
			if ((v[i] == 1 || v[i] == 0)) {
				if (v[0] == 1) {
					suma = suma + 128;
				}
				if (v[1] == 1) {
					suma = suma + 64;
				}
				if (v[2] == 1) {
					suma = suma + 32;
				}
				if (v[3] == 1) {
					suma = suma + 16;
				}
				if (v[4] == 1) {
					suma = suma + 8;
				}
				if (v[5] == 1) {
					suma = suma + 4;
				}
				if (v[6] == 1) {
					suma = suma + 2;
				}
				if (v[7] == 1) {
					suma = suma + 1;
				}
			}
			System.out.println("La suma es: " + suma);
		}
	}

}
