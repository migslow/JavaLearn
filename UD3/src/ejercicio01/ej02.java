package ejercicio01;

import java.util.Scanner;

public class ej02 {

	static Scanner s = new Scanner(System.in);

	public static boolean esMultiplo(boolean numero) {
		System.out.println("Introduce el primer numero entero por teclado: ");
		int n1 = s.nextInt();
		System.out.println("Introduce el segundo numero entero por teclado: ");
		int n2 = s.nextInt();
		
		if (n1 % n2 == 0) {
			numero = true;
		}
		return numero;

	}

	public static void main(String[] args) {
		System.out.println("La conversion: " + esMultiplo(false));
	}

}
