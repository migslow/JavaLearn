package repasoFicheros;

import java.io.File;

public class ej24 {

	public static void main(String[] args) {

		// EJERCICIO 1
		File archivo1 = new File("FicherosRepaso/datos17.txt");
		System.out.println(archivo1.getAbsolutePath());
		if (archivo1.exists()) {
			System.out.println("El archivo existe");
		} else {
			System.out.println("El archivo no existe");
		}

		// EJERCICIO 2
		File archivo2 = new File("FicherosRepaso");
		System.out.println(archivo2.getAbsolutePath());
		String[] nombres_archivos1 = archivo2.list();
		for (int i = 0; i < nombres_archivos1.length; i++) {
			System.out.println(nombres_archivos1[i]);
		}

		// EJERCICIO 3
		File archivo3 = new File("FicherosRepaso");
		System.out.println(archivo3.getAbsolutePath());
		String[] nombres_archivos2 = archivo3.list();
		for (int i = 0; i < nombres_archivos2.length; i++) {
			System.out.println(nombres_archivos2[i]);
			File f = new File(archivo2.getAbsolutePath(), nombres_archivos2[i]);
			if (f.isDirectory()) {
				String[] archivos_subcarpeta = f.list();
				for (int j = 0; j < archivos_subcarpeta.length; j++) {
					System.out.println(archivos_subcarpeta[j]);
				}
			}
		}

		// EJERCICIO 4
		int contador = 0;
		File archivo4 = new File("FicherosRepaso");
		System.out.println(archivo4.getAbsolutePath());
		String[] nombres_archivos3 = archivo4.list();
		for (int i = 0; i < nombres_archivos3.length; i++) {
			System.out.println(nombres_archivos3[i]);
			contador++;
			File f = new File(archivo4.getAbsolutePath(), nombres_archivos2[i]);
			if (f.isDirectory()) {
				String[] archivos_subcarpeta = f.list();
				for (int j = 0; j < archivos_subcarpeta.length; j++) {
					System.out.println(archivos_subcarpeta[j]);
				}
			}
		}
		System.out.println("Hay " + contador + " archivos");
	}

}
