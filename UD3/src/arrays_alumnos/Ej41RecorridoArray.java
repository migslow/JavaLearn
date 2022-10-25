package arrays_alumnos;

import java.util.Scanner;

public class Ej41RecorridoArray {
	public static void main(String[] args) {

		int[] num = new int[5];
		Scanner s = new Scanner(System.in);
		System.out.println("Introducci�n de elementos en el array");
		for (int i = 0; i < 5; i++) {
			System.out.print("Introduce el " + i + ": ");
			// System.out.print("Introduce el " + (i+1) +": " );
			num[i] = s.nextInt();
		}

		System.out.println("El array num contiene los siguientes elementos:");

		for (int i = 0; i < 5; i++) {
			System.out.println("Elemento n� " + i + " --> " + num[i]);
			// System.out.println("Elemento n� " + (i+1) + " --> "+num[i]);
		}
	}
}
