package RepasoExamen;

import java.util.Scanner;

public class ej01 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Introduce el primer numero");
		int n1 = s.nextInt();
		System.out.println("Introduce el segundo numero");
		int n2 = s.nextInt();
		
		if(n1 < 1 || n2 < 1) {
			System.out.println("Algun numero pasado por teclado es menor que 1");
			System.out.println("Vuelve a introducir el primer numero");
			n1 = s.nextInt();
			System.out.println("Vuelve a introducir el segundo numero");
			n2 = s.nextInt();
		} else {
			System.out.println("\nMultiplos del " + n1 + " hasta el " + n2 + ": ");
			while(n1 <= n2) {
				if()
			}
		}

	}

}
