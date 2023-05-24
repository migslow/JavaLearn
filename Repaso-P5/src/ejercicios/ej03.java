package ejercicios;

/*
 * 	Escribe una clase con un método que reciba por parámetro el nombre de un fichero de
	texto (que habrás creado con anterioridad) y cuente el número de palabras que contiene.
	Incluye también el tratamiento de excepciones.
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class ej03 {

	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Introduce el nombre del fichero con extension: ");
		String f = s.next();
		String ruta = "ficheros/" + f;
		contarPalabras(ruta);
	}

	public static void contarPalabras(String ruta) {
		try {
			BufferedReader br = new BufferedReader(new FileReader(ruta));
			int aux = 0;
			int contador = 0;
			while ((aux = br.read()) != -1) {
				if ((char) aux == 32) {
					contador++;
				}
				aux = br.read();
			}
			br.close();
			System.out.println("Hay " + contador + " palabras");
		} catch (Exception e) {
			System.out.println("A ocurrido un problema de E/S " + e);
		}
	}

}
