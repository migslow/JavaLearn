package ej03;

import java.util.Arrays;

public class ej17 {

	public static int numerosAleatorio() {
		return (int) (Math.random() * 201);
	}

	public static void rellenarArray(int[][] m) {
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				m[i][j] = numerosAleatorio();
				System.out.print(m[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void ordenacion(int[][] m) {
	    for (int i = 0; i < 10; i++) {
	        Arrays.sort(m[i]);
	        for (int j = 0; j < 10; j++) {
	            System.out.print(m[i][j] + " - ");
	        }
	        System.out.println();
	    }
	}

	public static void main(String[] args) {

		int[][] matriz = new int[10][10];
		rellenarArray(matriz);
		ordenacion(matriz);

	}// del main

}
