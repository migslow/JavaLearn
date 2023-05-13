package ej03;

import java.util.Scanner;

public class ej35 {
	
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		int[] numeros = new int[10];
		rellenarArray(numeros);
		comprobarNumeros(numeros);
	}
	
	public static void rellenarArray(int[]v) {
		for (int i = 0; i < v.length; i++) {
			System.out.println("Introduce el numero en la posicion [" + i + "]: ");
			v[i] =s.nextInt();
		}
		
		for (int i = 0; i < v.length; i++) {
			System.out.print(v[i] + " - ");
		}
	}
	
	public static void comprobarNumeros(int[]v) {
		int positivos = 0, negativos = 0, ceros = 0;
		for (int i = 0; i < v.length; i++) {
			if(v[i] >= 0) {
				positivos++;
			}
			if (v[i] < 0) {
				negativos++;
			}
			if (v[i] == 0) {
				ceros++;
			}
		}
		System.out.println("\nHay " + positivos + " numeros positivos");
		System.out.println("\nHay " + negativos + " numeros negativos");
		System.out.println("\nHay " + ceros + " ceros");
	}

}
