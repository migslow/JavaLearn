package repasoFicheros;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ej12 {

	static Scanner s = new Scanner(System.in);

	public static void calcularEnteros(String nombre) {
		try {
			String aux;
			int contador = 0, suma = 0;
			double media = 0;
			BufferedReader br = new BufferedReader(new FileReader(nombre));
			while ((aux = br.readLine()) != null) {
				suma = suma + Integer.parseInt(aux);
				contador++;
			}
			media = suma / contador;
			System.out.println("La suma de todos los numeros es: " + suma + " y la media es " + media);
		} catch (IOException e) {
			System.out.println("A ocurrido un problema " + e.getMessage());
		}
	}

	public static void main(String[] args) {
		System.out.println("Introduce el nombre del fichero con extension: ");
		String nombre = s.nextLine();
		String ruta = "FicherosRepaso/" + nombre;
		calcularEnteros(ruta);
	}

}
