package ejercicios;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ej03 {

	public static void main(String[] args) throws IOException {
		Scanner s = new Scanner(System.in);
		int aux = 0, contador = 0;
		System.out.println("Escribe el nombre del fichero anteriormente creado: ");
		String fichero = s.nextLine();
		FileReader fr = new FileReader("Ficheros//" + fichero + ".txt");
		while ((aux = fr.read()) != -1) {
			if((char) aux == 32) {
				contador++;
			}
			aux = fr.read();
		}

		fr.close();
		System.out.println("Hay " + contador + " palabras");
	}

}
