package ej03;

import java.util.Scanner;

public class ej02 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[][] matriz1 = new int[3][3];
		int[][] matriz2 = new int[3][3];

		System.out.println("\nIntroduce los numero de la matriz1: ");
		for (int i = 0; i < matriz1.length; i++) {
			for (int j = 0; j < matriz2.length; j++) {
				System.out.print("Ingrese el elemento [" + i + "][" + j + "]: ");
				matriz1[i][j] = s.nextInt();
			}
		}

		System.out.println("Ingrese los valores de la matriz 2:");

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print("Ingrese el elemento [" + i + "][" + j + "]: ");
				matriz2[i][j] = s.nextInt();
			}
		}

		int[][] matrizResultado = new int[3][3];

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				matrizResultado[i][j] = matriz1[i][j] + matriz2[i][j];
			}
		}

		System.out.println("Matriz resultante:");

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(matrizResultado[i][j] + " ");
			}
			System.out.println();
		}

	}

}
