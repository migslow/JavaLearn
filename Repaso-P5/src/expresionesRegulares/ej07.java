package expresionesRegulares;

import java.util.Scanner;

public class ej07 {

	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		while (true) {
			System.out.println("=======Menu=======");
			System.out.println("1. Binario");
			System.out.println("2. Octal");
			System.out.println("3. Hexadecimal");
			System.out.println("4. Salir");
			int opcion = s.nextInt();
			s.nextLine();
			switch (opcion) {
			case 1:
				binario();
				break;
			case 2:
				octal();
				break;
			case 3:
				hexadecimal();
				break;
			case 4:
				System.out.println("Has salido del menu");
				System.exit(-1);
				break;
			default:
				System.out.println("No has introducido un numero entre 1 y 4");
				break;
			}
		}

	}

	public static void binario() {
		System.out.println("Introduce el numero en binario: ");
		String b = s.next();
		if (b.matches("^[0|1]+")) {
			System.out.println("Es un numero binario");
		} else {
			System.out.println("No es un numero binario");
		}
	}

	public static void octal() {
		System.out.println("Introduce el numero en octal: ");
		String b = s.next();
		if (b.matches("^[0-7]+")) {
			System.out.println("Es un numero octal");
		} else {
			System.out.println("No es un numero octal");
		}
	}

	public static void hexadecimal() {
		System.out.println("Introduce el numero en hexadecimal: ");
		String b = s.next();
		if (b.matches("^[0-9A-F]+")) {
			System.out.println("Es un numero hexadecimal");
		} else {
			System.out.println("No es un numero hexadecimal");
		}
	}

}
