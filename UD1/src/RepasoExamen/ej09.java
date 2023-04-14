package RepasoExamen;

import java.util.Scanner;

public class ej09 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Introduce un numero entero positivo: ");
		int n1 = s.nextInt();
		int acumulador = 0;
		for (int i = n1; i > 0; i--) {
			acumulador = acumulador + i;
			System.out.println(i);
		}

	}

}
