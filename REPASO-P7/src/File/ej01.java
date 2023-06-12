package File;

import java.io.File;
import java.util.Scanner;

public class ej01 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		File ruta = new File("C:\\Users\\migue\\git\\JavaLearn\\REPASO-P4_P5_P6");
		String[] archivos = ruta.list();
		for (int i = 0; i < archivos.length; i++) {
			System.out.println(archivos[i]);
			File f = new File(archivos[i]);
			if (f.isDirectory()) {
				String[] subcarpetas = f.list();
				for (int j = 0; j < subcarpetas.length; j++) {
					System.out.println(subcarpetas[j]);
				}
			}
		}

	}

}
