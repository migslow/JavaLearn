package repasoFicheros;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ej16 {

	static Scanner s = new Scanner(System.in);

	public static void calculoNumeroVocales(String nombre) {
		try {
			int aux;
			int contador = 0;
			BufferedReader br = new BufferedReader(new FileReader(nombre));
			while ((aux = br.read()) != -1) {
				if (aux == 65 || aux == 69 || aux == 73 || aux == 79 || aux == 85 || aux == 97 || aux == 101
						|| aux == 105 || aux == 111 || aux == 117) {
					contador++;
				}
			}
			System.out.println("El numero de vocales es " + contador);

		} catch (IOException e) {
			System.out.println("A ocurrido un problema " + e.getMessage());
		}
	}

	public static void main(String[] args) {
		System.out.println("Introduce el nombre del fichero con extension: ");
		String nombre = s.nextLine();
		String ruta = "FicherosRepaso/" + nombre;
		calculoNumeroVocales(ruta);
	}

}
