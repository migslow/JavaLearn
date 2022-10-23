package ejerciciosSwitch;

import java.util.Scanner;

public class ej07 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int nota = 0;

		System.out.println("Introduce la nota: ");
		nota = scanner.nextInt();

		switch (nota) {
		case 5:
			System.out.println("Suficiente");
			break; // break evita que se ejecuten los siguientes casos
		case 6:
			System.out.println("Bien");
			break;
		case 7:
			System.out.println("Notable bajo");
			break;
		case 8:
			System.out.println("Notable alto");
			break;
		case 9:
			System.out.println("Sobresaliente");
			break;
		case 10:
			System.out.println("Matricula de honor");
			break;
		default:
			if (nota < 5)
				System.out.println("Suspenso");
			else
				System.out.println("Notaza");

		}
	}

}
