package ejercicios;

import java.util.Scanner;

public class ej12 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n1, n2;
		System.out.println("Introduce dos numeros: ");
		n1 = s.nextInt();
		n2 = s.nextInt();

		System.out.println(n1 < n2);

	}

}
