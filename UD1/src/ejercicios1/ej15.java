package ejercicios1;

import java.util.Scanner;

public class ej15 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		char x1;
		System.out.println("Introduce el caracter ASCII: ");
		x1 = s.next().charAt(0);
		System.out.println("Código ASCII de " + x1 + " es " + (int) (x1));
		System.out.println("Los tres siguientes caracteres son: ");
		System.out.print((char) (x1 + 1) + " - ");
		System.out.print((char) (x1 + 2) + " - ");
		System.out.print((char) (x1 + 3));

	}

}
