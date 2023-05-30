package P2;

import java.util.Scanner;

public class ej04 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Introduce el numero: ");
		int n = s.nextInt();
		System.out.println("Numeros del 1 al " + n);
		for(int i = 1; i <=n;i++) {
			System.out.print(i + " + ");
		}

	}

}
