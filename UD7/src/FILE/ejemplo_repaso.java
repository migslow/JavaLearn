package FILE;

import java.io.File;

public class ejemplo_repaso {

	public static void main(String[] args) {
		File ruta = new File("C:\\Users\\dam1alu15\\git\\JavaLearn\\UD7");
		String[] archivos = ruta.list();
		for (String archivo : archivos) {
			System.out.println(archivo);
			File f = new File(ruta.getAbsolutePath(), archivo);
			if (f.isDirectory()) {
				String[] archivos2 = f.list();
				for (String archivoSub : archivos2) {
					System.out.println(archivoSub);
				}
			}
		}

	}

}
