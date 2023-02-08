package ejercicios;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ej02 {

	public static void main(String[] args) throws IOException {
		Scanner s = new Scanner(System.in);
		FileReader fr = null;
		int aux = 0, contador = 0;
		System.out.println("Escribe el nombre del fichero anteriormente creado: ");
		String fichero = s.nextLine();
		fr = new FileReader("Ficheros//" + fichero + ".txt");
		while ((aux = fr.read()) != -1) {
			if ((char) aux == 65 || (char) aux == 69 || (char) aux == 73 || (char) aux == 79 || (char) aux == 85
					|| (char) aux == 97 || (char) aux == 101 || (char) aux == 105 || (char) aux == 111
					|| (char) aux == 117) {
				contador++;
			}
			aux = fr.read();
		}

		fr.close();
		System.out.println("Hay " + contador + " vocales");
	}

}
