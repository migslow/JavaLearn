package RepasoExamen;

import java.util.Scanner;

public class ej04 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Introduce el primer numero entero: ");
		int n1 = s.nextInt();
		System.out.println("Introduce el segundo numero entero: ");
		int n2 = s.nextInt();
		if (n1 % n2 == 0) {
			System.out.println(n2 + " es multiplo de " + n1);
		} else {
			System.out.println(n2 + " no es multiplo de " + n1);
		}
	}

}
