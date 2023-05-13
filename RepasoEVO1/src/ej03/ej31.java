package ej03;

import java.util.Scanner;

public class ej31 {
	
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		int[] notas = new int[5];
		rellenarArray(notas);
	}
	
	public static void rellenarArray(int[] v) {
		for (int i = 0; i < v.length; i++) {
			System.out.println("Introduce la nota en la posicion [" + i + "]: " );
			v[i] =s.nextInt();
		}
		
		for (int i = 0; i < v.length; i++) {
			System.out.println("Nota: " + v[i] + " - ");
		}
	}

}
