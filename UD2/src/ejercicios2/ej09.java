package ejercicios2;

import java.util.Scanner;

public class ej09 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println(
				"Introduce un numero entero positivo. Introduce un numero negativo o cero para acabar la secuencia de numeros: ");
		int n = s.nextInt();
		int contador = 1;
		while (n > 0) {
			contador++;
			n = s.nextInt();
		}
		System.out.println("Se ha introducido " + (contador - 1) + " numeros");
	}
}
