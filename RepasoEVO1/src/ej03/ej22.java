package ej03;

import java.util.Scanner;

public class ej22 {

	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Define el tamaño del array: ");
		int t = s.nextInt();
		int[] numeros = new int[t];
		escrituraArray(numeros);
		System.out.println("\nIndica que numero quiere buscar dentro del array: ");
		int numeroBuscar = s.nextInt();
		System.out.println(buscarNumero(numeros, numeroBuscar));
		int[] resultado = mayoresQue(numeros, numeroBuscar);
		for (int i = 0; i < resultado.length; i++) {
	        System.out.print(resultado[i] + " ");
	    }
	}

	public static void escrituraArray(int[] numeros) {
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Introduce el numero en la posicion: [" + i + "]");
			numeros[i] = s.nextInt();
		}

		System.out.println("\nEl array es: ");
		for (int i = 0; i < numeros.length; i++) {
			System.out.println(numeros[i] + " - ");
		}
	}

	public static boolean buscarNumero(int[] numeros, int numero) {
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] == numero) {
				return true;
			}

		}
		return false;
	}
	
	public static int[] mayoresQue(int[] numeros, int numero) {
	    int[] resultado = new int[numeros.length];
	    int j = 0;
	    for (int i = 0; i < numeros.length; i++) {
	        if(numeros[i] > numero) {
	            resultado[j] = numeros[i];
	            j++;
	        }
	    }
	    return resultado;
	}

}
