package ej03;

import java.util.Scanner;

public class ej27 {
	
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Introduce el numero de columnas: ");
		int columnas = s.nextInt();
		int[][] numeros = new int[5][columnas];
		numerosAle(numeros);

	}
	
	public static void numerosAle(int[][] v) {
		for (int i = 0; i < v.length; i++) {
			for (int j = 0; j < v.length; j++) {
				v[i][j] = (int) (Math.random() * 100);
				System.out.print(v[i][j] + " ");
			}
			System.out.println("");
		}
	}

}
