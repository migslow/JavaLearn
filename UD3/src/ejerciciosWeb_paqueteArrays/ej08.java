package ejerciciosWeb_paqueteArrays;

import java.util.Scanner;

/*
 	PROGRAMA JAVA QUE LEA 10 NÚMEROS ENTEROS POR TECLADO Y LOS GUARDE EN UN
	ARRAY. CALCULA Y MUESTRA LA MEDIA DE LOS NÚMEROS QUE ESTÉN EN LAS POSICIONES
	PARES DEL ARRAY.
 */

public class ej08 {

	static Scanner s = new Scanner(System.in);
	static int[] numeros = new int[10];

	public static void pedir() {
		System.out.println("Introduce 10 numero enteros: ");
		for (int i = 0; i < numeros.length; i++) {
			System.out.print("Elemento " + i + ": ");
			numeros[i] = s.nextInt();
		}
		for (int i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i] + " ");
		}

	}
	
	public static int mediaPares(int mp) {
		int suma = 0, contador = 0, media = 0;
		for(int i = 0; i < numeros.length;i++) {
			if(numeros[i] % 2 == 0) {
				suma = suma + numeros[i];
				contador++;
			}
			media = suma / contador;
		}
		return media;
	}

	public static void main(String[] args) {
		pedir();
		System.out.println("\nLa media de todos los pares son: " + mediaPares(0));
	}

}
