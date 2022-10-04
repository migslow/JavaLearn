package ejercicios2;

import java.util.Scanner;

public class ej05 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Introduce 2 valores: ");
		int n1 = s.nextInt();
		int n2 = s.nextInt();
		int suma = n1 + n2;
		if (suma > 10) {
			System.out.println("La suma es: " + suma);
		}else {
			System.out.println("La suma no es superior a 10");
		}
	}

}
