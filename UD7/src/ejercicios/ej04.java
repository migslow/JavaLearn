package ejercicios;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ej04 {
	public static void main(String[] args) throws IOException {
		Scanner s = new Scanner(System.in);
		System.out.println("Introduce el nombre del fichero creado: ");
		String nombre = s.nextLine();
		try {
			int caracter = 0;
			FileReader fr = new FileReader("Ficheros//" + nombre + ".txt");
			while ((caracter = fr.read()) != -1) {
				if (caracter != 32)
					System.out.print((char) (caracter));

			}
			fr.close();

		} catch (IOException io) {
			System.out.println("ha ocurrido un error");
		}
	}

}
