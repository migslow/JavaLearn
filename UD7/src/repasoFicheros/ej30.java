package repasoFicheros;

import java.io.File;

public class ej30 {

	public static void main(String[] args) {
		int contador = 0;
		File archivos = new File("C:/Users/migue/git/JavaLearn/UD2");
		String[] archivo = archivos.list();
		for (int i = 0; i < archivo.length; i++) {
			System.out.println(archivo[i]);
			File f = new File(archivo[i]);
			contador++;
			if (f.isDirectory()) {
				String[] subcarpeta = f.list();
				for (int j = 0; j < subcarpeta.length; j++) {
					System.out.println(subcarpeta[j]);
				}
			}
		}
		System.out.println("Hay " + contador + " ficheros");

	}

}
