package ejerciciosFicheros;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class ej07 {

	public static void main(String[] args) {
		String ruta1 = "ficheros/ej01.txt";
		String ruta2 = "ficheros/ej01_copia.txt";
		duplicar(ruta1, ruta2);
	}
	
	public static void duplicar(String ruta1, String ruta2) {
		try {
			FileInputStream fis = new FileInputStream(ruta1);
			FileOutputStream fos = new FileOutputStream(ruta2);
			int i = fis.read();
			while (i != -1) {
				fos.write(i);
				i = fis.read();
			}
			fis.close();
			fos.close();
		} catch (Exception e) {
			System.out.println("A ocurrido un problema" + e.getMessage());
		}
	}

}
