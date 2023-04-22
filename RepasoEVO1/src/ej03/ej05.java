package ej03;

import java.util.Scanner;

public class ej05 {

	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Introduce el numero de filas: ");
		int f = s.nextInt();
		System.out.println("Introduce el numero de columnas: ");
		int c = s.nextInt();
		int[][] matriz = new int[f][c];
		boolean salir = false;
		int opcion;
		do {
			System.out.println("--------------MENU--------------");
			System.out.println("1. Rellenar matriz");
			System.out.println("2. Sumar fila");
			System.out.println("3. Sumar columna");
			System.out.println("4. Rellenar Sumar diagonal principal");
			System.out.println("5. Rellenar Sumar diagonal inversa");
			System.out.println("6. Media elementos");
			System.out.println("7. Salir");
			System.out.println("Introduce un numero entre 1 y 7");
			opcion = s.nextInt();
			switch (opcion) {
			case 1:
				rellenarMatriz(matriz);
				break;
			case 2:

				break;
			case 3:

				break;
			case 4:

				break;
			case 5:

				break;
			case 6:

				break;
			case 7:
				System.out.println("Has salido del menu");
				System.exit(-1);
				break;
			default:
				System.out.println("No has introducido un numero entre 1 y 7");
				break;
			}
		} while (!salir);

	}

	public static void rellenarMatriz(int[][] matriz) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.println("Introduce el elemento: [" + i + "][ " + j + "]");
				matriz[i][j] = s.nextInt();
			}
		}
	}

	public static int sumaFilas(int[][] matriz, int fila) {
		for (int i = 0; i < matriz.length; i++) {
			 
		}
	}

}
