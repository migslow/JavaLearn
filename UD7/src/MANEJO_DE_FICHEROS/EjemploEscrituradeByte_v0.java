package MANEJO_DE_FICHEROS;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class EjemploEscrituradeByte_v0 {
	public static void main(String[] args) {
		try {
			FileOutputStream fos = new FileOutputStream("Ficheros\\prueba.dat", true);
			fos.write(67);
			fos.write(73);
			fos.write(67);
			fos.write(76);
			fos.write(79);
			fos.write(32);
			fos.write(68);
			fos.write(65);
			fos.write(77);
			fos.close();
		} catch (IOException e) {
			System.out.println("Ha ocurrido un error " + e.getMessage());
		}

	}
}
