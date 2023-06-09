package MetodoBurbuja;

import java.util.Arrays;

public class ej01 {

	public static void main(String[] args) {
		int[] numeros = new int[50];
		rellenarArray(numeros);
		ascendente(numeros);
		descendente(numeros);
	}
	
	public static void rellenarArray(int[]v) {
		for (int i = 0; i < v.length; i++) {
			v[i] = (int) (Math.random() * 101);
		}
		
		for (int i = 0; i < v.length; i++) {
			System.out.print(v[i] + " - ");
		}
	}
	
	public static void ascendente(int[]v) {
		System.out.println("\nNumeros de forma ascendente: ");
		for (int i = 0; i < v.length; i++) {
			Arrays.sort(v);
			System.out.print(v[i] + " - ");
		}
	}
	
	public static void descendente(int[] v) {
		System.out.println("\nNumeros de forma descendente");
		for (int i = v.length - 1; i >= 0; i--) {
			Arrays.sort(v);
			System.out.print(v[i] + " - ");
		}
	}

}
