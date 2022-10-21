package exPasado;

import java.util.Scanner;

public class ej03 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int cerillas = 21;
		int eligirOrdenador = 0;
		int resto = 0;

		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce tú nombre :");

		String nombre = sc.nextLine();
		System.out.println(nombre + " comenzamos hay 21 cerillas ");
		while (cerillas >= 0) {
			int eligirUsuario = 0;
			System.out.println(nombre + " elige cerillas (1-4) :");
			eligirUsuario = sc.nextInt();
			while (eligirUsuario < 1 || eligirUsuario > 4 || eligirUsuario > cerillas) {
				System.out.println(nombre + " error elige  cerillas entre (1-4)");
				eligirUsuario = sc.nextInt();

			}
			eligirOrdenador = 5 - eligirUsuario;

			cerillas = cerillas - eligirOrdenador - eligirUsuario;
			System.out.println(" Yo (computador ) tomo :" + eligirOrdenador + " quedan " + cerillas);
			if (cerillas == 1) {
				System.out.println("Has perdido");
				System.exit(0);

			}

		}
	}
}
