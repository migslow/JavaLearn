package ejercicios2;

import java.util.Scanner;

public class ej07 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num1;
		do {
			System.out.println("Introduce un numero mayor que 0: ");
			num1 = s.nextInt();
		} while (num1 <= 0);
		System.out.println(num1);

	}

}
