package ejercicios;

import java.util.Scanner;

public class ej13 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int x1;
		int x2;
		int x3;
		System.out.print("introduce tres n�meros enteros: ");
		x1 = s.nextInt();
		x2 = s.nextInt();
		x3 = s.nextInt();
		System.out.println((x1 < x2) && (x2 < x3));

	}

}
