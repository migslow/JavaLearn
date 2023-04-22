package ej03;

import java.util.Scanner;

public class ej04 {

	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Introduce el tamaño: ");
		int tamanio = s.nextInt();
		int[][] matriz1 = new int[tamanio][tamanio];
		int[][] matriz2 = new int[tamanio][tamanio];
		int[][] resultado = new int[tamanio][tamanio];

		for (int i = 0; i < matriz1.length; i++) {
			for (int j = 0; j < matriz1[i].length; j++) {
				System.out.println("Introduce el valor para la posicion: [" + i + "][" + j + "] de la matriz 1");
				matriz1[i][j] = s.nextInt();
				System.out.println("Introduce el valor para la posicion: [" + i + "][" + j + "] de la matriz 2");
				matriz2[i][j] = s.nextInt();
				resultado[i][j] = matriz1[i][j] + matriz2[i][j];
			}
		}
		System.out.println("\nmatriz 1: ");
		muestraMatriz(matriz1);
		System.out.println("\nmatriz 2: ");
		muestraMatriz(matriz2);
		System.out.println("\nmatriz resultado: ");
		muestraMatriz(resultado);
		
	}
	
	public static void muestraMatriz(int[][] matriz) {
		for(int i = 0 ; i <matriz.length;i++) {
			for(int j = 0; j < matriz[i].length;j++) {
				System.out.print(matriz[i][j]);
			}
			System.out.println("");
		}
	}

}
