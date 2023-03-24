package repasoFicheros;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ej10 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Introduce el nombre del fichero: ");
		String ruta = s.next();
		String nombreFichero = "FicherosRepaso/" + ruta;

		try {
			FileReader fr = new FileReader(nombreFichero);
			int aux;
			while ((aux = fr.read()) != -1) {
				if (aux != 32) {
					System.out.print((char) aux);
				}
			}
			fr.close();
		} catch (IOException e) {
			System.out.println("Ocurrio un problema " + e.getMessage());
		}

	}

}
