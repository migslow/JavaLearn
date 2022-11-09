package ejerciciosRepaso_Arrays;

import java.util.Random;

public class ej06 {
	
	public static int calcularPrimos(int [] n) {
		int contador = 0;
		for(int i = 0; i < n.length;i++) {
			if(n[i] % 2 == 0) {
				contador++;
			}
		}
		return contador;
	}

	public static void main(String[] args) {
		int [] numeros = new int[20];
		for(int i = 0; i < numeros.length;i++) {
			numeros[i] = (int)(Math.random()*101);
			System.out.print(numeros[i] + " ");
		}
		
		System.out.println("\nEl nuevo array");
		for(int i = 0; i < numeros.length;i++) {
			System.out.print(calcularPrimos(numeros) + " ");
		}
	}
}
