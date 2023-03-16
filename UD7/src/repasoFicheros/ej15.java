package repasoFicheros;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ej15 {

	static Scanner s = new Scanner(System.in);

	public static void calculoLetras(String nombre) {
		try {
			String aux;
			int suma = 0;
			BufferedReader br = new BufferedReader(new FileReader(nombre));
			while((aux = br.readLine()) != null) {
				String letras = aux.replaceAll(" ", "");
				suma = letras.length();
			}
			System.out.println("La suma de letras es " + suma);
		} catch (IOException e) {
			System.out.println("A ocurrido un problema " + e.getMessage());
		}
	}

	public static void main(String[] args) {
		System.out.println("Introduce el nombre del fichero con extension: ");
		String nombre = s.nextLine();
		String ruta = "FicherosRepaso/" + nombre;
		calculoLetras(ruta);
	}

}
