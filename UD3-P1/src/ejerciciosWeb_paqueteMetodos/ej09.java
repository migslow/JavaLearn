package ejerciciosWeb_paqueteMetodos;

import java.util.Scanner;

/*
 *  Crea un método que al ingresar por teclado un número cualquiera, muestre la cantidad de  números pares a partir del 2, por ejemplo: si se  introduce 7, 
 *  entonces se imprimirá, 2, 4, 6, 8, 10, 12,14 o si se introduce 10 = 2, 4, 6, 8, 10, 12, 14, 16, 18, 20. No se como
 */

public class ej09 {

	static Scanner s = new Scanner(System.in);

	public static void esPar(int p) {
		System.out.println("Introduce un numero");
		int n = s.nextInt();
		int i = 0;
		int j = 1;
		System.out.println("Los numeros pares son ; ");
		do {
			if (j % 2 == 0) {
				System.out.print(j + ",");
				j++;
				i++;
			} else {
				j++;
			}
		} while (i != n);
	}

	public static void main(String[] args) {
		esPar(0);
	}
}
