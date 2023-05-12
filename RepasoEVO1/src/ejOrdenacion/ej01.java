package ejOrdenacion;

import java.util.Arrays;

public class ej01 {

	public static void main(String[] args) {
		int[][] matriz = new int[10][10];
		rellenarArray(matriz);
		ordenarMatriz(matriz);
	}

	public static void rellenarArray(int[][] v) {
		for (int i = 0; i < v.length; i++) {
			for (int j = 0; j < v.length; j++) {
				v[i][j] = (int) (Math.random() * 201);
			}
		}

		for (int i = 0; i < v.length; i++) {
			for (int j = 0; j < v.length; j++) {
				System.out.print(v[i][j] + "\t");
			}
			System.out.println("");
		}
	}

	public static void ordenarMatriz(int[][] matriz) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				Arrays.sort(matriz);
			}
		}
		System.out.println("\nEl array ordenado de forma ascendente: " + Arrays.toString(matriz));
	}

}
