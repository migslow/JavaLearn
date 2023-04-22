package ej03;

import java.util.Scanner;

public class ej03 {
	
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Introduce el numero de filas: ");
		int f = s.nextInt();
		System.out.println("Introduce el numero de columnas: ");
		int c = s.nextInt();
		int[][] matriz = new int[f][c];
		for(int i = 0; i < matriz.length;i++) {
			for(int j = 0; j < matriz[i].length;j++) {
				matriz[i][j] = numeroAleatorio();
				System.out.print(matriz[i][j]+ "\t");
			}
			System.out.println("\t");
		}

	}
	
	public static int numeroAleatorio() {
		return (int) (Math.random()*101);
	}

}
