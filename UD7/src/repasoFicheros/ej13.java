package repasoFicheros;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ej13 {

	static Scanner s = new Scanner(System.in);

	public static void calcularPalabras(String nombre) {
		try {
			String aux;
			int suma = 0;
			BufferedReader br = new BufferedReader(new FileReader(nombre));
			while ((aux = br.readLine()) != null) {
				String[] palabras = aux.split("\n");
				suma = suma + palabras.length;
			}
			System.out.println("En el fichero hay " + suma + " letras");
			
		} catch (IOException e) {
			System.out.println("A ocurrido un problema " + e.getMessage());
		}
	}

	public static void main(String[] args) {
		System.out.println("Introduce el nombre del fichero con extension: ");
		String nombre = s.nextLine();
		String ruta = "FicherosRepaso/" + nombre;
		calcularPalabras(ruta);

	}

}
