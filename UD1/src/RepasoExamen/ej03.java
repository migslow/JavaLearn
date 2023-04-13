package RepasoExamen;

import java.util.Scanner;

public class ej03 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Introduce el primero numero: ");
		int n1 = s.nextInt();
		System.out.println("Introduce el segundo numero: ");
		int n2 = s.nextInt();
		System.out.println("Introduce el tercero numero: ");
		int n3 = s.nextInt();

		if (n1 > n2) {
			System.out.println("El numero mayor es " + n1);
		} else if (n2 > n3) {
			System.out.println("El numero mayor es " + n2);
		} else {
			System.out.println("El numero mayor es " + n3);
		}

	}

}
