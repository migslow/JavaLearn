package ejercicios1;

import java.util.Scanner;

public class ej10 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int numero, suma = 0, contador = 0;
		for (int i = 1; i <= 300000; i++) {
			System.out.println("Introduce el numero: " + i);
			numero = s.nextInt();
			if (numero < 0) {
				break;
			}
			contador++;
			suma = suma + numero;
		}
		System.out.println("La suma vale: " + suma);
		System.out.println("La media vale: " + suma / contador);

	}

}
