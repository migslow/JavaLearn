package ejerciciosBuclesForYDoWhile;

import java.util.Scanner;

public class ej01 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int numeroAleatorio;
		int intento;
		int contador = 10;
		numeroAleatorio = (int) (Math.random() * 101);
		System.out.println("Intenta adivinar un n�mero aleatorio entre el 1 y 100. " + "Tienes 10 intentos.");
		System.out.println(numeroAleatorio);
		do {
			System.out.println("N�mero contador: " + contador);
			System.out.print("Introduce el n�mero que creas posible: ");
			intento = s.nextInt();
			if (intento > numeroAleatorio) {
				System.out.println("El n�mero que buscas es menor, te quedan " + (contador - 1) + " intentos: ");
			} else if (intento < numeroAleatorio) {
				System.out.println("El n�mero que buscas es mayor, te quedan " + (contador - 1) + " intentos: ");
			} else {
				System.out.print("�CORRECTO! " + numeroAleatorio + " era el n�mero que estabas "
						+ "buscando, has necesitado " + (10 - (contador - 1)) + " intentos.");
			}
			contador--;
		} while (intento != numeroAleatorio && contador > 0);
		if (contador == 0) {
			System.out.println("Has perdido. El numero aleatorio era " + numeroAleatorio);
		}
	}
}
