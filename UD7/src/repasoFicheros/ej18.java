package repasoFicheros;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/*
 * Este programa lee palabras tanto contando espacios como saltos de linea
 */

public class ej18 {

	static Scanner s = new Scanner(System.in);

	public static void calcularPalabras(String nombre) {
		try {
			String aux;
			int contador = 0;
			BufferedReader br = new BufferedReader(new FileReader(nombre));
			while ((aux = br.readLine()) != null) {
				String[] palabras = aux.split(" ");
				for (int i = 0; i < palabras.length; i++) {
					contador++;
				}
			}
			System.out.println("Hay " + contador + " letras");
			br.close();

		} catch (IOException e) {
			System.out.println("A ocurrido un problema de E/S " + e.getMessage());
		}
	}

	public static void main(String[] args) {
		System.out.println("Introduce el nombre del fichero con extension: ");
		String nombre = s.nextLine();
		String ruta = "FicherosRepaso/" + nombre;
		calcularPalabras(ruta);
	}

}
