package repasoFicheros;

import java.io.File;

public class ej25 {

	public static void main(String[] args) {
		File archivo = new File("C:\\Users\\migue\\git\\JavaLearn\\UD7");
		String[] nombre_directorio = archivo.list();
		for (int i = 0; i < nombre_directorio.length; i++) {
			System.out.println(nombre_directorio[i]);
			File f = new File(nombre_directorio[i]);
			if (f.isDirectory()) {
				String[] subcarpeta = f.list();
				for (int j = 0; j < subcarpeta.length; j++) {
					System.out.println(subcarpeta[j]);
				}
			}
		}

	}

}
