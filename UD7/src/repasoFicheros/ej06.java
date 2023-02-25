package repasoFicheros;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ej06 {

	public static void calcularVocales(String nombre) {
		try {
			int aux;
			int contador = 0;
			BufferedReader br = new BufferedReader(new FileReader(nombre));
			while((aux = br.read()) != -1) {
				if ((char) aux == 65 || (char) aux == 69 || (char) aux == 73 || (char) aux == 79 || (char) aux == 85
						|| (char) aux == 97 || (char) aux == 101 || (char) aux == 105 || (char) aux == 111
						|| (char) aux == 117) {
					contador++;
				}
			}
			br.close();
			System.out.println("Hay " + contador + " vocales");
		} catch (IOException e) {
			System.out.println("A ocurrido un problema de E/S " + e.getMessage());
		}
	}

	public static void main(String[] args) {
		String ruta = "FicherosRepaso/datos8.txt";
		calcularVocales(ruta);

	}

}
