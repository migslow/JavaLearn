package ejercicio01;

import java.util.Scanner;

public class ej01 {
	
	static Scanner s = new Scanner(System.in);
	
	public static boolean esPar(boolean numero) {
		System.out.println("Introduce un numero entero por teclado: ");
		int n = s.nextInt();
		if(n % 2 == 0) {
			numero = true;
		}
		return numero;
		
	}

	public static void main(String[] args) {
		System.out.println("La conversion: " + esPar(false));

	}

}
