package Examen_5;

import java.io.File;
import java.util.Scanner;

public class Pregunta2 {

	// QUITAR LOS COMENTARIOS A LOS M�TODOS Y COMPLETARLOS

	private static boolean existe(String s) {
		File archivo = new File(s);
		return archivo.isFile();

	}

	private static boolean convertirSoloLectura(String s) {
		File archivo = new File(s);
		return archivo.setReadOnly();

	}

	public static void main(String[] args) {
		String sFichero;
		Scanner s = new Scanner(System.in);
		System.out.println("Introduce el nombre del fichero (carpeta Ficheros)");
		sFichero = s.nextLine();

		// COMPLETAR
		String ruta = "Ficheros/" + sFichero;

		if (existe(ruta)) {
			System.out.println(sFichero + " existe y es un fichero");
			if (convertirSoloLectura(ruta)) {
				System.out.println("Cambiado atributo a solo lectura en fichero: " + sFichero);
			} else {
				System.out.println("No se pudo convertir el archivo " + sFichero);
			}
		} else {
			System.out.println("El archivo " + sFichero + " no existe o no es un fichero.");
		}

	} // del main
} // de Pregunta2
