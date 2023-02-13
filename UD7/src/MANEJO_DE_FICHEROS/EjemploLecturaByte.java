package MANEJO_DE_FICHEROS;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class EjemploLecturaByte {
	public static void main(String[] args) {
		try {
			int aux = 0;
			FileInputStream fis = new FileInputStream("Ficheros\\prueba.dat");
			while ((aux = fis.read()) != -1)
				System.out.println(aux + " - " + (char) aux);
			fis.close();
		} catch (FileNotFoundException ex) {
			ex.printStackTrace();
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}
}
