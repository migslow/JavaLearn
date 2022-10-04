package ejercicios1;

import java.util.Scanner;

public class ej14 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Introduce un numero entero: ");
		int n = s.nextInt();
		boolean primo = true;
		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0)
				primo = false;
			else
				primo = true;
		}
		if (primo)
			System.out.print("es primo");
		else
			System.out.print("no es primo");
	}

}
