package ejerciciosOrdenacion;

import java.util.Scanner;

public class ej03 {

	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Introduce la dimension del array: ");
		int dato = s.nextInt();
		int[] numeros = new int[dato];
		for (int i = 0; i < numeros.length; i++) {
			int n = (int) (Math.random() * 21);
			System.out.println(n);
		}
		
		for(int i = 0; i < numeros.length;i++) {
			for(int j = 0; j < numeros.length - 1;j++) {
				if(i!=j) {
					if(numeros[i] == numeros[j]) {
						numeros[j]= ' ';
					}
				}
			}
		}
		
		for(int i = 0; i < numeros.length;i++) {
			System.out.println(numeros[i]);
		}
	}
}
