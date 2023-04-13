package RepasoExamen;

import java.util.Scanner;

public class ej02 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Introduce un numero: ");
		int n1 = s.nextInt();
		if(n1 % 2 == 0) {
			System.out.println(n1 + " es par");
		} else {
			System.out.println(n1 + " no es par");
		}

	}

}
