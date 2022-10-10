package ejercicios1;

import java.util.Scanner;

public class ej13Clase {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		double acumulador = 1;
		int numero;
		System.out.println("Introduce un numero: ");
		numero = s.nextInt();
		if (numero < 0) {
			System.out.println("Introduce un numero positivo: ");
			System.exit(1);
		}
		for (int i = 1; i <= numero; i++) {
			acumulador = acumulador * i;
			System.out.println(i);
		}
		System.out.print(acumulador);
	}

}
