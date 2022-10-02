package ejercicios1;

import java.util.Scanner;

public class ej02 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Introduce 3 numero enteros: ");
		int n1 = s.nextInt();
		int n2 = s.nextInt();
		int n3 = s.nextInt();
		if (n1 > n2) {
			System.out.println("El mayor es: " + n1);
		} else if (n2 > n3) {
			System.out.println("El mayor es: " + n2);
		} else if (n3 > n1 || n3 > n2) {
			System.out.println("El mayor es: " + n3);
		} else {
			System.out.println("Todos los numeros son iguales");
		}
	}
}
