package ejercicios_paquetesArrays;

import java.util.Scanner;

public class ej10Voluntario {

	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		int[] numeros = new int[8];
		int suma = 0;
		do {
			System.out.println("Introduce el numero en binario: ");
			numeros[0] = s.nextInt();
			for (int i = 0; i < numeros.length; i++) {
				if (i == 0) {
					suma = suma + 128;
				}
				if (i == 1) {
					suma = suma + 64;
				}
				if (i == 2) {
					suma = suma + 32;
				}
				if (i == 3) {
					suma = suma + 16;
				}
				if (i == 4) {
					suma = suma + 8;
				}
				if (i == 5) {
					suma = suma + 4;
				}
				if (i == 6) {
					suma = suma + 2;
				}
				if (i == 7) {
					suma = suma + 1;
				}
			}
		} while (numeros[0] == 0 && numeros[0] == 1);

		System.out.println("El numero en decimal es: " + suma);
	}
}
