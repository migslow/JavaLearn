package RepasoExamen;

import java.util.Scanner;

public class ej06 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Introduce un numero entero: ");
		int n1 = s.nextInt();
		int i = 1;
		while (i <= n1) {
			System.out.print(i + " + ");
			i++;
		}

	}

}
