package ejercicios;

import java.util.Scanner;

public class ej05 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Introduce la frase: ");
		String f = s.nextLine();
		System.out.println("\nIntroduce la palabra a buscar: ");
		String p = s.nextLine();
		int contador = 0;

		int pos = f.indexOf(p);
		while (pos != -1) {
			pos = f.indexOf(p, pos + 1);
			contador++;
		}
		System.out.println("\nLa palabra " + p + " aparece " + contador + " veces");

	}

}
