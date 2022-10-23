package ejercicios1;

import java.util.Scanner;

public class ej03 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Introduce 2 numeros enteros: ");
		int n1 = s.nextInt();
		int n2 = s.nextInt();
		int resto = n1 % n2;
		if (resto == 0) {
			System.out.println(n1 + " es multiplo de " + n2);
		} else {
			System.out.println(n1 + " no es multiplo de " + n2);
		}
	}

}
