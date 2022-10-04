package ejercicios1;

import java.util.Scanner;

public class ej16 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Introduce un numero entero: ");
		int n = s.nextInt();
		int suma = 0;
		for (int i = n; i > 0; i--) {
			suma = suma + i;
			System.out.println(i);
		}
		System.out.println("la suma de " + n + " es: " + suma);
	}

}
