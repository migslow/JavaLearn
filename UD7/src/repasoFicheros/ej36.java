package repasoFicheros;

import java.io.File;

public class ej36 {

	public static void main(String[] args) {
		File archivos = new File("C:\\Users\\migue\\git\\JavaLearn\\UD2");
		File[] archivo = archivos.listFiles();
		for (int i = 0; i < archivo.length; i++) {
			System.out.println(archivo[i]);
			File f1 = archivo[i];
			if (f1.isDirectory()) {
				File[] subcarpeta1 = f1.listFiles();
				for (int j = 0; j < subcarpeta1.length; j++) {
					System.out.println(subcarpeta1[j]);
					File f2 = archivo[i];
					if (f2.isDirectory()) {
						File[] subcarpeta2 = f2.listFiles();
						for (int x = 0; x < subcarpeta2.length; x++) {
							System.out.println(subcarpeta2[x]);
						}
					}
				}
			}
		}

	}

}
