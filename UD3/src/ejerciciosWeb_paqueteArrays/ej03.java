package ejerciciosWeb_paqueteArrays;

import java.util.Scanner;

/*
 * Crea un array de una longitud que determine el usuario 
 * y que le permita insertar numeros entre 0 y 10.
 */

public class ej03 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Introduce una longitud de numeros enteros: ");
		int longitud = s.nextInt();
		int numeros[] = new int[longitud];
		int num = 0;
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Inserte un numero en la posicion " + i);
			do {
				num = s.nextInt();
				if (!(num > 0 && num < 10)) {
					System.out.println("Error. Solo numeros del 0 al 10. " + "Inserte un numero en la posicion " + i);
				}

			} while (!(num > 0 && num < 10));
			numeros[i] = num;
		}
		System.out.println("ESTOS SON LOS NUMEROS ELEGIDOS POR EL USUARIO: ");
		for (int i = 1; i < numeros.length; i++) {
			System.out.println(numeros[i]);
		}

	}

}
