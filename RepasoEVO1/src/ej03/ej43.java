package ej03;

import java.util.Scanner;

public class ej43 {

	static Scanner s = new Scanner(System.in);
	
	public static void main(String[] args) {
		int[][] numeros = new int[3][3];
		rellenarArray(numeros);

	}
	
	public static void rellenarArray(int[][]v) {
		for (int i = 0; i < v.length; i++) {
			for (int j = 0; j < v.length; j++) {
				System.out.println("Introduce el numero en la fila [" + i + "] en la columna [" + j+ "]: ");
				v[i][j] = s.nextInt();
			}
		}
		
		for (int i = 0; i < v.length; i++) {
			for (int j = 0; j < v.length; j++) {
				System.out.print(v[i][j] + "\t");
			}
			System.out.println();
		}
	}
	
	public static void sumaFilas(int[][]v) {
		for (int i = 0; i < v.length; i++) {
			int suma = 0;
			for (int j = 0; j < v.length; j++) {
				suma = suma + v[i][j];
			}
		}
	}

}
