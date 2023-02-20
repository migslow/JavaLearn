package ejercicios;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ej09_clase {

	public static void main(String[] args) {
		File f1, f2;
		FileInputStream fis1, fis2;
		int l1, l2;
		boolean iguales = true;
		if (args.length < 2) {
			System.out.println("No has envado los argumentos suficientes");
			System.exit(-1);
		}
		f1 = new File(args[0]);
		f2 = new File(args[1]);

		if (f1.length() != f2.length()) {
			System.out.println("NO son iguales");
		} else {
			try {
				fis1 = new FileInputStream(f1);
				fis2 = new FileInputStream(f2);
				l1 = fis1.read();
				l2 = fis2.read();
				while (l1 != -1) {
					if (l1 != l2) {
						iguales = false;
					}
					l1 = fis1.read();
					l2 = fis2.read();
				} // while
				fis1.close();
				fis2.close();
				if (iguales == true) {
					System.out.println("Son iguales");
				} else {
					System.out.println("NO son iguales");
				}
			} catch (IOException e) {
				System.out.println("Ocurrió un error de E/S \n" + e.getMessage());
			} // catch
		} // else

	} // main

}
