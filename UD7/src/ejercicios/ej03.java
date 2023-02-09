package ejercicios;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ej03 {

	public static void main(String[] args) throws IOException {
		Scanner s = new Scanner(System.in);
		FileReader fr = null;
		int aux = 0, contador = 0;
		System.out.println("Escribe el nombre del fichero anteriormente creado: ");
		String fichero = s.nextLine();
		fr = new FileReader("Ficheros//" + fichero + ".txt");
		while ((aux = fr.read()) != -1) {
				contador++;
			aux = fr.read();
		}

		fr.close();
		System.out.println("Hay " + contador + " palabras");
	}

}
