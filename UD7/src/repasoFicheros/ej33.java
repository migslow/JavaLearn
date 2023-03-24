package repasoFicheros;

import java.io.File;
import java.util.Scanner;

public class ej33 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int contadorBytes = 0;
		int contadorFicheros = 0;
		int contadorDirectorios = 0;
		System.out.println("Introduce el ruta del directorio: ");
		String nombre = s.nextLine();
		File ruta = new File(nombre);
		File[] archivos = ruta.listFiles();
		System.out.println("\nRuta: " + ruta.getAbsolutePath());
		System.out.println("\nSu contenido: ");
		for (int i = 0; i < archivos.length; i++) {
			if (ruta.isDirectory()) {
				contadorBytes = (int) (contadorBytes + archivos[i].length());
			}
		}

		System.out.println("\nDirectorios: ");
		for (int i = 0; i < archivos.length; i++) {
			if (archivos[i].isDirectory()) {
				System.out.println(archivos[i] + " - " + archivos[i].length());
				contadorDirectorios++;
				String[] subcarpeta = archivos[i].list();
				for (int j = 0; j < subcarpeta.length; j++) {
					File archivo = new File(archivos[i], subcarpeta[j]);
		            if(archivo.isFile()) {
		                System.out.println(subcarpeta[j]);
		                contadorFicheros++;
		            }
				}
			}

		}

		System.out.println("\nHay " + contadorFicheros + " ficheros");
		System.out.println("Hay " + contadorDirectorios + " directorios");
		System.out.println("\nEl tamaño de todos los ficheros es: " + contadorBytes);

	}

}
