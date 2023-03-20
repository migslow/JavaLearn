package repasoFicheros;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ej21 {

	static Scanner s = new Scanner(System.in);

	public static void copiaFicheros(String nombre1, String nombre2) {
		try {
			String aux;
			BufferedReader br = new BufferedReader(new FileReader(nombre1));
			BufferedWriter bw = new BufferedWriter(new FileWriter(nombre2));
			while ((aux = br.readLine()) != null) {
				bw.write(aux);
				aux = br.readLine();
			}
			br.close();
			bw.close();
		} catch (IOException e) {
			System.out.println("A ocurrido un problema de E/S " + e.getMessage());
		}

	}

	public static void main(String[] args) {
		System.out.println("Introduce el nombre del primer fichero con extension: ");
		String nombre = s.nextLine();
		System.out.println("Introduce el nombre del fichero que sera una copia: ");
		String copia = s.nextLine();
		String ruta1 = "FicherosRepaso/" + nombre;
		String ruta2 = "FicherosRepaso/" + "copia_de_" + copia + ".txt";
		copiaFicheros(ruta1, ruta2);

	}

}
