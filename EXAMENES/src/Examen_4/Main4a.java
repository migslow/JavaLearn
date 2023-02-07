package Examen_4;
import java.util.Scanner;

public class Main4a {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Introduzca la frase: ");
		String frase = s.nextLine();

		String[] cadena = frase.split(" ");

		int max = 0;
		for (String c : cadena) {
			if (c.length() > max) {
				max = c.length();
			}
		}
		System.out.println("\nLa palabra mas larga tiene " + max + " caracteres y son: ");
		
		for (String c : cadena) {
			if(c.length() == max) {
				System.out.println(c);
			}
		}
		
		
	}

}
