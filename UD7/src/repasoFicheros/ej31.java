package repasoFicheros;

import java.io.File;

public class ej31 {

	public static void main(String[] args) {
		File archivos = new File("C:\\Users\\migue\\git\\JavaLearn\\UD3-P2");
		String[] archivo = archivos.list();
		for (int i = 0; i < archivo.length; i++) {
			System.out.println(archivo[i]);
			File f = new File(archivo[i]);
			if (f.isDirectory()) {
				String[] subcarpetas = f.list();
				for (int j = 0; j < subcarpetas.length; j++) {
					System.out.println(subcarpetas[j]);
				}
			}
		}

	}

}
