package ejerciciosWeb_paqueteArraysBidimensionales;

import java.util.Scanner;

public class ej04 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Introduce el numero de columnas en el array: ");
		int columnas = s.nextInt();
		int[][] numeros = new int[5][columnas];
		for (int i = 0; i < numeros.length; i++) {
			for (int j = 0; j < numeros[0].length; j++) {
				numeros[i][j] = numerosAletarios();
				System.out.print(numeros[i][j] + " ");
			}
			System.out.println("");
		}
	}

	public static int numerosAletarios() {
		return (int) (Math.random() * 10);
	}
}
