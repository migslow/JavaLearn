package exPasado;

import java.util.Scanner;

public class ej03 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int i = 0;
		int cerillas = 21;
		System.out.println("Introduce tu nombre: ");
		String nombre = s.next();
		System.out.println("Comenzemos. Hay " + cerillas + " cerillas");
		while (cerillas > 1) {
			int elegir;
			System.out.print("-> " + nombre + " elegiste cerillas (1-4):");
			elegir = s.nextInt();
			while (i >= 1 && i <= 4) {
				cerillas = cerillas - 5;
				System.out.println(" Yo (computador) tomo :" + cerillas + "." + " Quedan " + cerillas + " cerilla(s)");
			}
			if (cerillas == 1) {
				System.out.println("Has perdido");
			}
		}
	}
}
