package ejercicios1;

import java.util.Scanner;

public class ej07 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Introduce un numero entero: ");
		int n = s.nextInt();
		System.out.println("Numeros del 1 al " + n + ": ");
		int i = 1;
		while (i <= n) {
			System.out.print(i + " + ");
            i++;
		}

	}

}
