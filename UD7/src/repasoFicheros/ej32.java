package repasoFicheros;

import java.io.File;

public class ej32 {

	public static void main(String[] args) {
		int contadorFicheros = 0;
		int contadorDirectorios = 0;
		File archivos = new File("C:\\Users\\migue\\git\\JavaLearn\\UD7");
		File[] archivo = archivos.listFiles();
		System.out.println("Su contenido es: ");
		System.out.println("\nArchivos: ");
		for (int i = 0; i < archivo.length; i++) {
			if (archivo[i].isFile()) {
				System.out.println(archivo[i].getName());
				contadorFicheros++;
			}

		}
		System.out.println("\nDirectorios: ");
		for (int i = 0; i < archivo.length; i++) {
			if (archivo[i].isDirectory()) {
				System.out.println(archivo[i].getName());
				contadorDirectorios++;
			}

		}

		System.out.println("\nHay " + contadorFicheros + " ficheros en " + archivos.getAbsolutePath());
		System.out.println("Hay " + contadorDirectorios + " directorios en " + archivos.getAbsolutePath());

	}

}
