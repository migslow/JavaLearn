package P1;

import java.util.Scanner;

public class ej04 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Introduce el numero entero: ");
		int n = s.nextInt();
		if(n % 2 == 0) {
			System.out.println("Es par");
		} else {
			System.out.println("Es impar");
		}

	}

}
