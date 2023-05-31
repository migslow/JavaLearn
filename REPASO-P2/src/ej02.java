

import java.util.Scanner;

public class ej02 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Introduce el primer numero: ");
		int n1 = s.nextInt();
		System.out.println("Introduce el segundo numero: ");
		int n2 = s.nextInt();
		if(n1 % n2 == 0) {
			System.out.println(n1 + " es multiplo de " + n2);
		} else {
			System.out.println(n1 + " no es multiplo de " + n2);
		}

	}

}
