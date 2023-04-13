package RepasoExamen;

import java.util.Scanner;

public class ej05 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Introduce el primer numero entero: ");
		int n1 = s.nextInt();
		
		double resultado = Math.sqrt(n1);
		
		if(n1 % resultado == 0) {
			System.out.println(resultado + " es cuadrado de " + n1);
		} else {
			System.out.println(resultado + " no es cuadrado de " + n1);
		}
	}

}
