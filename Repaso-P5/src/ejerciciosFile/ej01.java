package ejerciciosFile;

import java.io.File;

public class ej01 {

	public static void main(String[] args) {
		File archivos = new File("C:\\Users\\migue\\git\\JavaLearn\\RepasoEVO1");
		String[] archivo = archivos.list();
		for (int i = 0; i < archivo.length; i++) {
			System.out.println(archivo[i]);
			File f = new File(archivo[i]);
			if (f.isDirectory()) {
				String[] subcarpeta = f.list();
				for (int j = 0; j < subcarpeta.length; j++) {
					System.out.println(subcarpeta[j]);
				}
			}
		}

	}

}
