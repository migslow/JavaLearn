package ejercicios_paquetesArrays;

import java.util.Scanner;

public class ej10Voluntario {

	static Scanner s = new Scanner(System.in);
	static int[] binario = new int[8];

	public static void rellenar() {
		for (int i = 0; i < binario.length; i++) {
			System.out.println("Introduce los bits: ");
			binario[i] = s.nextInt();

		}
	}

	public static void calculo() {
		for (int i = 0; i < binario.length; i++) {
			int suma = 0;
			if ((binario[i] == 1 || binario[i] == 0)) {
				if (binario[0] == 1) {
					suma = suma + 128;
				}
				if (binario[1] == 1) {
					suma = suma + 64;
				}
				if (binario[2] == 1) {
					suma = suma + 32;
				}
				if (binario[3] == 1) {
					suma = suma + 16;
				}
				if (binario[4] == 1) {
					suma = suma + 8;
				}
				if (binario[5] == 1) {
					suma = suma + 4;
				}
				if (binario[6] == 1) {
					suma = suma + 2;
				}
				if (binario[7] == 1) {
					suma = suma + 1;
				}
			}
			System.out.println(suma);
		}

	}

	public static void main(String[] args) {
		rellenar();
		calculo();
	}
}
