package ejerciciosFicheros;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

/*
 *  Escribe una clase con un método que reciba por parámetro el nombre de un fichero de
	texto (que habrás creado con anterioridad) y cuente las vocales (tanto mayúsculas como
	minúsculas) que en él aparecen. Incluye también el tratamiento de excepciones.
 */

public class ej02 {

	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Introduce el nombre del fichero para creacion: ");
		String fc = s.next();
		System.out.println("Introduce el nombre del fichero con extension: ");
		String fl = s.next();
		String rutac = "ficheros/" + fc;
		String rutal = "ficheros/" + fl;
		calcularVocales(rutac, rutal);

	}

	public static void calcularVocales(String rutac, String rutal) {
		try {
			int aux = 0;
			int contador = 0;
			BufferedWriter bw = new BufferedWriter(new FileWriter(rutac));
			BufferedReader br = new BufferedReader(new FileReader(rutal));
			bw.write("Esto es una prueba");
			bw.close();
			while ((aux = br.read()) != -1) {
				if ((char) aux == 65 || (char) aux == 69 || (char) aux == 73 || (char) aux == 79 || (char) aux == 85
						|| (char) aux == 97 || (char) aux == 101 || (char) aux == 105 || (char) aux == 111
						|| (char) aux == 117) {
					contador++;
				}
				aux = br.read();
			}
			br.close();
			System.out.println("Hay " + contador + " vocales");

		} catch (Exception e) {
			System.out.println("A ocurrido un problema de E/S " + e);
		}
	}

}
