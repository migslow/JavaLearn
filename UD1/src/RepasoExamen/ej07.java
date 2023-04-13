package RepasoExamen;

import java.util.Scanner;

public class ej07 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int numero = 0, suma = 0, contador = 0, max = 0, min = 0;
		System.out.println("Introduce un numero: ");
		numero = s.nextInt();
		if (numero < 0) {
			System.exit(0);
		}
		while (numero >= 0) {
			suma = suma + numero;
			contador++;
			if (numero > max) {
				max = numero;
			}
			if (numero < min) {
				min = numero;
			}
			numero = s.nextInt();
			System.out.println("La media vale " + (double) suma / contador);
			System.out.println("El mínimo es " + min);
			System.out.println("El máximo es  " + max);
		}
	
	}
}
