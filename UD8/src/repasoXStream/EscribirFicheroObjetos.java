package repasoXStream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class EscribirFicheroObjetos {
	public static void main(String[] args) throws IOException {
		File fichero = new File("Ficheros/coches.dat");
		FileOutputStream fos = new FileOutputStream(fichero);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		String[] marca = { "Audi", "BMW", "Ford" };
		String[] modelo = { "RS3", "M3", "Focus" };
		String[] color = { "Negro", "Gris", "Azul" };
		for (int i = 0; i < marca.length; i++) {
			Coche c = new Coche(marca[i], modelo[i], color[i]);
			oos.writeObject(c);
		}
		oos.close();
	}

}
