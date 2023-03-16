package repasoFicheros;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ej17 {

	static Scanner s = new Scanner(System.in);

	public static void cambioMayus(String nombre1, String nombre2) {
		try {
			String aux;
			BufferedReader br = new BufferedReader(new FileReader(nombre1));
			BufferedWriter bw = new BufferedWriter(new FileWriter(nombre2));
			while((aux = br.readLine()) != null) {
				bw.write(aux.toUpperCase());
			}
			br.close();
			bw.close();
		} catch (IOException e) {
			System.out.println("A ocurrido un problema " + e.getMessage());
		}
	}

	public static void main(String[] args) {
		System.out.println("Introduce el nombre del primer fichero con extension: ");
		String nombre1 = s.nextLine();
		System.out.println("Introduce el nombre del segundo fichero con extension: ");
		String nombre2 = s.nextLine();
		String rutaOrigen = "FicherosRepaso/" + nombre1;
		String rutaDestino = "FicherosRepaso/" + nombre2;
		cambioMayus(rutaOrigen, rutaDestino);
	}

}
