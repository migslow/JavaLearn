package exPasado;

import java.util.Scanner;

public class ej03 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int cerillas = 21;
		int eligeUsuario;
		int eligeOrdenador;

		String nombre;
		System.out.println("Introduce tu nombre");
		nombre = s.nextLine();

		System.out.println("Comenzamos " + nombre + ".");

		while (cerillas > 0) {
			System.out.println("Hay " + cerillas + " cerillas");
			System.out.println("Escoge una cantidad de cerillas entre 1 y 4");
			eligeUsuario = s.nextInt();
			while (eligeUsuario < 1 || eligeUsuario > 4 || eligeUsuario > cerillas) {
				System.out.println("Cantidad erronea. Escoge una cantidad de cerillas entre 1 y 4");
				eligeUsuario = s.nextInt();
			}
			cerillas = cerillas - eligeUsuario;
			if (cerillas == 0) {
				System.out.println(nombre + " has perdido.");
			} else {
				eligeOrdenador = 5 - eligeUsuario;
				cerillas = cerillas - eligeOrdenador;
				System.out.println("El ordenador escoge sacar " + eligeOrdenador + " cerillas");
			}
		}

		System.out.println();
		cerillas = cerillas - 5;
	}
}
