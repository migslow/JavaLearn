package repasoFicheros;

import java.io.File;

public class ej27 {

	public static void main(String[] args) {
		File archivo = new File("C:\\Users\\migue\\git\\JavaLearn\\UD1");
		String[] archivos = archivo.list();
		for (int i = 0; i < archivos.length; i++) {
			System.out.println(archivos[i]);
			File f = new File(archivos[i]);
			String[] subcarpeta = archivo.list();
			for (int j = 0; j < subcarpeta.length; j++) {
				System.out.println(subcarpeta[j]);
			}

		}

	}

}
