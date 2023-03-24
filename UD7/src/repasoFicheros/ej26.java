package repasoFicheros;

import java.io.File;

public class ej26 {

	public static void main(String[] args) {
		File archivo = new File("C:\\Users\\migue\\git\\JavaLearn\\UD4_5_6");
		String[] nombre_archivos = archivo.list();
		for (int i = 0; i < nombre_archivos.length; i++) {
			System.out.println(nombre_archivos[i]);
			File f = new File(nombre_archivos[i]);
			if (f.isDirectory()) {
				String[] subcarpeta = f.list();
				for (int j = 0; j < subcarpeta.length; j++) {
					System.out.println(subcarpeta[j]);
				}
			}
		}

	}

}
