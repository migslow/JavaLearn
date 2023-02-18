package ejercicios;

import java.io.File;
import java.io.IOException;

public class ej14 {

	public static void main(String[] args) {
		int numDire = 0;
		int numArch = 0;
		String directorio;
		if (args.length > 0)
			directorio = args[0];
		else
			directorio = ".";
		File actual = new File(directorio);
		System.out.println("El directorio es: ");
		try {
			System.out.println(actual.getCanonicalPath());
		} catch (IOException e) {
			System.out.println("Hubo un error");
		}
		System.out.println("Su contenido es: ");
		File[] archivos = actual.listFiles();
		System.out.println("\nArchivos: ");
		for (File archivo : archivos) {
			if (archivo.isFile()) {
				System.out.println(archivo.getName());
				numArch++;
			}
		}
		System.out.println("\nDirectorios: ");
		for (File archivo : archivos) {
			if (archivo.isDirectory()) {
				System.out.println(archivo.getName());
				numDire++;
			}
		}
		System.out.println("\nHay " + numDire + " directorios");
		System.out.println("Hay " + numArch + " archivos");
	}
}
